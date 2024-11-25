package com.quest.practice_vars;

public class MissingOneNumber {
    public static void main(String[] args) {
        int[] a={1,2,4,5,6};
        System.out.println("result: "+returnArray(a));

    }
    public static int returnArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=i+1){
                return i+1;
            }
        }
        return 0;


    }
}
