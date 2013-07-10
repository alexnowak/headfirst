/**
 * 
 */
package headfirst.pizzastore;

/**
 * @author Alex
 *
 */
public class ChicagoStylePizzaCheese extends Pizza {

	public ChicagoStylePizzaCheese() {
		name = "Chicago Style Sauce and Cheese Pizza";
		dough ="Thick Crust Dough";
		sauce = "Tomatoe Sauce";
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Oregano");
	}

	/**
	 * Overloaded so that the pieces are cut into squares
	 */
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
