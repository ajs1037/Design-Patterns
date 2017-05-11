package observerpattern.weather2;

import java.util.ArrayList;

/* WeatherData class is the subject in the Observer pattern that enrolls the Objects
 * 
 */

public class WeatherData implements Subject{
	//track all the observers
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData()
	{
		observers = new ArrayList();
	}
	
	//Register an observer
	public void registerObserver(Observer o)
	{
		observers.add(o);
	}
	
	//Remove the observer
	public void removeObserver (Observer o)
	{
		int i= observers.indexOf(o);
		if (i >= 0)
		{
			observers.remove(o);
		}
	}
	
	//Notify the observers
	public void notifyObservers()
	{
		Observer observer;
		
		for (int i=0; i < observers.size(); i++)
		{
			observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	//If measurements changes then observers need to be notified
	public void measurementsChanged()
	{
		notifyObservers();
	}
	
	//Set the temperature, humidity and pressure
	public void setMeasurements(float temperature, float humidity, float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		//Measurements have changed, trigger the method to notify the observers
		measurementsChanged();
	}
	
	//Other methods can be added
}
