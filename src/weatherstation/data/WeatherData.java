/**
 * 
 */
package weatherstation.data;

import java.util.ArrayList;

import weatherstation.observers.Observer;

/**
 * @author Alex
 *
 */
public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private double temperature;
	private double humidity;
	private double pressure;
	
	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}
	

	/**
	 * 
	 */
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	/* (non-Javadoc)
	 * @see weatherstation.Subject#registerObserver()
	 */
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	/* (non-Javadoc)
	 * @see weatherstation.Subject#removeObserver()
	 */
	@Override
	public boolean removeObserver(Observer o) {
		return observers.remove(o);
	}

	/**
	 * Tell all observer about state change 
	 * @see weatherstation.Subject#notifyObserver()
	 */
	@Override
	public void notifyObservers() {
		for (int i=0; i<observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(getTemperature(), 
						getHumidity(), 
						getPressure());
		}
	}
	
	/**
	 * Okay, I don't own an wifi/internet enabled weather station. So, rather than
	 * reading the actual weather data off a device, I'm going to use this method
	 * to test the display elements.
	 * Or, for fun, I could write code to grab the measurements off the web ....
	 * 
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	/**
	 * This method is being called by the weather station on measurement change.
	 * All observers will be notified.
	 */
	public void measurementsChanged() {
		notifyObservers();
	}

}
