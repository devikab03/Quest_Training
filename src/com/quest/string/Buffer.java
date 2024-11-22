package com.quest.string;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer s3 = new StringBuffer("Good");
        StringBuffer s5 = new StringBuffer("Good");

        String s7="hello";
        String s8="hello";

//        StringBuilder s9=new StringBuilder("Hello");
//        if(s9==s5){
//            System.out.println("equal");
//        }else{
//            System.out.println("not equal");
//        }
//
//        if(s3==s7){
//            System.out.println("s3 equals s7");
//        }else {
//            System.out.println("s3 does not equal s7");
//        }
        System.out.println("_________________________________");
        if(s3==s5){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        System.out.println("__________________");

        if(s3.equals(s5)){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }

        System.out.println(s3);
        System.out.println("After append: "+(s3.append(s5)));

        System.out.println(s3);
        System.out.println("After reverse: "+(s3.reverse()));

        System.out.println(s5);
        System.out.println("After replace: "+(s5.replace(1,5,"haii")));

        System.out.println(s5);
        System.out.println("After delete: "+(s5.delete(0,5)));

        System.out.println(s5);
        System.out.println("After insert:"+(s5.insert(0,"After")));

        System.out.println(s5);
        System.out.println("Character:"+s5.charAt(2));

    }
}
