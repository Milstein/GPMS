package gpms.utils;

public class StatusType {
	private static String status[] = {"Proposal", "ProposalApprovedByChair", "ProposalApprovedByDirector", "Disapproved", "OfficalSubmit"};
	// Proposal stands for just submit
	// because a Chair cannot approve a proposal any more after the proposal is in status other than just submit
	// however, our access control policy currently does not have "Submit", instead, the string is "Proposal"
	
	public static enum Status {SUBMIT, APPROVED_CHAIR, APPROVED_DIRECTOR, DISAPPROVED, OFFICIAL_SUBMIT};
	
	public static String getStatusString(Status st) {
		switch(st){
		case SUBMIT:return status[0];
		case APPROVED_CHAIR:return status[1];
		case APPROVED_DIRECTOR:return status[2];
		case DISAPPROVED:return status[3];
		case OFFICIAL_SUBMIT: return status[4];
		default:return null;
		}
	}
}
