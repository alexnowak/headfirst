/**
 *  Duck Simulator SumUDuck
 *  
 *  From book "Head First Design Patterns"
 *  
 *  Design Pattern:  Strategy Pattern
 *  
 *  Main class containing stuff that don't change
 *  in sub-classes (different duck types)
 *  as well as interchangeable behaviors for flying and quacking.
 *  
 */


package headfirst.simuduck;

import headfirst.simuduck.behavior.FlyBehavior;
import headfirst.simuduck.behavior.QuackBehavior;

/**
 * @author Alex
 *
 */
public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	/**
	 * 
	 */
	public Duck() {
		// TODO Auto-generated constructor stub
	}

	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public abstract void swim();
	public abstract void display();
	
}
