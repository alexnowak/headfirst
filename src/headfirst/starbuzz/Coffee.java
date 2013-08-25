/**
 * 
 */
package headfirst.starbuzz;

/**
 * @author Alex
 *
 */
public class Coffee {
	public void prepareRecipe() {
		boilWalter();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	private void addSugarAndMilk() {
		System.out.println("Adding Sugar and Milk");
	}

	private void pourInCup() {
		System.out.println("Pouring Into Cup");
	}

	private void brewCoffeeGrinds() {
		System.out.println("Drippig Coffee thru filter");
	}

	private void boilWalter() {
		System.out.println("Boiling water");
	}

}
