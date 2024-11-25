package com.quest.practice_vars;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 9};
        missingNumber(arr);

    }
    public static void missingNumber(int[] arr) {
        Arrays.sort(arr);

        System.out.println("Missing numbers : ");
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = arr[i] + 1; j < arr[i+1]; j++) {
                System.out.print(j + " ");
            }
        }
    }

    }
