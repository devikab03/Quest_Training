package com.quest.practice_vars;

import java.util.Scanner;

public class DisplayString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char ch = s.charAt(i);

        }


    }

}

