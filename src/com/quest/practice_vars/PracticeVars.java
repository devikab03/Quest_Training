package com.quest.practice_vars;

public class PracticeVars {
    final static int VOTE_AGE = 18;

    public static void main(String[] args) {
        final int VOTE_AGE = 18;
        int age = 21;
        double salary = 3000.0;
        char ss = 'd';
        String a = "apple";
        System.out.println("Age is :" + age);
        System.out.println("Salary is :" + salary);
        System.out.println("SS is :" + ss);
        System.out.println("A is :" + a);

        age = 20;
        System.out.println("Age is :" + age);
        System.out.println("voteage:" + VOTE_AGE);
        // VOTE_AGE=29;It cannot be change since VOTE_AGE is final
        practiceConversion();
        stringConcatenation();
        stringMethods();
    }

    private static void practiceConversion()
    {
        int a=20;
        double b=20.5;
        double sum=a+b;

        int round=(int)b;
        System.out.println("sum is :" + sum);
        System.out.println("round is :" + round);

    }
    private static void stringConcatenation()
    {
        String s1="Adam";
        String s2="john";
        String s3=s1+" "+s2;
        System.out.println(s3);

        int age=20;
        System.out.println("name="+s3+"Age is :" + age);

    }
    private static void stringMethods()
    {
        String s1="Adam";
        String s2="john";
        String s4=new String("helloworld");
        String s3=new String("helloworld");
        System.out.println(s3.length());
        System.out.println(s3.equalsIgnoreCase(s2));
        System.out.println(s3.equals(s2));
        System.out.println(s4==s3);//it will give us false because it is in different ref variable


    }

}
