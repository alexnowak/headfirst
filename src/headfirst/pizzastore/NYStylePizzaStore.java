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

		NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (item.equals("Cheese"))
			pizza = new CheesePizza("NY Style Cheese Pizza",ingredientFactory);
		else if (item.equals("Pepperoni"))
			pizza = new PepperoniPizza("NY Style Pepperoni Pizza",ingredientFactory);
		else
			pizza = null;

		return pizza;
	}

}
