package gpms.model;

import java.util.Date;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Id;

public class ProjectInfo extends Proposal {
	@Id private ObjectId _id;
	private String _projectTitle;
	// private ArrayList<ProjectType> _projectType;
	private boolean _researchBasic;
	private boolean _researchApplied;
	private boolean _researchDevelopment;
	private boolean _instruction;
	private boolean _otherSponsoredActivity;
	// private ArrayList<RequestType> _requestType;
	private boolean _preProposal;
	private boolean _newProposal;
	private boolean _continuation;
	private boolean _supplement;
	private Date _dueDate;
	// private ArrayList<ProjectPeriod> _projectPeriod;
	private Date _from;
	private Date _to;
	// private ArrayList<ProjectLocation> _projectLocation;
	private boolean _offCampus;
	private boolean _onCampus;

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String get_projectTitle() {
		return _projectTitle;
	}

	public void set_projectTitle(String _projectTitle) {
		this._projectTitle = _projectTitle;
	}

	// public ArrayList<ProjectType> get_projectType() {
	// return _projectType;
	// }
	//
	// public void set_projectType(ArrayList<ProjectType> _projectType) {
	// this._projectType = _projectType;
	// }

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

	//
	// public ArrayList<RequestType> get_requestType() {
	// return _requestType;
	// }
	//
	// public void set_requestType(ArrayList<RequestType> _requestType) {
	// this._requestType = _requestType;
	// }

	public boolean is_preProposal() {
		return _preProposal;
	}

	public void set_preProposal(boolean _preProposal) {
		this._preProposal = _preProposal;
	}

	public boolean is_newProposal() {
		return _newProposal;
	}

	public void set_newProposal(boolean _newProposal) {
		this._newProposal = _newProposal;
	}

	public boolean is_continuation() {
		return _continuation;
	}

	public void set_continuation(boolean _continuation) {
		this._continuation = _continuation;
	}

	public boolean is_supplement() {
		return _supplement;
	}

	public void set_supplement(boolean _supplement) {
		this._supplement = _supplement;
	}

	public Date get_dueDate() {
		return _dueDate;
	}

	public void set_dueDate(Date _dueDate) {
		this._dueDate = _dueDate;
	}

	// public ArrayList<ProjectPeriod> get_projectPeriod() {
	// return _projectPeriod;
	// }
	//
	// public void set_projectPeriod(ArrayList<ProjectPeriod> _projectPeriod) {
	// this._projectPeriod = _projectPeriod;
	// }

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

	// public ArrayList<ProjectLocation> get_projectLocation() {
	// return _projectLocation;
	// }
	//
	// public void set_projectLocation(ArrayList<ProjectLocation>
	// _projectLocation) {
	// this._projectLocation = _projectLocation;
	// }

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
