package gpms.DAL.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MongoDataBase.MongoDB;
import junit.framework.TestCase;

public class MongoDBConnectorTest extends TestCase {

	public MongoDBConnectorTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetMongoDBInstance() {
		MongoDB mdb = MongoDB.getMongoDBInstance();
		assertEquals(mdb, null);
	}

	public void testFindDBObjectDBObjectString() {
		assertEquals(1, false);
	}
}
