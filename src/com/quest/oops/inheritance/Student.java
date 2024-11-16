package com.quest.oops.inheritance;

public class Student extends Person {
    String schoolName;
    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println("Student is:"+this.name);
    }

    @Override
    public void nameDisplay() {
        super.nameDisplay();
        System.out.println("I study at:"+schoolName);
    }
}
