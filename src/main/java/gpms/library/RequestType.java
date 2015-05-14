package gpms.library;

public class RequestType extends ProjectInfo {
	private int _id;
	private boolean _preProposal;
	private boolean _newProposal;
	private boolean _continuation;
	private boolean _supplement;

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

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
}
