package math.problems;

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
        Factorial.factorialIteration(5);
        System.out.println();

        System.out.println("FIBBONACHI PROBLEM 2 SOLVED");
        System.out.println(Fibonacci.fib(40));
        System.out.println();

        System.out.println("FIND LOWEST DIFFERENCE PROBLEM 3 SOLVED");
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        FindLowestDifference.lowDIFF(array1, array2);
        System.out.println();

        System.out.println("FIND MISSING NUMBER PROBLEM 4 SOLVED");
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        FindMissingNumber.missing(array);
        System.out.println();

        System.out.println("FIND LOWEST NUMBER PROBLEM 5 SOLVED");
        int[] arrayA = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        LowestNumber.lowNum(arrayA);
        System.out.println();

        System.out.println("FIND PATTERN PROBLEM 6 SOLVED");
        Pattern.pattern();
        System.out.println();

        System.out.println();
        System.out.println("FIND PRIME NUMBER PROBLEM 7 SOLVED");
        PrimeNumber.prime(2, 1000);


    }
}
