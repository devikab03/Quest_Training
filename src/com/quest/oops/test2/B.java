package com.quest.oops.test2;

public class B {
    void add(int a, int b) {
        int c=a+b;
        System.out.println("B class Add:"+c);
    }
    void add(){
        System.out.println("B class Add No parameter");
    }
    static void add(int a ){
        System.out.println("B class Static Add method"+a);
    }
}
