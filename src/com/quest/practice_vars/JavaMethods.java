package com.quest.practice_vars;

public class JavaMethods {
    private static final int x=30;
    public static void main(String[] args) {
        JavaMethods javaMethods = new JavaMethods();
        javaMethods.display("haiii");
       int result= javaMethods.add(1,3);
       System.out.println(result);
//       x=40;//since it is final it cannot be change
    }

    /**
     * displays String
     * @param str-name
     */
    private void display(String str)
    {
        System.out.println(str);
    }

    /**
     * add two numbers
     * @param a-n1
     * @param b-n2
     * @return-sum
     */
    private int add(int a, int b)
    {
        return a+b;
    }
}
