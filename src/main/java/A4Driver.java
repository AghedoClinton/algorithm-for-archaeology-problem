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

        ArrayList<String> data = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            data.add(scan.nextLine());

        }

        if(Integer.parseInt(data.get(0)) == 1){
            System.out.println(data.get(1));
        }
        else {
            Digraph G = new Digraph(Integer.parseInt(data.get(0)));
            for(String s : data){
                if (s.contains("rests on")){
                    String[] inputs=s.split(" ");
                    G.addEdge(data.indexOf(inputs[0])-1,data.indexOf(inputs[3])-1);
                }
            }
            Topological topological = new Topological(G);
            try{
                for (int v : topological.order()) {
                    System.out.println(data.get(v+1));;
                }
            } catch (NullPointerException e){
                System.out.println("impossible");
            }

        }

    }
}
