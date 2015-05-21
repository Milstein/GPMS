package gpms.DAL;

import gpms.model.UserAccount;

import java.net.UnknownHostException;
import java.util.List;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.MongoException;

public class UserDAO {
	private static final String DBNAME = "GPMS";
	public static final String COLLECTION_NAME = "user";

	private static Morphia morphia;	
	private static Datastore ds;

	private static Morphia getMorphia() throws UnknownHostException,
			MongoException {
		if (morphia == null) {
			morphia = new Morphia().map(UserAccount.class);
		}
		return morphia;
	}
	
	private static Datastore getDatastore() throws UnknownHostException,
			MongoException {
		if (ds == null) {
			ds = getMorphia().createDatastore(MongoDBConnector.getMongo(), DBNAME);
		}
		return ds;
	}

	public static void saveUserAccount(UserAccount userAccount)
			throws UnknownHostException {
		Morphia morphia = getMorphia();
		Datastore ds = morphia.createDatastore(MongoDBConnector.getMongo(), DBNAME);
		ds.save(userAccount);
	}

	public static List<UserAccount> getAllUserAccounts()
			throws UnknownHostException {
		Datastore ds = getDatastore();
		return ds.createQuery(UserAccount.class).asList();
	}
}
