package gpms.library;

import java.util.Date;

public class ProjectPeriod extends ProjectInfo {
	private String _id;
	private Date _from;
	private Date _to;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Date get_from() {
		return _from;
	}

	public void set_from(Date _from) {
		this._from = _from;
	}

	public Date get_to() {
		return _to;
	}

	public void set_to(Date _to) {
		this._to = _to;
	}
}
