/**
 * 
 */
package headfirst.pizzastore;

/**
 * @author Alex
 *
 */
public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
				
		return pizza;
	}

	/**
	 * Abstract "factory method" for creating a Pizza
	 * @param type Pizza type, e.g. Veggie, etc
	 * @return a Pizza
	 */
	public abstract Pizza createPizza(String type);
	
}
