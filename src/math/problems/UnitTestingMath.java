package math.problems;

import org.testng.Assert;

public class UnitTestingMath {

    public static void main(String[] args) {
        // Apply unit testing from each class contained within this package, here.
        /*
        Factorial problem = new Factorial();
        Fibonacci problem2= new Fibonacci();
        FindLowestDifference problem3 = new FindLowestDifference();
        FindMissingNumber problem4 = new FindMissingNumber();
        LowestNumber problem5 = new LowestNumber();
        Pattern problem6 = new Pattern();
        PrimeNumber problem7 = new PrimeNumber();
        */

        System.out.println("==================================================");
        System.out.println("-------------math.problems SOLVED-----------------");
        System.out.println("==================================================");
        System.out.println();

        System.out.println("FACTORIAL PROBLEM 1 SOLVED");
        System.out.println("With Recursion: " + Factorial.facRecursion(5));
        System.out.println("WIth Iteration: " + Factorial.factorialIteration(5));
        //ASSERT
        int actualResult = Factorial.facRecursion(5);
        int expectedResult = 120;
        try {
            Assert.assertEquals(actualResult, expectedResult, "NOPE TRY AGAIN");
        } catch (Exception ex) {
            ex.getMessage();
        }
        //ASSERT
        actualResult = Factorial.factorialIteration(5);
        expectedResult = 120;
        try {
            Assert.assertEquals(actualResult, expectedResult, "NOPE TRY AGAIN");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println();

        System.out.println("FIBBONACHI PROBLEM 2 SOLVED");
        System.out.println(Fibonacci.fib(40));
        System.out.println();


        System.out.println("FIND LOWEST DIFFERENCE PROBLEM 3 SOLVED");
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        System.out.println(FindLowestDifference.lowDIFF(array1, array2));

        //ASSERT
        actualResult = FindLowestDifference.lowDIFF(array1, array2);
        expectedResult = 1;
        try {
            Assert.assertEquals(actualResult, expectedResult, "NOPE TRY AGAIN");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println();

        System.out.println("FIND MISSING NUMBER PROBLEM 4 SOLVED");
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println(FindMissingNumber.missing(array));
        //ASSERT
        actualResult = FindMissingNumber.missing(array);
        expectedResult = 9;
        try {
            Assert.assertEquals(actualResult, expectedResult, "NOPE TRY AGAIN");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println();

        System.out.println("FIND LOWEST NUMBER PROBLEM 5 SOLVED");
        int[] arrayA = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        System.out.println(LowestNumber.lowNum(arrayA));
        //ASSERT
        actualResult = LowestNumber.lowNum(arrayA);
        expectedResult = 5;
        try {
            Assert.assertEquals(actualResult, expectedResult, "NOPE TRY AGAIN");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println();

        System.out.println("FIND PATTERN PROBLEM 6 SOLVED");
        Pattern.pattern();
        System.out.println();

        System.out.println();
        System.out.println("FIND PRIME NUMBER PROBLEM 7 SOLVED");
        PrimeNumber.prime(2, 1000); // change this to 1,000,000 but it takes a while


    }
}
