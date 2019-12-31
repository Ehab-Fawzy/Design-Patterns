package observer_pattern;

public abstract class observer {
	protected static Subject subject = new Subject();
	public abstract void update();
}
