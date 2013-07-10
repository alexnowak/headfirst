/**
 * 
 */
package headfirst.pizzastore;

import java.util.ArrayList;

/**
 * @author Alex
 *
 */
public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough "+dough+"...");
		System.out.println("Adding sauce "+sauce+" ...");
		System.out.println("Adding "+toppings.size()+" topping(s):");
		for (int i=0; i<toppings.size(); i++)
			System.out.println(" ["+i+"] "+toppings.get(i));
		
	}
	public void bake() {
		System.out.println("Bake for 25 mins at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place the pizza in official PizzaStrore box");
	}

	public String getName() {
		return name;
	}
}
