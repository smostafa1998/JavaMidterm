package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
        Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
        Write Java program to compute all permutations of any given String
         */
        String testing = "ABC";
        String answer = "";
        perm(testing, answer);

    }

    public static void perm(String testing, String answer) {
        String LEFT = "";
        String RIGHT = "";
        String REMAIN = "";

        for (int i = 0; i < testing.length(); i++) {
            char ch = testing.charAt(i);
            LEFT = testing.substring(0, i);
            RIGHT = testing.substring(i + 1);
            REMAIN = LEFT + RIGHT;
            perm(REMAIN, answer + ch);
        }

        if (testing.length() == 0) {
            System.out.print(answer + "  ");
        }
    }
}
