package string.problems;

import java.util.ArrayList;

public class DuplicateWord {

    public static void main(String[] args) {

        /*
         Write a java program to find the duplicate words and their number of occurrences in the string.
            Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int occurrences = 0;
        double sum = 0;
        double average = 0;
        //st = st.replace(".", "");
        String[] str = st.split(" ");
        ArrayList<String> duplicate = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (!duplicate.contains(str[i])) {
                for (int j = i + 1; j < str.length; j++) {
                    if (str[i].equals(str[j])) {
                        occurrences++;
                        duplicate.add(str[i]);

                    }
                }
            } else {
                continue;
            }
            if (occurrences > 0) {
                System.out.println(str[i] + ": " + occurrences);
            }
            occurrences = 0;
            sum += str[i].length();
        }
        System.out.println("sum is "+sum);
        average = sum / str.length;
        System.out.println("avg is "+average);
    }

}
