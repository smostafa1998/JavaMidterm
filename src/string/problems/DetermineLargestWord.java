package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below
         Should return "10 biological"
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        String[] a = wordGiven.split(" ");
        for (int i = 0; i < a.length; i++) {
            map.put(i, a[i]);
        }
        int max = Integer.MIN_VALUE;
        for (Integer i : map.keySet()) {
            if (map.get(i).length() > max) {
                st = map.get(i);
                max = map.get(i).length();
            }
        }

        st = st + " " + String.valueOf(max);
        System.out.println(st);

        return map;
    }
}
