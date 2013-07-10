package headfirst.simuduck.behavior;
/**
 * Duck Simulator SumUDuck
 *  
 * From book "Head First Design Patterns"
 *  
 * Design Pattern:  Strategy Pattern
 *  
 * Concrete implementation of a quacking behavior
 * Simulating a "quacking" duck
 *  
 * @author Alex
 *
 */
public class Quack implements QuackBehavior {

	/**
	 * 
	 */
	public Quack() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see headfirst.simuduck.behavior.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Quack Quack...");				

	}

}
