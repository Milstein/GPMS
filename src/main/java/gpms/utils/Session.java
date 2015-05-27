package gpms.utils;

public class Session {
	public static String ID;
	public static RoleType.TypeNum Role;
	public static String mongoID;     // id in mongodb
	
	public static Session session = null;
	
	private Session(String ID, RoleType.TypeNum Role, String id) {
		Session.ID = ID;
		Session.Role = Role;
		Session.mongoID = id;
	}
	
	public static Session getSessionInstance() {
		return session;
	}
	public static void buildSession(String ID, RoleType.TypeNum Role, String id) {
		if(session == null){
			synchronized (Session.class) {
				if(session == null) {
					session = new Session(ID, Role, id);
				}
			}
		}
	}
}
