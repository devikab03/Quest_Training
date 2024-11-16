package com.quest.practice_vars;

import java.util.Arrays;

public class ReplaceCurrentElement {
    public static void main(String[] args) {
        int[] array={2,4,5,7,8};
        int total=0;
        for(int i=0;i<array.length;i++){
            total+=array[i];
        }
        for(int i=0;i<array.length;i++){
            array[i]=total-array[i];
        }
        System.out.println(Arrays.toString(array));
    }
}
