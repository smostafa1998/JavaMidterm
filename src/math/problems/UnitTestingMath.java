package math.problems;

public class UnitTestingMath {

    public static void main(String[] args) {
        // Apply unit testing from each class contained within this package, here.
        Factorial problem = new Factorial();
        Fibonacci problem2= new Fibonacci();
        FindLowestDifference problem3 = new FindLowestDifference();
        FindMissingNumber problem4 = new FindMissingNumber();
        LowestNumber problem5 = new LowestNumber();
        Pattern problem6 = new Pattern();
        PrimeNumber problem7 = new PrimeNumber();

        System.out.println("FACTORIAL PROBLEM 1 SOLVED");
        System.out.println(problem.fac(5));
        problem.factorialIteration(5);
        System.out.println("FIBBONACHI PROBLEM 2 SOLVED");
        System.out.println(problem2.fib());
        System.out.println("FIND LOWEST DIFFERENCE PROBLEM 3 SOLVED");
        problem3.lowDIFF();
        System.out.println("FIND MISSING NUMBER PROBLEM 4 SOLVED");
        problem4.missing();
        System.out.println("FIND LOWEST NUMBER PROBLEM 5 SOLVED");
        problem5.lowNum();
        System.out.println("FIND PATTERN PROBLEM 6 SOLVED");
        problem6.pattern();
        System.out.println();
        System.out.println("FIND PRIME NUMBER PROBLEM 7 SOLVED");
        problem7.prime();



    }
}
