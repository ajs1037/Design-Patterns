package observerpattern.weather5;


import java.util.Observable; //internal java packages
import java.util.Observer;


public class ForecastDisplay implements Observer, DisplayElement {
	Observable observable;
	private float currentPressure = 29.92f;  
	private float lastPressure=0;
	private Subject weatherData;

	public ForecastDisplay(Observable observable)
	{
		this.observable = observable; //get handle to Observable
		observable.addObserver(this); //give observable your handle
	}
		
		public void update (Observable obs, Object arg)
		{
			/*this.temperature = temperature;
			this.humidity = humidity;
			display();
			*/
			
			if (obs instanceof WeatherData)
			{
				WeatherData weatherData;
				
				weatherData = (WeatherData) obs;
				lastPressure = currentPressure;
				this.currentPressure = weatherData.getPressure();
				display();		
			}
		}
		

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
