package observerpattern.weather4;

public interface Observer {
	
	//Implemented by all Observers
	//temperature, humidity and pressure are the state values that the Observers
	//get from the Subject when a weather measurement changes
	public void update (float temp, float humidity, float pressure);
}
