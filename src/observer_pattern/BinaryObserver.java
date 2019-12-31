package observer_pattern;

public class BinaryObserver extends observer {
	
	public BinaryObserver() {
		// TODO Auto-generated constructor stub
		observer.subject.insertObserver(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "Binary: " +  Integer.toBinaryString( observer.subject.getState() ) );
	}

}
