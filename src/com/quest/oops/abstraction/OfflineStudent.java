package com.quest.oops.abstraction;

public class OfflineStudent extends Student{
    @Override
    public void attendClass() {
        System.out.println("Offline Class");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Offlinestudent Submit assignment");
    }
}
