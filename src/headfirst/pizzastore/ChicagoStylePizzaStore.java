/**
 * 
 */
package headfirst.pizzastore;

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
			pizza = new ChicagoStylePizzaCheese();
		else if (item.equals("Pepperoni"))
			pizza = new ChicagoStylePizzaPepperoni();
		else
			pizza = null;

		return pizza;
	}

}
