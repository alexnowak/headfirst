package simuduck.behavior;
/**
 * Duck Simulator SumUDuck
 *  
 * From book "Head First Design Patterns"
 *  
 * Design Pattern:  Strategy Pattern
 *  
 * Concrete implementation of a quacking behavior
 * Simulating a "mute" duck
 *  
 * @author Alex
 *
 */
public class Mute implements QuackBehavior {

	/**
	 * 
	 */
	public Mute() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see simuduck.behavior.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		System.out.println("I am MUTE");


	}

}
