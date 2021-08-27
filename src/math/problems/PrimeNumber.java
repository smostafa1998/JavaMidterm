package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */
        prime();

    }
    public static void prime(){
        for(int i = 2; i <=100;i++){
            int div_counter =0;
            //checks divisiblity of each number, if its prime it should only be divisible twice by one and itself ie counter
            for (int j =1;j<=i ;j++){

                if (i%j==0){
                    //System.out.println(i);
                    div_counter++;
                }
            }
            if (div_counter ==2){
                System.out.println(i);
            }

        }
    }

}
