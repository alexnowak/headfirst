/**
 * 
 */
package weatherstation.observers;

import weatherstation.data.Subject;

/**
 * @author Alex
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private double temperature;
	private double humidity;
	private Subject weatherData;
	
	/**
	 * Constructor will register to the weather data object (the Subject)
	 * 
	 * @param weatherData Holds and updates weather data
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	/**
  	 * The display element shows the current measurements from the 
	 * WeatherData object.
	 * 
	 * @see weatherstation.observers.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.println("Current Conditions: "+temperature+"° Celsius " + humidity + "% humidity");
	}

	/**
	 * @see weatherstation.observers.Observer#update()
	 */
	@Override
	public void update(double temp, double humidity, double pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
}
