package com.quest.practice_vars;

public class SortArray {
    public static void main(String[] args) {
//        initialize an array
        int[] array={40,20,10,33,12};
//        sortedarray
        int[] sortedArray=sortArray(array);
//         printing the sortedArray
        printArray(sortedArray);
    }
    //Use bubble sort to sort an array
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    //method for printing an array
    public static void printArray(int[] array) {
        System.out.println("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
