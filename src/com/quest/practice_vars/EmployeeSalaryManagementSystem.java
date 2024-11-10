package com.quest.practice_vars;

import java.util.Scanner;

public class EmployeeSalaryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Employees: ");
        int empNo = sc.nextInt();
        if (empNo < 0 || empNo > 100) {
            System.out.println("Enter valid input data");
        } else {
            double totalAverageSalaryForAllEmployees = 0;

            for (int i = 1; i <= empNo; i++) {
                System.out.println("Enter the name of employee" + i + ":");
                String name = sc.next();
                System.out.println("Enter the base salary of " + name + ":");
                double baseSalary = sc.nextDouble();
                System.out.println("Enter the bonus for Employee");
                double bonus = sc.nextDouble();

                double totalSalaryForYear = 0;

                System.out.println("Monthly Salary Breakdown for " + name + ":");
                double monthlySalary = baseSalary;
                for (int month = 1; month <= 12; month++) {
                    System.out.println("Month " + month + ":" + monthlySalary);
                    totalSalaryForYear += monthlySalary;
                    monthlySalary += 1000;
                }

                double averageMonthlySalary = totalSalaryForYear / 12;
                totalAverageSalaryForAllEmployees += averageMonthlySalary;


                System.out.println("---Employee Salary Report---");
                System.out.println("Employee Name: " + name);
                System.out.println("Employee BaseSalary: " + baseSalary);
                System.out.println("Employee Bonus: " + bonus);
                System.out.println("Total Salary for the year : " + totalSalaryForYear);
                System.out.println("Average Monthly salary : " + averageMonthlySalary);
            }

            double averageSalaryForAllEmployees = totalAverageSalaryForAllEmployees / empNo;
            System.out.println("Average Salary of All Employees:" + averageSalaryForAllEmployees);
            System.out.println("Thank you for using the Employee Salary Management System");
        }

    }
}



