/**
 * 
 */
package headfirst.pizzastore;

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
			pizza = new NYStylePizzaCheese();
		else if (item.equals("Pepperoni"))
			pizza = new NYStylePizzaPepperoni();
		else
			pizza = null;

		return pizza;
	}

}
