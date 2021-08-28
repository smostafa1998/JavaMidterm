package datastructure;
import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        ArrayList<String> testing = new ArrayList<String>();
        testing.add("hi");
        testing.add("my");
        testing.add("name");
        testing.add("is");
        testing.add("Sabreen");
        System.out.println("After all these add methods"+testing.toString());


        peek(testing);

        testing.remove(2);
        System.out.println("Arraylist after removal"+testing.toString());

    }


    public static void peek(ArrayList<String> testing){
        if (testing.size()==0){
            System.out.println("EMPTY");
        }else{
            System.out.println("The peek is "+testing.get(testing.size()-1));
        }
    }


}
