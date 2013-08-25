/**
 * 
 */
package headfirst.starbuzz;

/**
 * @author Alex
 *
 */
public class Tea {
	public void prepareRecipe() {
		boilWalter();
		steepTeaBag();
		pourInCup();
		addLemonAndMilk();
	}

	private void addLemonAndMilk() {
		System.out.println("Adding lemon and milk");
	}

	private void pourInCup() {
		System.out.println("Pouring into cup");
	}

	private void steepTeaBag() {
		System.out.println("Steeping the tea");
	}

	private void boilWalter() {
		System.out.println("Boiling water");
	}

}
