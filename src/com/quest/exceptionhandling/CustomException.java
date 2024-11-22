package com.quest.exceptionhandling;

public class CustomException {
    public static void main(String[] args) {
        String name=null;
//        int i=null;
        try{
        System.out.println(name.length());
    }catch (NullPointerException e){
            System.out.println("Exception:"+e);
            e.printStackTrace();
        }
    }

}
