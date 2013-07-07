/**
 *  Duck Simulator SumUDuck
 *  
 *  From book "Head First Design Patterns"
 *  
 *  Design Pattern:  Strategy Pattern
 *  
 *  Concrete implementation Mallard Duck
 *  That duck can fly with wings and also quacks
 *  
 */
package simuduck.ducktypes;

import simuduck.Duck;
import simuduck.behavior.FlyWithWings;
import simuduck.behavior.Quack;

/**
 * @author Alex
 *
 */
public class MallardDuck extends Duck {

	/**
	 * 
	 */
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		
	}

	/* (non-Javadoc)
	 * @see simuduck.Duck#swim()
	 */
	@Override
	public void swim() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see simuduck.Duck#display()
	 */
	@Override
	public void display() {
		System.out.println("I am a real Mallard Duck.");

	}

}
