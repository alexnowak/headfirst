<<<<<<< HEAD
/**
 * 
 */
package headfirst.pizzastore;

import headfirst.pizzastore.ingredients.PizzaIngredientFactory;

/**
 * @author Alex
 *
 */
public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(String name, PizzaIngredientFactory ingredientFactory) {
		this.name = name;
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing "+name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		System.out.println("\t- Vegies:");
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();		
	}
}
=======
/**
 * 
 */
package headfirst.pizzastore;

import headfirst.pizzastore.ingredients.PizzaIngredientFactory;

/**
 * @author Alex
 *
 */
public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(String name, PizzaIngredientFactory ingredientFactory) {
		this.name = name;
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing "+name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		System.out.println("\t- Vegies:");
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();		
	}
}
>>>>>>> branch 'master' of https://github.com/alexnowak/headfirst.git
