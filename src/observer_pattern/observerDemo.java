package observer_pattern;

public class observerDemo {
	public static void main( String args[] ) {
		Subject object = new Subject();
		
		/** No Change after setState **/
		object.setState(10);
		System.out.println();
		
		/** Only binary observer will Change after setState **/
		new BinaryObserver(object);
		object.setState(10);
		System.out.println();
		
		/** both binary and hex observers will Change after setState **/
		new HexObserver(object);
		object.setState(10);
		System.out.println();
		
		/** All observers will Change after setState **/
		new OctalObserver(object);
		object.setState(10);
		
	}
}
