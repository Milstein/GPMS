package gpms.library;

import java.util.ArrayList;

public class Proposal {
	private String _id;
	private String _proposalNo;
	private String _dateReceived;
	private String _proposalStatus;
	private ArrayList<InvestigatorInfo> _investigatorInfo;
	private ArrayList<ProjectInfo> _projectInfo;
	private ArrayList<SponsorAndBudgetInfo> _sponsorAndBudgetInfo;
	private ArrayList<CostShareInfo> _costShareInfo;

	// TODO: add more class object as per document
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String get_proposalNo() {
		return _proposalNo;
	}

	public void set_proposalNo(String _proposalNo) {
		this._proposalNo = _proposalNo;
	}

	public String get_dateReceived() {
		return _dateReceived;
	}

	public void set_dateReceived(String _dateReceived) {
		this._dateReceived = _dateReceived;
	}

	public String get_proposalStatus() {
		return _proposalStatus;
	}

	public void set_proposalStatus(String _proposalStatus) {
		this._proposalStatus = _proposalStatus;
	}

	public ArrayList<InvestigatorInfo> get_investigatorInfo() {
		return _investigatorInfo;
	}

	public void set_investigatorInfo(
			ArrayList<InvestigatorInfo> _investigatorInfo) {
		this._investigatorInfo = _investigatorInfo;
	}

	public ArrayList<ProjectInfo> get_projectInfo() {
		return _projectInfo;
	}

	public void set_projectInfo(ArrayList<ProjectInfo> _projectInfo) {
		this._projectInfo = _projectInfo;
	}

	public ArrayList<SponsorAndBudgetInfo> get_sponsorAndBudgetInfo() {
		return _sponsorAndBudgetInfo;
	}

	public void set_sponsorAndBudgetInfo(
			ArrayList<SponsorAndBudgetInfo> _sponsorAndBudgetInfo) {
		this._sponsorAndBudgetInfo = _sponsorAndBudgetInfo;
	}

	public ArrayList<CostShareInfo> get_costShareInfo() {
		return _costShareInfo;
	}

	public void set_costShareInfo(ArrayList<CostShareInfo> _costShareInfo) {
		this._costShareInfo = _costShareInfo;
	}

}
