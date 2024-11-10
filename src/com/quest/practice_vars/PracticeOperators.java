package com.quest.practice_vars;

public class PracticeOperators {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //Arithmetic Operators
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a/b);
        System.out.println(a-b);
        //Relational Operators
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        boolean x=true;
        boolean y=false;
        //Logical Operators
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(x != y);

        int z=10;
        //Assignment Operator
        z+=5; //z=z+5

        //Unary operator
        System.out.println(z);
        System.out.println("---------");
        System.out.println(z++);
        //z=16
        System.out.println(++z);
        //
        System.out.println(z);
        System.out.println(z--);
        System.out.println(--z);
        System.out.println(z);

        int p=10;
        int q=5;
        //Ternary Operators
       int result= p<15? ++q : 0;
       System.out.println(result);

       int s=11;
       String res=(s%2==0)?"even":"odd";
       System.out.println(res);


    }
}
