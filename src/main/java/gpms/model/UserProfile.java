package gpms.model;

import gpms.DAL.UserProfileDAO;

import java.util.ArrayList;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity(value = UserProfileDAO.COLLECTION_NAME)
public class UserProfile extends UserAccount {
	@Id
	private ObjectId _id;
	private String _firstname;
	private String _middlename;
	private String _lastname;
	private ArrayList<PositionDetails> _details;
	private ArrayList<String> _phonenumber;
	private ArrayList<String> _email;

	public UserProfile(String firstname, String middlename, String lastname,
			ArrayList<PositionDetails> details, ArrayList<String> phonenumber,
			ArrayList<String> email, ObjectId id) {
		this._firstname = firstname;
		this._middlename = middlename;
		this._lastname = lastname;
		this._details = details;
		this._phonenumber = phonenumber;
		this._email = email;
		this.set_uid(id);

	}

	public UserProfile(String firstname, String middlename, String lastname) {
		this._firstname = firstname;
		this._middlename = middlename;
		this._lastname = lastname;
	}

	public UserProfile() {

	}

	public ObjectId get_uid() {
		return _id;
	}

	public void set_uid(ObjectId _id) {
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

	@Override
	public String toString() {
		return this.get_firstname() + " " + this.get_middlename() + " "
				+ this.get_lastname();
	}

}
