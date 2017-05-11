package observerpattern.weather3;

public interface Subject {
	
	//register an observer
	public void registerObserver(Observer o);
	
	//remove an observer
	public void removeObserver(Observer o);
	
	//notify all registered observers
	public void notifyObservers();
	

}
