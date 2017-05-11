package observerpattern.weather5;

import java.util.Observable; //internal java packages
import java.util.Observer;

/*
 * This display implements Observer so that it can get changes
 * from the WeatherData object
 * 
 * It also implements DisplayElement, because our API is going to require
 * all display elements to implement this interface
 */
//Oberver class from java.util is used instead of our Obeserver class
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable; // need access to the subject
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	/*
	 * The constructor class takes in an Observable in order to access the Subject
	 */	
	public CurrentConditionsDisplay (Observable observable) {
		this.observable = observable; //get handle to Observable
		observable.addObserver(this); //give observable your handle
	}
	
	/*
	 *
	 */
	//public void update (float temperature, float humidity, float pressure)
	public void update (Observable obs, Object arg) {
		/*this.temperature = temperature;
		this.humidity = humidity;
		display();
		*/		
		if (obs instanceof WeatherData) {
			WeatherData weatherData;
			
			weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();		
		}	
	}
	
	/*
	 * The display() method prints the most recent temperature and humidity
	 */
	public void display()
	{
		System.out.println("Current conditions: " + temperature +
				"F degrees and " + humidity + "% humidity");
	}
	
	/*
	 * Unregister the observer
	 */
	public void unRegister ()
	{
		observable.deleteObserver(this);
	}
	
}
