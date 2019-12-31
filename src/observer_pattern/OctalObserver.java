package observer_pattern;

public class OctalObserver extends observer {
	public OctalObserver( Subject object ) {
		// TODO Auto-generated constructor stub
		this.subject = object;
		this.subject.insertObserver(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "Binary: " +  Integer.toOctalString( this.subject.getState() ) );
	}
}
