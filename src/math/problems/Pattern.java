package math.problems;

import jdk.swing.interop.SwingInterOpUtils;

public class Pattern {

    public static void main(String[] args) {
        /*
        Read the numbers below, find the pattern, then implement the logic from this pattern.
            Once done, you should test to see if you get the same output as below:

        100,99,98,97,96,95,94,93,92,91,90 ,88,86,84,82,80,78,76,74,72,70,  67,64,61,58,55,52,49,46,43,40, 36,32...
                by 1                                    by 2                        by3                     by4

        */

         pattern();

    }

    public static void pattern() {
        int update = 0;
        int n = 100;
        int factor = 0;
        boolean test = true;

        System.out.print(n + ",");
        factor++;
        while (test) {
            //System.out.println("//////////////BY DECREMENT OF " + factor);
            for (int j = 1; j <= 10; j++) {

                update = n - (j * factor);

                if (update >= 0) {
                    System.out.print(update + ",");
                } else {
                    test = false;
                }

                if (j == 10) {
                    n = update;
                }
            }
            factor++;
        }
    }


}
