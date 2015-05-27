package gpms.utils;

import gpms.DAL.MongoDBConnector;

import java.util.ArrayList;

import MongoDataBase.MongoDB;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class RoleType {
	static public String roles[] = { "Faculty", "Instructor", "Chair", "Staff",
			"Director" };

	public static enum TypeNum {
		FACULTY, INSTRUCTOR, CHAIR, STAFF, DIRECTOR, INVALIDTYPE;
	}

	DBObject object_user;
	DBObject object_proposal;
	Object _id;
	MongoDBConnector mongoDb = MongoDBConnector.getMongoDBInstance();
	String PIORCOPI;

	public static TypeNum getType(String roleName) {
		for (int i = 0; i < roles.length; ++i) {
			if (roles[i].equals(roleName)) {
				switch (i) {
				case 0:
					return TypeNum.FACULTY;
				case 1:
					return TypeNum.INSTRUCTOR;
				case 2:
					return TypeNum.CHAIR;
				case 3:
					return TypeNum.STAFF;
				case 4:
					return TypeNum.DIRECTOR;
				default:
					return TypeNum.INVALIDTYPE;
				}
			}
		}
		return TypeNum.INVALIDTYPE;
	}

	public static String getRoleName(TypeNum typeName) {
		switch (typeName) {
		case FACULTY:
			return roles[0];
		case INSTRUCTOR:
			return roles[1];
		case CHAIR:
			return roles[2];
		case STAFF:
			return roles[3];
		case DIRECTOR:
			return roles[4];
		default:
			return null;
		}
	}

	public String JudgeUsername(String proposal_ID) {
		DBObject refs_proposal = new BasicDBObject();
		DBObject refs_user = new BasicDBObject();
		refs_proposal.put("ID", proposal_ID);
		DBCursor cursor_proposal = mongoDb
				.find(refs_proposal, null, "proposal");
		refs_user.put("ID", Session.ID);
		DBCursor cursor_user = mongoDb.find(refs_user, null, "user");
		while (cursor_user.hasNext()) {
			object_user = cursor_user.next();
			_id = object_proposal.get("_id");

		}
		while (cursor_proposal.hasNext()) {
			object_proposal = cursor_proposal.next();
			if (object_proposal.get("PI").equals(_id)) {
				this.PIORCOPI = "PI";
			} else if (object_proposal.get("Co-PI").equals(_id)) {
				this.PIORCOPI = "Co-PI";
			} else {
				this.PIORCOPI = "NULL";
			}

		}
		return PIORCOPI;
	}
}
