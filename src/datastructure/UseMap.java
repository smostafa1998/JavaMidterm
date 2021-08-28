package datastructure;
import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Map<String, List<String>> list = new HashMap<String, List<String>>();

        List<String> artWork1 = new ArrayList<String>();
        List<String> artWork2 = new ArrayList<String>();
        List<String> artWork3 = new ArrayList<String>();
        List<String> artWork4 = new ArrayList<String>();
        List<String> artWork5 = new ArrayList<String>();


        artWork1.add("Vincent Van Gogh");
        artWork1.add("Starry Night");
        artWork1.add("1");

        System.out.println(artWork1.get(0).toString());




    }

}
