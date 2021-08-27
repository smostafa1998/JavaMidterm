package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */

        String testing = "MADAM";
        String testing1="";
        for (int i=testing.length()-1;i>=0;i--){
            testing1 += testing.charAt(i);
        }

        if (testing.equals(testing1)){
            System.out.println("IT IS A PALINDROME");
        }else{
            System.out.println("IT IS NOT A PALINDROME");
        }

    }
}
