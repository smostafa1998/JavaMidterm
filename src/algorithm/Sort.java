package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort {

    long executionTime = 0;

    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */
    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int key = 0;
        int j = 0;
        for (int i = 1; i < list.length; i++) {
            key = list[i]; //current
            j = i - 1; // predecessor

            while (key < list[j]) { // element is greater than current key
                if (j != 0) {
                    list[j + 1] = list[j];  // move the element forward
                    j--;    // decrement j
                } else {
                    break;
                }
            }
            list[j + 1] = key; // move
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int key = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                //System.out.println(array[i]+" "+array[j]);
                if(array[j]>array[j+1]) {
                    key = array[j];//5
                    array[j]=array[j+1];//5
                    array[j+1] = key;//
                    //System.out.println("changed");
                }else{
                   // System.out.println("same dont change");
                }
                // System.out.println(Arrays.toString(list));
            }
        }
        return list;
    }

    //couldnt figure out
    public int[] mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        return list;
    }

    public int[] quickSort(int[] array, int lo, int hi) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        if (lo < hi)
        {
            int i = lo - 1;
            for(int j = lo; j <= hi - 1; j++)
            {
                if (list[j] < list[hi])
                {
                    i++;
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
            int temp2 = list[i+1];
            list[i+1] = list[hi];
            list[hi] = temp2;

            quickSort(list, lo, i);
            quickSort(list, i+2, hi);
        }
        return list;
    }



    public int[] heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int temp =0;
        //implement here
        int size = list.length;

        for(int i = (size/2)-1; i >= 0; i--){
            heapIt(list, size,i);
        }

        for(int j = list.length-1;j>0;j--){
            temp = list[0];
            list[0] = list[j];
            list[j] = temp;
            heapIt(list, j,0);
        }

        return list;
    }

    private void heapIt(int[] list, int size , int i) {
        int maxNUM = i;
        int left = 2*i+1; //left subtree
        int right = 2*i+2; //right subtree
        int swapped;

        //check left child to root
        if(left < size && list[left] > list[maxNUM]) {
            maxNUM = left;
        }

        //check right child to root
        if(right < size && list[right] > list[maxNUM]){
            maxNUM = right;
        }
        //else
        if(maxNUM != i){
            swapped=list[i];
            list[i] = list[maxNUM];
            list[maxNUM] = swapped;

            heapIt(list, size,maxNUM);
        }

    }

    // bucket and shell could'nt figure out
    public int[] bucketSort(int[] array) {
        //COULDNT FIGURE OUT
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int index =0;
        List<Integer>[] sorted = new List[list.length];
        double results;

        for (int i = 0; i < list.length; i++) {
            sorted[i] = new ArrayList<Integer>();
        }

        return list;
    }

    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int temp;
        return list;
    }
}
