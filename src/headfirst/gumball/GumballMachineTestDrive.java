package headfirst.gumball;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 8/26/13
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args){
        GumballMachine gm = new GumballMachine(5);

        gm.insertQuarter();
        gm.turnCrank();
        gm.turnCrank();
    }

}
