package com.quest.practice_vars;

import java.util.Scanner;

public class PatternReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array is:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }


        System.out.println("Reversed array is:");
        for (int i = 0; i < array.length; i++) {
            for (int j= array[i].length-1; j>=0;j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}