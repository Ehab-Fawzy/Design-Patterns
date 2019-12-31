package observer_pattern;

import java.util.ArrayList;

public class Subject {
	private ArrayList<observer> listOfObserver = new ArrayList<observer>();
	private Integer State;

	public void insertObserver( observer object ) {
		this.listOfObserver.add(object);
	}
	
	public void setState( Integer _state ) {
		this.State = _state;
		notifyAllObservers();
	}
	
	public void notifyAllObservers() {
		for (observer _observer : listOfObserver) {
			_observer.update();
		}
	}
	
	public Integer getState() {
		return this.State;
	}
}
