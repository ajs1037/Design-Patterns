package observerpattern.weather5;


import java.util.Observable; //internal java packages
import java.util.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
	Observable observable;
	float heatIndex = 0.0f;
	private WeatherData weatherData;

	public HeatIndexDisplay(Observable observable) {
		this.observable = observable; //get handle to Observable
		observable.addObserver(this); //give observable your handle
	}

	public void update (Observable obs, Object arg)
	{
		if (obs instanceof WeatherData)
		{
			float t;
			float rh;
			WeatherData weatherData;
			
			weatherData = (WeatherData) obs;	
			t = weatherData.getTemperature();
			rh = weatherData.getHumidity();	
			heatIndex = computeHeatIndex(t, rh);
			display();		
		}
	}
	
	/*
	 * t - temperature
	 * rh - relative humidity
	 */
	private float computeHeatIndex(float t, float rh) {
		float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) 
			+ (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) 
			+ (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
			(0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 * 
			(rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) + 
			(0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
			0.000000000843296 * (t * t * rh * rh * rh)) -
			(0.0000000000481975 * (t * t * t * rh * rh * rh)));
		return index;
	}

	public void display() {
		System.out.println("Heat index is " + heatIndex);
	}
}