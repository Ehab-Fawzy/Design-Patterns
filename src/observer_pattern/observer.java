package observer_pattern;

public abstract class observer {
	protected Subject subject = new Subject();
	public abstract void update();
}
