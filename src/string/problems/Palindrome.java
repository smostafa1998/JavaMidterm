package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */

        String testing = "MADAM";
        System.out.println(palindrome(testing));

    }

    public static String palindrome (String testing){
        String testing1="";
        String answer = "";
        for (int i=testing.length()-1;i>=0;i--){
            testing1 += testing.charAt(i);
        }

        if (testing.equals(testing1)){
            answer="IT IS A PALINDROME";
        }else{
            answer = "IT IS NOT A PALINDROME";
        }

        return answer;
    }
}
