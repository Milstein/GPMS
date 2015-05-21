package gpms.DAL;

import gpms.model.Proposal;

import java.net.UnknownHostException;
import java.util.List;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.MongoException;

public class ProposalDAO {
	private static final String DBNAME = "GPMS";
	public static final String COLLECTION_NAME = "proposal";

	private static Morphia morphia;
	private static Datastore ds;

	private static Morphia getMorphia() throws UnknownHostException,
			MongoException {
		if (morphia == null) {
			morphia = new Morphia().map(Proposal.class);
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

	public static void saveProposal(Proposal proposal)
			throws UnknownHostException {
		Morphia morphia = getMorphia();
		Datastore ds = morphia.createDatastore(MongoDBConnector.getMongo(), DBNAME);
		ds.save(proposal);
	}

	public static List<Proposal> getAllProposals() throws UnknownHostException {
		Datastore ds = getDatastore();
		return ds.createQuery(Proposal.class).asList();
	}
}
