package com.quest.practice_vars;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World"; //Literal
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));
        String str2 = new String("JavaProgram");
        System.out.println(str2);
        String str3 = "Jammu ";
        String str4 = "kashmir";
        String str5 = str3.concat(str4);
        System.out.println("Concatenated String:" + str5);
        String str6 = "Javaprogram";
        String str7 = "JavaProgram";
        System.out.println(str6.equals(str7));
        System.out.println(str6.equalsIgnoreCase(str7));
        System.out.println(str6.startsWith("java"));
        System.out.println(str6.endsWith("am"));
        System.out.println(str6.contains("java"));
    }
}
