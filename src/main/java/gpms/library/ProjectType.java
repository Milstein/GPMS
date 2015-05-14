package gpms.library;

public class ProjectType extends ProjectInfo {
	private String _id;
	private boolean _researchBasic;
	private boolean _researchApplied;
	private boolean _researchDevelopment;
	private boolean _instruction;
	private boolean _otherSponsoredActivity;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public boolean is_researchBasic() {
		return _researchBasic;
	}

	public void set_researchBasic(boolean _researchBasic) {
		this._researchBasic = _researchBasic;
	}

	public boolean is_researchApplied() {
		return _researchApplied;
	}

	public void set_researchApplied(boolean _researchApplied) {
		this._researchApplied = _researchApplied;
	}

	public boolean is_researchDevelopment() {
		return _researchDevelopment;
	}

	public void set_researchDevelopment(boolean _researchDevelopment) {
		this._researchDevelopment = _researchDevelopment;
	}

	public boolean is_instruction() {
		return _instruction;
	}

	public void set_instruction(boolean _instruction) {
		this._instruction = _instruction;
	}

	public boolean is_otherSponsoredActivity() {
		return _otherSponsoredActivity;
	}

	public void set_otherSponsoredActivity(boolean _otherSponsoredActivity) {
		this._otherSponsoredActivity = _otherSponsoredActivity;
	}

}
