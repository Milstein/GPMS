package gpms.DAL;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

import java.net.UnknownHostException;

public class DbManager {

    private static DB db;
    public static DB getDb (String name) throws UnknownHostException {
        Mongo mongo = new Mongo();
        if ( db == null){
            db = mongo.getDB(name);
        }
        return db;
    }

}
