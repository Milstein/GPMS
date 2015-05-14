package gpms.library;

import java.util.ArrayList;

public class InvestigatorInfo extends ProposalObjects {
	private String _id;
	private String _pi;
	private ArrayList<String> _copi;
	private ArrayList<String> _seniorPersonnel;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
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
