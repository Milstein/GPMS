package gpms.library;

public class PositionDetails extends StaffObjects {
	private int _id;
	private String _positiontype;
	private String _positiontitle;
	private String _department;
	private String _college;

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_positiontype() {
		return _positiontype;
	}

	public void set_positiontype(String _positiontype) {
		this._positiontype = _positiontype;
	}

	public String get_positiontitle() {
		return _positiontitle;
	}

	public void set_positiontitle(String _positiontitle) {
		this._positiontitle = _positiontitle;
	}

	public String get_department() {
		return _department;
	}

	public void set_department(String _department) {
		this._department = _department;
	}

	public String get_college() {
		return _college;
	}

	public void set_college(String _college) {
		this._college = _college;
	}

}
