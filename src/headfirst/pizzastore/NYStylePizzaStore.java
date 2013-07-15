/**
 * 
 */
package headfirst.pizzastore;

import headfirst.pizzastore.ingredients.NYPizzaIngredientFactory;

/**
 * @author Alex
 *
 */
public class NYStylePizzaStore extends PizzaStore {

	/* (non-Javadoc)
	 * @see headfirst.pizzastore.PizzaStore#createPizza(java.lang.String)
	 */
	@Override
	public Pizza createPizza(String item) {
		Pizza pizza;
		if (item.equals("Cheese"))
			pizza = new CheesePizza("NY Style Cheese Pizza",new NYPizzaIngredientFactory());
		else if (item.equals("Pepperoni"))
			pizza = new PepperoniPizza("NY Style Pepperoni Pizza",new NYPizzaIngredientFactory());
		else
			pizza = null;

		return pizza;
	}

}
