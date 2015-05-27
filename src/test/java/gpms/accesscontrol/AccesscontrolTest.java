package gpms.accesscontrol;

import accesscontrol.Accesscontrol;
import junit.framework.TestCase;

public class AccesscontrolTest extends TestCase {

	public AccesscontrolTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	protected void testAccessControl() {
		Accesscontrol ac = new Accesscontrol();
		ac.initBalana();
		String decision = ac.getXACMLdecision("Co-PI", "Proposal",
				"AllowsStaffView");
		System.out.println(decision);
	}

}
