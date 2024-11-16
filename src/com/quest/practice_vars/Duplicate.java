package com.quest.practice_vars;

public class Duplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 5, 5, 1};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate element is:" + array[j]);
                    count++;
                    break;
                }
            }
        }
        System.out.println("Count of duplicates:" + count);

    }
}
