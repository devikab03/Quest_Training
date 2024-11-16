package com.quest.practice_vars;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        for(int i:arr){
            System.out.println(i);
        }
        int[][] arr2=new int[10][10];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j]=j+1;
            }
        }
        for (int[] arrayeg: arr2) {
            System.out.println("----");
           for (int i : arrayeg) {
               System.out.println(i);
           }
        }

    }
}
