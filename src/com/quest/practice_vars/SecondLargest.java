package com.quest.practice_vars;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array={2,16,25,8};
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                  int temp=array[i];
                  array[i]=array[j];
                  array[j]=temp;
                }
            }
        }
        System.out.println("Second largest element is:"+array[array.length-2]);
    }
}
