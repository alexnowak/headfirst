/**
 * 
 */
package headfirst.weatherstation.data;

import headfirst.weatherstation.observers.Observer;

/**
 * @author Alex
 *
 */
public interface Subject {

	/**
	 * Register an observer
	 * @param o Observer
	 */
	public void registerObserver(Observer o);
	
	/**
	 * Remove an observer
	 * 
	 * @param o Observer
	 */
	public boolean removeObserver(Observer o);
	/**
	 * This method is called to notify all registered observers
	 * when the Subject's state has changed 
	 */
	public void notifyObservers();
}
