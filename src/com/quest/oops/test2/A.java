package com.quest.oops.test2;

public class A extends B {
    public A() {
        System.out.println("A class constructor  ");
    }

    void add() {
        this.add();//access child
        System.out.println("A class Add method with no Arguments");
    }
    @Override
    void add(int a, int b) {
        super.add(a, b);
        int c = a + b;
        System.out.println("A class Add method with arguments " + c);
    }

    static void add(int a ){
        System.out.println("A class Static Add method"+a);
    }

    public static void main(String[] args) {
        A a = new A();//at first constructor get executed
        a.add(1,2);
        add(5); // static method call
    }
}
