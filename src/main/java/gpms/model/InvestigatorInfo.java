package gpms.model;

import java.util.ArrayList;

import org.bson.types.ObjectId;

public class InvestigatorInfo extends Proposal {
	private ObjectId _id;
	private String _pi;
	private ArrayList<String> _copi;
	private ArrayList<String> _seniorPersonnel;

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String get_pi() {
		return _pi;
	}

	public void set_pi(String _pi) {
		this._pi = _pi;
	}

	public ArrayList<String> get_copi() {
		return _copi;
	}

	public void set_copi(ArrayList<String> _copi) {
		this._copi = _copi;
	}

	public ArrayList<String> get_seniorPersonnel() {
		return _seniorPersonnel;
	}

	public void set_seniorPersonnel(ArrayList<String> _seniorPersonnel) {
		this._seniorPersonnel = _seniorPersonnel;
	}

}
