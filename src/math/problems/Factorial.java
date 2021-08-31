package math.problems;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        System.out.println("With Recursion: "+facRecursion(5));
        System.out.println("WIth Iteration: "+factorialIteration(5));

    }

    public static int facRecursion(int num) {

        if (num==0){
            return 1;
        }
        else {
            return (num * facRecursion(num - 1));
        }
    }

    public static int factorialIteration(int x){

        for (int i = x-1; i > 0; i--){
            x = i*x;
        }
        return x;
    }

}
