package headfirst.gumball;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 8/25/13
 * Time: 6:23 PM
 * To change this template use File | Settings | File Templates.
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
