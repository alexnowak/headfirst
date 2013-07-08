/**
 * 
 */
package weatherstation.observers;

import java.util.ArrayList;
import java.util.Date;

import weatherstation.data.Subject;

/**
 * @author Alex
 *
 */
public class WeatherStatsDisplay implements Observer, DisplayElement {
	private ArrayList<DataPoint> stats;
	private Subject weatherData;
	private double avrgTemp, avrgHumidity, avrgPressure;
	
	/**
	 * Constructor will register to the weather data object (the Subject)
	 * 
	 * @param weatherData Holds and updates weather data
	 */
	public WeatherStatsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
		stats = new ArrayList<DataPoint>();
	}

	/**
  	 * The display element shows the current measurements from the 
	 * WeatherData object.
	 * 
	 * @see weatherstation.observers.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.println("Weather Stats: Averages ("+stats.size()+" readings) - Temp: "+avrgTemp+"° Celsius, Humidity: " 
					+ avrgHumidity + "%, Pressure: " + avrgPressure + " mbar");
	}

	/**
	 * @see weatherstation.observers.Observer#update()
	 */
	@Override
	public void update(double temp, double humidity, double pressure) {
		DataPoint dp = new DataPoint(new Date(),temp, humidity,pressure);
		stats.add(dp);
		calculateAverages();
		display();
	}
	
	private void calculateAverages() {
		avrgTemp = 0;
		avrgHumidity =0;
		avrgPressure =0;
		
		if (stats.size() < 1)
			return; // no data available
		
		for (int i=0; i<stats.size(); i++) {
			DataPoint dp = stats.get(i);
			avrgTemp += dp.getTemperature(); 
			avrgHumidity +=	dp.getHumidity();
			avrgPressure += dp.getPressure();
		}
		avrgTemp 		/= stats.size();
		avrgHumidity 	/= stats.size();
		avrgPressure 	/= stats.size();
	}

	private class DataPoint {
		private Date dataDate;
		private double temperature, humidity, pressure;
		
		public Date getDataDate() {
			return dataDate;
		}

		public double getTemperature() {
			return temperature;
		}

		public double getHumidity() {
			return humidity;
		}

		public double getPressure() {
			return pressure;
		}

		public DataPoint(Date dataDate, double temperature, double humidity, double pressure) {
			this.dataDate = dataDate;
			this.temperature = temperature;
			this.humidity = humidity;
			this.pressure = pressure;
		}
	}
}
