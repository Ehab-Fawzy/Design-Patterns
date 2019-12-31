package observer_pattern;

public class observerDemo {
	public static void main( String args[] ) {
		Subject object = observer.subject;
		
		/** No Change after setState **/
		object.setState(10);
		System.out.println();
		
		/** Only binary observer will Change after setState **/
		new BinaryObserver();
		object.setState(10);
		System.out.println();
		
		/** both binary and hex observers will Change after setState **/
		new HexObserver();
		object.setState(10);
		System.out.println();
		
		/** All observers will Change after setState **/
		new OctalObserver();
		object.setState(10);
		
	}
}
