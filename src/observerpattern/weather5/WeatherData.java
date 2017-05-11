package observerpattern.weather5;

import java.util.Observable; //internal java packages
import java.util.Observer;

//import java.util.ArrayList;

/* WeatherData class is the subject in the Observer pattern that enrolls the Objects
 * 
 */

//public class WeatherData implements Subject{
//subclassing Observable and not Subject
public class WeatherData extends Observable {
	//track all the observers
	//private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		//Not needed as the Obervable class keeps track of the observers
		//observers = new ArrayList();
	}
	
	//Register an observer
	/*public void registerObserver(Observer o)
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
	*/
	
	//If measurements changes then observers need to be notified
	public void measurementsChanged()
	{
		//setchanged is called before observers are notified
		setChanged(); 
		//notifyObervers is not using the previously implemented method to 
		//go through each registered observer an calling it with the relevent 
		//data. The obervers will pull the data.
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
	
	//Get the temperature for the pull from Observers
	public float getTemperature()
	{
		return temperature;
	}
	
	//Get the humidity for the pull from Observers
	public float getHumidity()
	{
		return humidity;
	}
	
	//Get the pressure for the pull from Observers
	public float getPressure()
	{
		return pressure;
	}
}
