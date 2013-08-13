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
public class CheesePizza extends Pizza {
		PizzaIngredientFactory ingredientFactory;
		
		public CheesePizza(String name, PizzaIngredientFactory ingredientFactory) {
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
public class CheesePizza extends Pizza {
		PizzaIngredientFactory ingredientFactory;
		
		public CheesePizza(String name, PizzaIngredientFactory ingredientFactory) {
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
		}
		

}
>>>>>>> branch 'master' of https://github.com/alexnowak/headfirst.git
