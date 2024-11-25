package com.quest.exceptionproblem;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) throws InvalidInputException {
        this.name = name;
        if(age<18){
            throw new InvalidInputException("Age below 18 is not applicable");
        }
        if(salary<0){
            throw new InvalidInputException("Salary Cannot be negative");
        }

        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }

    final public void display(){
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }

}
