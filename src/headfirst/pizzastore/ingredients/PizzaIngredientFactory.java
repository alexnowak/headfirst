/**
 * 
 */
package headfirst.pizzastore.ingredients;

import headfirst.pizzastore.ingredients.veggies.Veggies;

/**
 * @author Alex
 *
 */
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createChesse();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
