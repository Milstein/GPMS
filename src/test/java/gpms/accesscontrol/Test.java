package gpms.accesscontrol;
import accesscontrol.Accesscontrol;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accesscontrol ac = new Accesscontrol();
		ac.initBalana();
		String decision = ac.getXACMLdecision("Co-PI", "Proposal","AllowsStaffView");
		System.out.println(decision);
	}

}
