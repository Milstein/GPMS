package gpms.library;

import java.util.ArrayList;

public class UserAccount {
	private String _id;
	private String _username;
	private String _password;

	public String get_uid() {
		return _id;
	}

	public void set_uid(String _id) {
		this._id = _id;
	}

	public String get_username() {
		return _username;
	}

	public void set_username(String _username) {
		this._username = _username;
	}

	public String get_password() {
		return _password;
	}

	public void set_password(String _password) {
		this._password = _password;
	}
}
