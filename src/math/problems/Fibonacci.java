package math.problems;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {
        //System.out.println("HELLO");
        //System.out.println(fib());

    }

    public int fib() {
        int temp1 = 0;
        int temp2=0;
        int currentNum=0;
        int total =0;

        for(int counter=0;counter<40;counter++){

            if (currentNum<=1){
                temp1 = currentNum; //1
                System.out.print(temp1+" ");
                currentNum++;
            }else{
                total = temp1 + temp2; // 1 1
                System.out.print(total+" ");
                temp2 = temp1;
                temp1= total;
            }
        }

        return 0;
    }
}