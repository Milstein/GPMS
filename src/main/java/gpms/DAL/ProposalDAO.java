package gpms.DAL;

import gpms.library.Proposal;
import gpms.library.UserAccount;

import java.net.UnknownHostException;
import java.util.List;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class ProposalDAO {
	private static final String DBNAME = "GPMS";
	public static final String COLLECTION_NAME = "proposal";

	private static Morphia morphia;
	private static Mongo mongo;
	private static Datastore ds;

	private static Morphia getMorphia() throws UnknownHostException,
			MongoException {
		if (morphia == null) {
			morphia = new Morphia().map(Proposal.class);
		}
		return morphia;
	}

	private static Mongo getMongo() throws UnknownHostException, MongoException {
		if (mongo == null) {
			mongo = new Mongo("127.0.0.1:27017");
			// Mongo mongo = new Mongo(new
			// MongoURI("mongodb://localhost/mjormIsFun"));
			// mongodb://db1.example.net,db2.example.net:2500/?replicaSet=test
			// mongodb://[username:password@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database][?options]]
		}
		return mongo;
	}

	private static Datastore getDatastore() throws UnknownHostException,
			MongoException {
		if (ds == null) {
			ds = getMorphia().createDatastore(getMongo(), DBNAME);
		}
		return ds;
	}

	public static void saveProposal(Proposal proposal)
			throws UnknownHostException {
		Morphia morphia = getMorphia();
		Datastore ds = morphia.createDatastore(getMongo(), DBNAME);
		ds.save(proposal);
	}

	public static List<Proposal> getAllProposals() throws UnknownHostException {
		Datastore ds = getDatastore();
		return ds.createQuery(Proposal.class).asList();
	}
}
