import java.util.*;
import edu.princeton.cs.algs4.*;

/**
 * Driver program reading from stdin and writing to stdout
 * solves the archeology assignment 4.
 *
 * To run this use gradle run, or click the run button beside
 * any of the tests in the A4DriverTest class
 *
 */
public class A4Driver {

    public static void main(String[] args) {

        //replace all of this code with your solution

        System.out.println("enter anything followed by <CTRL>+D");
        Bag<String> data = new Bag<>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            data.add(scan.nextLine());
        }
        for(var s : data ) {
            System.out.println(s);
        }
    }
}
