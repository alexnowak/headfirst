/**
 * 
 */
package headfirst.pizzastore.ingredients;

import headfirst.pizzastore.ingredients.veggies.*;

/**
 * @author Alex
 *
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	/* (non-Javadoc)
	 * @see headfirst.pizzastore.PizzaIngredientFactory#createDough()
	 */
	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	/* (non-Javadoc)
	 * @see headfirst.pizzastore.PizzaIngredientFactory#createSauce()
	 */
	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}

	/* (non-Javadoc)
	 * @see headfirst.pizzastore.PizzaIngredientFactory#createChesse()
	 */
	@Override
	public Cheese createChesse() {
		return new ReggianoCheese();
	}

	/* (non-Javadoc)
	 * @see headfirst.pizzastore.PizzaIngredientFactory#createVeggies()
	 */
	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new RedPepper() };
		return veggies;
	}

	/* (non-Javadoc)
	 * @see headfirst.pizzastore.PizzaIngredientFactory#createPepperoni()
	 */
	@Override
	public Pepperoni createPepperoni() {
		return new SpicyPepperoni();
	}

	/* (non-Javadoc)
	 * @see headfirst.pizzastore.PizzaIngredientFactory#createClam()
	 */
	@Override
	public Clams createClam() {
		return new FrozenClam();
	}

}
