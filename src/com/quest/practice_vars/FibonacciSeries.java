package com.quest.practice_vars;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if (n<0) {
            System.out.println("Invalid number");
            return;
            
        }
        int a=0;
        int b=1;
        int c;
        for (int i=1;i<=n;i++){
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;

        }
    }
}
