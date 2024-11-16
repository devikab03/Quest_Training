package com.quest.oops.abstraction;

public class AbstractionExample {

//    public static void display(Student student) {
//        student.attendClass();
//        student.submitAssignment();
//        student.study();
//    };
    public static void main(String[] args) {
//        display(new OnlineStudent());
        Student online = new OnlineStudent();
       // display(online);
        Student offline = new OfflineStudent();
        Student regular = new RegularStudent();
        online.attendClass();
        online.submitAssignment();
        online.study();
        offline.attendClass();
        offline.submitAssignment();
        regular.attendClass();
        regular.submitAssignment();
        //System.out.println("_______________________________________________");
//        Student onlinestudent = StudentFactory.getStudent("online");
//        Student offlinestudent = StudentFactory.getStudent("offline");
//        Student regularstudent = StudentFactory.getStudent("regular");
//        onlinestudent.attendClass();
//        offlinestudent.attendClass();
//        regularstudent.attendClass();
//        onlinestudent.submitAssignment();
//        offlinestudent.submitAssignment();
//        regularstudent.submitAssignment();
    }
}
