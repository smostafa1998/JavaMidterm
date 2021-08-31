package math.problems;

public class LowestNumber {

    public static void main(String[] args) {
        /*
         Write a method to find the lowest number from this array.
         */
        int[] array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        System.out.println("min is "+lowNum(array));


    }

    public static int lowNum(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }


}
