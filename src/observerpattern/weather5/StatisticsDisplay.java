package observerpattern.weather5;

import java.util.Observable; //internal java packages
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(Observable observable) 
	{
		this.observable = observable; //get handle to Observable
		observable.addObserver(this); //give observable your handle
	}

	public void update (Observable obs, Object arg)
	{
		
		if (obs instanceof WeatherData)
		{
			float temp;
			WeatherData weatherData;
			
			weatherData = (WeatherData) obs;
			temp = weatherData.getTemperature();
			tempSum += temp;
			numReadings++;

			if (temp > maxTemp) {
				maxTemp = temp;
			}
	 
			if (temp < minTemp) {
				minTemp = temp;
			}
			display();		
		}
	}
	

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}

