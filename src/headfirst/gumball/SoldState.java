package headfirst.gumball;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 8/26/13
 * Time: 11:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * Inappropriate action for this state.
     */
    @Override
    public void insertQuarter() {
        System.out.println("You already paid.");
    }

    /**
     * Inappropriate action for this state.
     */
    @Override
    public void ejectQuarter() {
        System.out.println("Sold is sold. Can't get back that quarter.");
    }

    /**
     * Inappropriate action for this state.
     */
    @Override
    public void turnCrank() {
        System.out.println("Turning twice does not give you another gumball.");
    }

    /**
     * We are in Sold state so the customer paid.
     * Let's give him a gumball.
     * After that, set the machine to the state according to the number of
     * gumballs.
     */
    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0)
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        else {
            System.out.println("Oops, out of gumballs.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
