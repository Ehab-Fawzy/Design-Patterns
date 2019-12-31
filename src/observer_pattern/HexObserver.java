package observer_pattern;

public class HexObserver extends observer {
	
	public HexObserver( Subject object ) {
		// TODO Auto-generated constructor stub
		this.subject = object;
		this.subject.insertObserver(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "Binary: " +  Integer.toHexString( this.subject.getState() ) );
	}
}
