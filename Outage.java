
public class Outage extends TownCell{

	public Outage(Town p, int r, int c) {
		super(p, r, c);
		this.state = State.OUTAGE;
	}

	@Override
	public State who() {
		// TODO Auto-generated method stub
		return this.state;
	}

	@Override
	public TownCell next(Town tNew) {
		// TODO Auto-generated method stub
		return null;
	}

}
