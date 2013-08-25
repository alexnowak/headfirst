/**
 * 
 */
package headfirst.gumball;

/**
 * @author Alex
 *
 */
public class SoldState implements State {
	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumMachine) {
		this.gumballMachine = gumMachine;
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
