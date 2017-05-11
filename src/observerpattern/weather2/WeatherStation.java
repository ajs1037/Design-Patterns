package observerpattern.weather2;


/*
 * WeatherStation provides WeatherData with information on temperature, pressure and
 * humidity data.
 */
public class WeatherStation {

	public static void main (String[] args) {
		//create the WeatherData and CurrentDisplayCondition objects
		WeatherData weatherData;
		CurrentConditionsDisplay currentConditionsDisplay;
		
		//the Subject weatherData is created
		weatherData = new WeatherData();
		
		//instantiating currentConditionsDisplay will also register it as 
		//an Observer with weatherData
		currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		
		//change in weatherData will automatically lead to the Observers
		//being updated
		System.out.println("Set Measurements");
		weatherData.setMeasurements(80,  65, 30.4f);
		weatherData.setMeasurements(82,  70, 29.2f);
		weatherData.setMeasurements(78,  90, 29.2f);
		
		//Remove observers
		System.out.println("Remove Observers");
		currentConditionsDisplay.unRegister();
		
		//Set measurements after removing observers
		System.out.println("Set Measurements after removing observers");
		weatherData.setMeasurements(80,  65, 30.4f);
		weatherData.setMeasurements(82,  70, 29.2f);
		weatherData.setMeasurements(78,  90, 29.2f);	
	}
}
