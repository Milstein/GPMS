package gpms.DAL;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

import java.net.UnknownHostException;

public class DbManager {

	private static DB db;

	public static DB getDb(String name) throws UnknownHostException {
		Mongo mongo = new Mongo();
		if (db == null) {
			db = mongo.getDB(name);
		}
		return db;
	}

	private static Mongo mongo;

	public static Mongo getMongo() throws UnknownHostException, MongoException {
		if (mongo == null) {
			mongo = new Mongo("127.0.0.1:27017");
			// Mongo mongo = new Mongo(new
			// MongoURI("mongodb://localhost/mjormIsFun"));
			// mongodb://db1.example.net,db2.example.net:2500/?replicaSet=test
			// mongodb://[username:password@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database][?options]]
		}
		return mongo;
	}

}
