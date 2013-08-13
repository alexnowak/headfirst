/**
 * 
 */
package headfirst.pizzastore.ingredients;

import headfirst.pizzastore.ingredients.veggies.*;

/**
 * @author Alex
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	/* (non-Javadoc)
	 * @see headfirst.pizzastore.PizzaIngredientFactory#createDough()
	 */
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	/* (non-Javadoc)
	 * @see headfirst.pizzastore.PizzaIngredientFactory#createSauce()
	 */
	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	/* (non-Javadoc)
	 * @see headfirst.pizzastore.PizzaIngredientFactory#createChesse()
	 */
	@Override
	public Cheese createChesse() {
		return new MozzarellaCheese();
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
		return new FreshClam();
	}

}
