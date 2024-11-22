package com.quest.exceptionhandling;

public class Student {
    private int id;
    private String name;
    private int[] marks;

    public Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void element(int index) {
        if (index >= marks.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            System.out.println("Marks at index:" + marks[index]);
        }
    }


}
