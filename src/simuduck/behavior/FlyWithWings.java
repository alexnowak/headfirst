package simuduck.behavior;
/**
 * Duck Simulator SumUDuck
 *  
 * From book "Head First Design Patterns"
 *  
 * Design Pattern:  Strategy Pattern
 *  
 * Concrete implementation of a fly algorithm
 * Type: Flying duck
 *  
 * @author Alex
 *
 */
public class FlyWithWings implements FlyBehavior {

	public FlyWithWings() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("I fly with WINGS");

	}

}
