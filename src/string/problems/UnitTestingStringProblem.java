package string.problems;

import math.problems.Factorial;
import org.testng.Assert;

public class UnitTestingStringProblem {

    public static void main(String[] args) {
        // Unit testing for all classes within this package should be implemented here

        System.out.println("==================================================");
        System.out.println("-------------string.problems SOLVED---------------");
        System.out.println("==================================================");

        System.out.println("ANAGRAM");
        String testing1 = "CAT";
        String testing2 = "ACT";
        System.out.println(Anagram.anagram(testing1, testing2));

        //ASSERT
        String actualResult = Anagram.anagram(testing1, testing2);
        String expectedResult = "THIS IS A ANAGRAM";
        try {
            Assert.assertEquals(actualResult, expectedResult, "NOPE TRY AGAIN");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println();

        System.out.println("DETERMINE LARGEST WORD");
        String s = "Human brain is a biological learning machine";
        DetermineLargestWord.findTheLargestWord(s);
        System.out.println();

        System.out.println("DUPLICATE WORD");
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        DuplicateWord.duplicate(st);
        System.out.println();

        System.out.println("PALINDROME");
        String testing = "MADAM";
        System.out.println(Palindrome.palindrome(testing));
        //ASSERT
        actualResult = Palindrome.palindrome(testing);
        expectedResult = "IT IS A PALINDROME";
        try {
            Assert.assertEquals(actualResult, expectedResult, "NOPE TRY AGAIN");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println();

        System.out.println("PERMUTATION");
        String testingA = "ABC";
        String answer = "";
        Permutation.perm(testingA, answer);
        System.out.println();


    }
}
