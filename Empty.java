public class Empty extends TownCell {

	public Empty(Town p, int r, int c) {
		super(p, r, c);
		this.state = State.EMPTY;
		// TODO Auto-generated constructor stub
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
