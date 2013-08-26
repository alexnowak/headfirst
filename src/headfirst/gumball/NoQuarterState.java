package headfirst.gumball;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 8/25/13
 * Time: 6:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * Quarter inserted --> change machine state to HasQuarter.
     */
    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    /**
     * If there's no quarter in the machine, we cannnot eject it.
     */
    @Override
    public void ejectQuarter() {
        System.out.println("There's no quarter to return.");
    }

    /**
     * No free-bees!
     */
    @Override
    public void turnCrank() {
        System.out.println("You turned the crank, but you haven't inserted a quarter.");
    }

    /**
     * We can't dispensing gumballs without payment.
     */
    @Override
    public void dispense() {
        System.out.println("Pay first, buddy!");
    }
}
