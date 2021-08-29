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

        Map<String, List<String>> archive = new HashMap<String, List<String>>();

        List<String> artWork1 = new ArrayList<String>();
        List<String> artWork2 = new ArrayList<String>();
        List<String> artWork3 = new ArrayList<String>();
        List<String> artWork4 = new ArrayList<String>();
        List<String> artWork5 = new ArrayList<String>();

        System.out.println("=====================VAN GOGH ART-WORKS====================");

        artWork1.add("1");
        artWork1.add("ARTWORK:Starry Night");

        artWork2.add("2");
        artWork2.add("ARTWORK:Cafe Terrance at Night");

        artWork3.add("3");
        artWork3.add("ARTWORK:Almond Blossoms");

        artWork4.add("4");
        artWork4.add("ARTWORK:Wheatfield with Crows");

        artWork5.add("5");
        artWork5.add("ARTWORK:Irises");

        String ID = artWork1.get(0).toString();
        String ID2 = artWork2.get(0).toString();
        String ID3 = artWork3.get(0).toString();
        String ID4 = artWork4.get(0).toString();
        String ID5 = artWork5.get(0).toString();


        for (String s:artWork1){
            archive.put(ID, new ArrayList<>());
            archive.get(ID).add(s);
        }

        for (String s:artWork2){
            archive.put(ID2,new ArrayList<String>());
            archive.get(ID2).add(s);
        }

        for (String s:artWork3){
            archive.put(ID3,new ArrayList<String>());
            archive.get(ID3).add(s);
        }

        for (String s:artWork4){
            archive.put(ID4,new ArrayList<String>());
            archive.get(ID4).add(s);
        }
        for (String s:artWork5){
            archive.put(ID5,new ArrayList<String>());
            archive.get(ID5).add(s);
        }

        Iterator<Map.Entry<String, List<String>>> itr = archive.entrySet().iterator();
        //loops through archive using for each
        //for(String s:archive.keySet()){
        //    System.out.println(archive.get(s).get(0).toString());
       // }

        //USING FOR EACH LOOP
        System.out.println("FOR EACH LOOP");
        for(Map.Entry <String, List<String>> entry : archive.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
        //USING WHILE LOOP
        System.out.println();
        System.out.println("WHILE LOOP");
        while(itr.hasNext()){
            Map.Entry <String, List<String>> entry= itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }


        //ADD SQL CODE HERE TO LOAD AND RETRIEVE







    }

}
