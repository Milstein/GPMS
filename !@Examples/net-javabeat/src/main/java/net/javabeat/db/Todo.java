package net.javabeat.db;

import java.util.Date;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity(value=TodoDAO.COLLECTION_NAME)
public class Todo {
   
    private String task;
    private Boolean completed = false;
    private Date added;
    private Date finished;
    @Id private ObjectId id;
    
	public Todo(String task,
                boolean completed,
                Date added,
                ObjectId id){
        this.task = task;
        this.completed = completed;
        this.added = added;
        this.setId(id);
    }

	public Todo(String task){
        this.task = task;
        this.added = new Date();
        this.completed = false;
    }
	
	public Todo(){
	}
    
    @Override
    public String toString(){
        return this.getAdded()+": "+this.getTask();
    }
   
    
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    
    public Boolean isCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    
    public Date getAdded() {
        return added;
    }
    public void setAdded(Date added) {
		this.added = added;
	}

    
    public Date getFinished() {
        return finished;
    }

    public void setFinished(Date finished) {
        this.finished = finished;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
