/**
 * 
 */
package headfirst.weatherstation.observers;

/**
 * @author Alex
 *
 */
public interface Observer {
	public void update(double temp, double humidity, double pressure);
}
