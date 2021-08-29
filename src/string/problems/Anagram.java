package string.problems;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */

    public static void main(String[] args) {
        String testing1 = "MARY";
        String testing2 = "ARMY";
        anagram(testing1, testing2);
    }


    public static void anagram(String testing1, String testing2){
        int count = 0;

        if (testing1.length() == testing2.length()) {
            for (int i = 0; i < testing1.length(); i++) {
                for (int j = 0; j < testing2.length(); j++) {
                    String a = Character.toString(testing1.charAt(i));
                    String b = Character.toString(testing2.charAt(j));
                    if (a.equals(b)) {
                        count++;
                    }
                }
            }
        } else {
            System.out.println("TWO STRINGS MUST BE SAME LENGTH");
        }


        if (count == testing1.length()) {
            System.out.println("THIS IS A ANAGRAM");
        } else {
            System.out.println("THIS IS NOT A ANAGRAM");
        }
    }
}
