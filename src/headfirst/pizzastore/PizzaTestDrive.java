/**
 * 
 */
package headfirst.pizzastore;

/**
 * @author Alex
 *
 */
public class PizzaTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("PizzaTestDrive ================================");
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		
		Pizza pizza = nyStore.orderPizza("Cheese");
		System.out.println("--> Ethan has ordered a " + pizza.getName() +"\n");

		pizza = nyStore.orderPizza("Pepperoni");
		System.out.println("--> David has ordered a " + pizza.getName() +"\n");

		pizza = chicagoStore.orderPizza("Cheese");
		System.out.println("--> Joe has ordered a " + pizza.getName() +"\n");

		pizza = chicagoStore.orderPizza("Pepperoni");
		System.out.println("--> Mike has ordered a " + pizza.getName() +"\n");
	}

}
