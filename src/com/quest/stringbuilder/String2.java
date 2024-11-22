package com.quest.stringbuilder;

public class String2 {

    public static void check(StringBuilder s1, StringBuilder s2) {
        if (s1==s2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (s1.equals(s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder();

        System.out.println(s2.append("world"));
       // System.out.println(s2.reverse().toString());
      //  System.out.println(s2.replace(0,10,"hai" ));
//        System.out.println(s2.delete(1,2));
        System.out.println(s2.insert(0,"hello"));
        System.out.println(s2.charAt(1));

        //sout(s2)

//        check(s1,s2);//check(s1.toString(),s2.toString()
//        String s3="hello";
//        String s4="world";
//        String s5=s3+s4;
//        System.out.println(s5);//concatenation

    }
}

