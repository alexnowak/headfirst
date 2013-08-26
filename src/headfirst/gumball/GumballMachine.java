package headfirst.gumball;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 8/25/13
 * Time: 6:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    // initial state of the machine is "empty"
    State state = soldOutState;
    int count = 0;


    public GumballMachine(int numberGumballs) {
        this.count = numberGumballs;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        if (numberGumballs > 0)
            state = noQuarterState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    /**
     * Release a ball and decrease the number of balls counter.
     */
    void releaseBall() {
        System.out.println("A gumball is rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

}
