package headfirst.gumball;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 8/25/13
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No gumballs left in machine.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Can't turn crank, sold out.");
    }

    @Override
    public void dispense() {
        System.out.println("Nothing to dispense, sold out.");
    }
}
