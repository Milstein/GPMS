package net.javabeat.db;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.*;

import org.bson.types.ObjectId;
import java.net.UnknownHostException;
import java.util.*;

public class TodoDAO {
    
	private static final String DBNAME = "todoapp";
    public static final String COLLECTION_NAME = "todo";
	
    private static Morphia morphia;
    private static Mongo mongo;
    private static Datastore ds;
    private static Morphia getMorphia() 
    		throws UnknownHostException, MongoException{
    	if ( morphia == null){
    		morphia = new Morphia().map(Todo.class);
    	}
		return morphia;
    }
    
    private static Mongo getMongo() 
    		throws UnknownHostException, MongoException{
    	if ( mongo == null){
    		mongo = new Mongo();
    	}
    	return mongo;
    }
    
    private static Datastore getDatastore() 
    		throws UnknownHostException, MongoException{
    	if ( ds == null){
    		ds = getMorphia().createDatastore(getMongo(), DBNAME);
    	}
    	return ds;
    }

    public static void saveTodo(Todo todo) throws UnknownHostException{
    	Morphia morphia = getMorphia();
    	Datastore ds = morphia.createDatastore(getMongo(), DBNAME);
    	ds.save(todo);
    }

    public static List<Todo> getAllTodos() throws UnknownHostException{
    	
    	Datastore ds = getDatastore();    	
    	return ds.createQuery(Todo.class).asList();

    }
    
    public static List<Todo> getOpenTodos() throws UnknownHostException{
    	return getDatastore().createQuery(Todo.class)
    			.field("completed")
    			.equal(Boolean.FALSE)
    			.asList();
    }

    public static void setTodoAsCompleted(Todo todoRef) throws UnknownHostException{
    	
    	getDatastore().update(
    			getDatastore().createQuery(Todo.class)
    			.field("id")
    			.equal(todoRef.getId()),
    			getDatastore().createUpdateOperations(Todo.class)
    			.set("completed", Boolean.TRUE)
    			);
    }
}
