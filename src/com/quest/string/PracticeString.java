package com.quest.string;

public class PracticeString {

    public static void main(String[] args) {
        String s1 = "Good";
        String s2 = "Good";
        System.out.println("String s1:" + s1);
        System.out.println("String s2:" + s2);
        if (s1 == s2) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        if (s1.equals(s2)) {
            System.out.println("2 strings are equal");
        } else {
            System.out.println("2 strings are not equal");
        }
    }
}
