/**
 * 
 */
package headfirst.gumball;

/**
 * @author Alex
 *
 */
public interface State {
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
}
