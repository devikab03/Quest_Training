package com.quest.string;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello World";
        String str3 = new String("World");
        String str4 = new String("hello World");
        String str5 = str4;
//    check(str3, str4);
//    int i1=1;
//    int i2=2;
//    check2(i1, i2);
        check3(str, str2);
    }

    public static void check(String str, String str2) {
        if (str == str2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (str.equals(str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (str.contains(str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void check2(int i1, int i2) {
        if (i1 == i2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    public static void check3(String str, String str2) {
        if (str.equals(str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (str2.contains("Hello")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}


