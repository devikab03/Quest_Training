package com.quest.stringbuilder;

public class Practice {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Good");
        StringBuilder s2 = new StringBuilder("Good");
        if(s1==s2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        System.out.println("------------------");
        if(s1.equals(s2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        System.out.println("Currently s1:"+s1);
        System.out.println("append():"+ s1.append(s2));

        System.out.println(s1);
        System.out.println("reverse():"+ s1.reverse());


        System.out.println(s2);
        System.out.println("replace():"+s2.replace(0,10,"Evening"));
        System.out.println(s2.replace(1,5,"haii"));
        System.out.println("after replace():"+s2);

        System.out.println(s2.delete(1,4));
        System.out.println(s2);

        System.out.println(s2.insert(1,"ven"));
        System.out.println(s2);

        System.out.println(s1);
        System.out.println(s1.charAt(3));




    }


}
