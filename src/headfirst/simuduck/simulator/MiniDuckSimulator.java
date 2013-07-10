/**
 *  Duck Simulator SumUDuck
 *  
 *  From book "Head First Design Patterns"
 *  
 *  Design Pattern:  Strategy Pattern
 *  
 */
package headfirst.simuduck.simulator;

import headfirst.simuduck.Duck;
import headfirst.simuduck.ducktypes.MallardDuck;

/**
 * @author Alex
 *
 */
public class MiniDuckSimulator {

	/**
	 * 
	 */
	public MiniDuckSimulator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is MiniDuckSimulator (c) 2013 by Alex Nowak");
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
	}

}
