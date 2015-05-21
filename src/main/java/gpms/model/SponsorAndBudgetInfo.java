package gpms.model;

import java.util.ArrayList;

import org.bson.types.ObjectId;

public class SponsorAndBudgetInfo extends Proposal {
	private ObjectId _id;
	private ArrayList<String> _grantingAgency;
	private double _directCosts;
	private double _faCosts;
	private double _totalCosts;
	private double _faRate;

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public ArrayList<String> get_grantingAgency() {
		return _grantingAgency;
	}

	public void set_grantingAgency(ArrayList<String> _grantingAgency) {
		this._grantingAgency = _grantingAgency;
	}

	public double get_directCosts() {
		return _directCosts;
	}

	public void set_directCosts(double _directCosts) {
		this._directCosts = _directCosts;
	}

	public double get_faCosts() {
		return _faCosts;
	}

	public void set_faCosts(double _faCosts) {
		this._faCosts = _faCosts;
	}

	public double get_totalCosts() {
		return _totalCosts;
	}

	public void set_totalCosts(double _totalCosts) {
		this._totalCosts = _totalCosts;
	}

	public double get_faRate() {
		return _faRate;
	}

	public void set_faRate(double _faRate) {
		this._faRate = _faRate;
	}

}
