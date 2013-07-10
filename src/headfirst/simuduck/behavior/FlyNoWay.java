package headfirst.simuduck.behavior;
/**
 * Duck Simulator SumUDuck
 *  
 * From book "Head First Design Patterns"
 *  
 * Design Pattern:  Strategy Pattern
 *  
 * Concrete implementation of a fly algorithm
 * Type: Grounded duck (aka no fly)
 *  
 * @author Alex
 *
 */
public class FlyNoWay implements FlyBehavior {

	/**
	 * 
	 */
	public FlyNoWay() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see headfirst.simuduck.behavior.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I can't fly. Whammy!");

	}

}
