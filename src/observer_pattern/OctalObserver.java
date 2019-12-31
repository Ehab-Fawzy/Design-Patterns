package observer_pattern;

public class OctalObserver extends observer {
	public OctalObserver() {
		// TODO Auto-generated constructor stub
		observer.subject.insertObserver(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "Binary: " +  Integer.toOctalString( observer.subject.getState() ) );
	}
}
