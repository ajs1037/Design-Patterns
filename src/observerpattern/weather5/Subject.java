package observerpattern.weather5;

import java.util.Observer;

public interface Subject {
	
	//register an observer
	public void registerObserver(Observer o);
	
	//remove an observer
	public void removeObserver(Observer o);
	
	//notify all registered observers
	public void notifyObservers();
	

}
