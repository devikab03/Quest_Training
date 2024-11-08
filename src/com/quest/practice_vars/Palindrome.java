package com.quest.practice_vars;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        if (s==null){
            System.out.println("The string is null");
            return;
        }
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverse = sb.reverse();
       String reverseString= reverse.toString();
       if (s.equals(reverseString)){
           System.out.println("Yes it is palindrome");
       }else {
           System.out.println(" It is not palindrome");
       }

    }
}
