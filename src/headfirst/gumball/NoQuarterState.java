/**
 * 
 */
package headfirst.gumball;

/**
 * @author Alex
 *
 */
public class NoQuarterState implements State {
	private GumballMachine gumballMachine;

	/**
	 * @param gumballMachine - Reference to gumball machine.
	 */
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}



	/* (non-Javadoc)
	 * @see headfirst.gumball.State#insertQuarter()
	 */
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see headfirst.gumball.State#ejectQuarter()
	 */
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see headfirst.gumball.State#turnCrank()
	 */
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see headfirst.gumball.State#dispense()
	 */
	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}

}
