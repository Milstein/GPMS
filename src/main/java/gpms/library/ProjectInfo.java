package gpms.library;

import java.util.ArrayList;
import java.util.Date;

public class ProjectInfo extends ProposalObjects {
	private String _id;
	private String _projectTitle;
	private ArrayList<ProjectType> _projectType;
	private ArrayList<RequestType> _requestType;
	private Date _dueDate;
	private ArrayList<ProjectPeriod> _projectPeriod;
	private ArrayList<ProjectLocation> _projectLocation;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String get_projectTitle() {
		return _projectTitle;
	}

	public void set_projectTitle(String _projectTitle) {
		this._projectTitle = _projectTitle;
	}

	public ArrayList<ProjectType> get_projectType() {
		return _projectType;
	}

	public void set_projectType(ArrayList<ProjectType> _projectType) {
		this._projectType = _projectType;
	}

	public ArrayList<RequestType> get_requestType() {
		return _requestType;
	}

	public void set_requestType(ArrayList<RequestType> _requestType) {
		this._requestType = _requestType;
	}

	public Date get_dueDate() {
		return _dueDate;
	}

	public void set_dueDate(Date _dueDate) {
		this._dueDate = _dueDate;
	}

	public ArrayList<ProjectPeriod> get_projectPeriod() {
		return _projectPeriod;
	}

	public void set_projectPeriod(ArrayList<ProjectPeriod> _projectPeriod) {
		this._projectPeriod = _projectPeriod;
	}

	public ArrayList<ProjectLocation> get_projectLocation() {
		return _projectLocation;
	}

	public void set_projectLocation(ArrayList<ProjectLocation> _projectLocation) {
		this._projectLocation = _projectLocation;
	}

}
