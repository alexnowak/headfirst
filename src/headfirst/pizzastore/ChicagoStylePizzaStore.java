/**
 * 
 */
package headfirst.pizzastore;

import headfirst.pizzastore.ingredients.ChicagoPizzaIngredientFactory;

/**
 * @author Alex
 *
 */
public class ChicagoStylePizzaStore extends PizzaStore {

	/* (non-Javadoc)
	 * @see headfirst.pizzastore.PizzaStore#createPizza(java.lang.String)
	 */
	@Override
	public Pizza createPizza(String item) {
		Pizza pizza;
		if (item.equals("Cheese"))
			pizza = new CheesePizza("Chicago Style Cheese Pizza", new ChicagoPizzaIngredientFactory());
		else if (item.equals("Pepperoni"))
			pizza = new PepperoniPizza("Chicago Style Pepperoni Pizza",new ChicagoPizzaIngredientFactory());
		else
			pizza = null;

		return pizza;
	}

}
