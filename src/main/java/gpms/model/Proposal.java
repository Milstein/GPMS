package gpms.model;

import gpms.DAL.ProposalDAO;

import java.util.ArrayList;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity(value = ProposalDAO.COLLECTION_NAME)
public class Proposal {
	@Id
	private ObjectId _id;
	private String _proposalNo;
	private String _dateReceived;
	private String _proposalStatus;
	@Reference("investigatorInfo")
	private ArrayList<InvestigatorInfo> _investigatorInfo;
	@Reference("projectInfo")
	private ArrayList<ProjectInfo> _projectInfo;
	@Reference("sponsorAndBudgetInfo")
	private ArrayList<SponsorAndBudgetInfo> _sponsorAndBudgetInfo;
	@Reference("costShareInfo")
	private ArrayList<CostShareInfo> _costShareInfo;

	public Proposal(String proposalNo, String dateReceived,
			String proposalStatus,
			ArrayList<InvestigatorInfo> investigatorInfo,
			ArrayList<ProjectInfo> projectInfo,
			ArrayList<SponsorAndBudgetInfo> sponsorAndBudgetInfo,
			ArrayList<CostShareInfo> costShareInfo, ObjectId id) {
		this._proposalNo = proposalNo;
		this._dateReceived = dateReceived;
		this._proposalStatus = proposalStatus;

		// TODO:: need to do in loop of the list object
		this._investigatorInfo = investigatorInfo;
		this._projectInfo = projectInfo;
		this._sponsorAndBudgetInfo = sponsorAndBudgetInfo;
		this._costShareInfo = costShareInfo;
		this.set_id(id);

	}

	public Proposal(String proposalNo, String dateReceived,
			String proposalStatus) {
		this._proposalNo = proposalNo;
		this._dateReceived = dateReceived;
		this._proposalStatus = proposalStatus;
	}

	public Proposal() {

	}

	// TODO: add more class object as per document
	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
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

	@Override
	public String toString() {
		return this.get_proposalNo() + " " + this.get_dateReceived() + " "
				+ this.get_proposalStatus();
	}
}
