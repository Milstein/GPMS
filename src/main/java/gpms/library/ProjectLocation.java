package gpms.library;

public class ProjectLocation extends ProjectInfo {
	private String _id;
	private boolean _offCampus;
	private boolean _onCampus;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public boolean is_offCampus() {
		return _offCampus;
	}

	public void set_offCampus(boolean _offCampus) {
		this._offCampus = _offCampus;
	}

	public boolean is_onCampus() {
		return _onCampus;
	}

	public void set_onCampus(boolean _onCampus) {
		this._onCampus = _onCampus;
	}
}
