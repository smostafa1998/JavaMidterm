package datastructure;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionView {

    public static void main(String[] args) {
        /*
         Map is created and some data is inserted into it.
         Retrieve the Collection view of the values present in map
         */

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");
        System.out.println(Collections.singletonMap(HashMap.class, map));

        System.out.println("FOR EACH LOOP");
        for(Map.Entry <Integer,String> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

    }

}
