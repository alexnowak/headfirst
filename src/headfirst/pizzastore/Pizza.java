/**
 * 
 */
package headfirst.pizzastore;

import headfirst.pizzastore.ingredients.Clams;
import headfirst.pizzastore.ingredients.Dough;
import headfirst.pizzastore.ingredients.Sauce;
import headfirst.pizzastore.ingredients.Pepperoni;
import headfirst.pizzastore.ingredients.veggies.Veggies;

/**
 * @author Alex
 *
 */
public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Pepperoni pepperoni;
	Clams clams;
	
	public abstract void prepare();
	
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
