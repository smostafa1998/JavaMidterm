package math.problems;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
       // int num = 5;
        //System.out.println(fac(num));

    }

    public int fac(int num) {

        if (num==0){
            return 1;
        }
        else {
            return (num * fac(num - 1));
        }
    }

    public void factorialIteration(int x){

        for (int i = x; i > 0; i--){
            x += (i*(i-1));
        }
        System.out.println(x);
    }

}
