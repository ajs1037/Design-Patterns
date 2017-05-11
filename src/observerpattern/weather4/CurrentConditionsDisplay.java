package observerpattern.weather4;


/*
 * This display implements Observer so that it can get changes
 * from the WeatherData object
 * 
 * It also implements DisplayElement, because our API is going to require
 * all display elements to implement this interface
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	/*
	 * The constructor is passed the WeatherData object (the Subject) 
	 * and we use it to register the display as an observer
	 * 
	 * this - refers to the current object, the Observer
	 */	
	public CurrentConditionsDisplay (Subject weatherData)
	{
		this.weatherData = weatherData;
		weatherData.registerObserver(this);

	}
	
	/*
	 * When update() is called, the temperature and and humidity is saved
	 * and display is called.
	 */
	public void update (float temperature, float humidity, float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		display();
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
		weatherData.removeObserver(this); 
	}
	
}
