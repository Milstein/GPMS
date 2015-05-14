package gpms.library;

import java.util.ArrayList;

public class StaffObjects extends UserObjects {
	private int _id;
	private String _firstname;
	private String _middlename;
	private String _lastname;
	private ArrayList<PositionDetails> _details;
	private ArrayList<String> _phonenumber;
	private ArrayList<String> _email;

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_firstname() {
		return _firstname;
	}

	public void set_firstname(String _firstname) {
		this._firstname = _firstname;
	}

	public String get_middlename() {
		return _middlename;
	}

	public void set_middlename(String _middlename) {
		this._middlename = _middlename;
	}

	public String get_lastname() {
		return _lastname;
	}

	public void set_lastname(String _lastname) {
		this._lastname = _lastname;
	}

	public ArrayList<PositionDetails> get_details() {
		return _details;
	}

	public void set_details(ArrayList<PositionDetails> _details) {
		this._details = _details;
	}

	public ArrayList<String> get_phonenumber() {
		return _phonenumber;
	}

	public void set_phonenumber(ArrayList<String> _phonenumber) {
		this._phonenumber = _phonenumber;
	}

	public ArrayList<String> get_email() {
		return _email;
	}

	public void set_email(ArrayList<String> _email) {
		this._email = _email;
	}

}
