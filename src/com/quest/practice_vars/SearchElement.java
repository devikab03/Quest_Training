package com.quest.practice_vars;


public class SearchElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int searchElement = 4;
        int index = search(a, searchElement);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
            System.out.println("Index is:"+index);
        }
    }
    private static int search(int[] a, int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return -1;
    }

}

