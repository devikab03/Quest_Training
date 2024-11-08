package com.quest.practice_vars;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum=0;
        while (num> 0) {
            int rem = num % 10;
             sum=(sum*10)+rem;
             num = num / 10;
        }
        if (sum == temp) {
            System.out.println("It is a palindrome.");
        } else{
                System.out.println("It is not a palindrome.");
        }
    }
}
