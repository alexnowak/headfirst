/**
 * Test harness for the WeatherStation app.
 * 
 * Glue together the code used by the weather station.
 * This app demonstrates the "Observer" design pattern.
 * 
 */
package weatherstation;

import weatherstation.data.WeatherData;
import weatherstation.observers.CurrentConditionsDisplay;
import weatherstation.observers.WeatherStatsDisplay;

/**
 * @author Alex
 *
 */
public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("WeatherStation TEST -------------------");
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		WeatherStatsDisplay  statsDisplay = new WeatherStatsDisplay(weatherData);

		// Add other display elements here (e.g. Statistics Display, etc)
		
		// Simulate new weather measurements
		weatherData.setMeasurements(10.0, 65, 30.4);
		weatherData.setMeasurements(11.0, 65.5, 33.4);
		weatherData.setMeasurements(11.0, 67.6, 33.4);
		
	}

}
