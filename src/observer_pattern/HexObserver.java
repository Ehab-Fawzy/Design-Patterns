package observer_pattern;

public class HexObserver extends observer {
	
	public HexObserver() {
		// TODO Auto-generated constructor stub
		observer.subject.insertObserver(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "Binary: " +  Integer.toHexString( observer.subject.getState() ) );
	}
}
