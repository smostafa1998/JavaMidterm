package algorithm;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitTestSorting {

    /*
      This class is used to help with unit testing of sorting algorithms from the Sort class
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        int[] sorting = {38, 27, 3, 11, 7 ,15,11,23,44,55,66,77,88,99};


        // Create instance of Sort class
        Sort sort = new Sort();

        // Pass the unsorted array to selectionSort() method from Sort class
        //System.out.println(Arrays.toString(sort.selectionSort(unSortedArray)));
        System.out.println(Arrays.toString(sort.heapSort(unSortedArray)));
        System.out.println(Arrays.toString(sort.insertionSort(unSortedArray)));
        System.out.println(Arrays.toString(sort.mergeSort(unSortedArray)));
        System.out.println(Arrays.toString(sort.selectionSort(unSortedArray)));
        System.out.println(Arrays.toString(sort.bubbleSort(unSortedArray)));
        System.out.println(Arrays.toString(sort.quickSort(unSortedArray,0,unSortedArray.length-1)));

        //Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, sort.selectionSort(unSortedArray), "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
            Assert.assertEquals(sortedArray, sort.insertionSort(unSortedArray), "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
            Assert.assertEquals(sortedArray, sort.bubbleSort(unSortedArray), "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
            Assert.assertEquals(sortedArray, sort.quickSort(unSortedArray,0,unSortedArray.length-1), "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //System.out.println(Arrays.toString(mergeSort(sorting)));
        //System.out.println(Arrays.toString(quickSort(sorting,0,sorting.length-1)));
        // Implement Unit test for rest of the sorting algorithms below

    }

    public static int[] bubbleSort(int[] array){
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
                    System.out.println("changed");
                }else{
                    System.out.println("same dont change");
                }
               // System.out.println(Arrays.toString(list));
            }
        }
        return list;
    }

    public static int[] mergeSort(int[] array) {
        //final long startTime = System.currentTimeMillis();
        int[] list = array; //copy of thr array
        int temp = list.length-1;
        int left_index = 0;
        int right_index = temp;

        //based on how truncation works
        int midpoint= (left_index + right_index - 1)/2;
        int temp1 = midpoint;
        int left_size = midpoint-left_index+1;
        int right_size = temp-midpoint;

        int[] leftSIDE = new int [left_size] ; //{38, 27, 43, 3,
        int[] rightSIDE = new int [right_size] ; //9, 82, 10}

        for(int i=0; i<leftSIDE.length; i++){
            leftSIDE[i] = list[i];
        }
        for(int j=0;j<rightSIDE.length; j++){
            rightSIDE[j] = list[temp1+1];
            temp1++;
        }
        System.out.println("UPDATED ARRAYS");
        System.out.println(Arrays.toString(leftSIDE));
        System.out.println(Arrays.toString(rightSIDE));

        return list;
    }

    public static int[] heapSort(int[] array) {
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

    private static void heapIt(int[] list, int size , int i) {
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

    public static int[] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int index =0;
        List<Integer>[] sorted = new List[list.length];

        for (int i = 0; i < list.length; i++) {
            sorted[i] = new ArrayList<Integer>();
        }

        return list;
    }

    public static int[] quickSort(int[] array, int lo, int hi) {
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








}
