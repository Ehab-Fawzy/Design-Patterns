package observer_pattern;

public class BinaryObserver extends observer {
	
	public BinaryObserver( Subject object ) {
		// TODO Auto-generated constructor stub
		this.subject = object;
		this.subject.insertObserver(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "Binary: " +  Integer.toBinaryString( this.subject.getState() ) );
	}

}
