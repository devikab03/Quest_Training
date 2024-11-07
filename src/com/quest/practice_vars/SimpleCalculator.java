package com.quest.practice_vars;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter the first number: ");
         int num1 = sc.nextInt();
         double current_result=num1;

         while (true){
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.SquareRoot\n6.Clear Current Result\n7.Exit");
             System.out.println("Enter the choice:");
             int choice = sc.nextInt();
             switch(choice){
                 case 1:{
                     System.out.println("Enter the  number to add: ");
                     current_result=current_result+sc.nextDouble();
                     System.out.println("result : "+current_result);
                     break;
                 }
                 case 2:{
                     System.out.println("Enter the  number to subtract: ");
                     current_result=current_result-sc.nextDouble();
                     System.out.println("result : "+current_result);
                     break;
                 }
                 case 3:{

                     System.out.println("Enter the  number to multiply: ");
                     current_result=current_result*sc.nextDouble();
                     System.out.println("result : "+current_result);
                     break;
                 }
                 case 4:{
                     System.out.println("Enter the  number to divide: ");
                     int num2 = sc.nextInt();
                     if (num2==0){
                         System.out.println("Error:Cannot divide by zero");
                     }else {
                         current_result = current_result / num2;
                         System.out.println("result : "+current_result);
                     }
                     break;
                 }
                 case 5:{
                     if (current_result<0){
                         System.out.println("Error:You have entered a negative number");
                     }else {
                         current_result = Math.sqrt(current_result);
                         System.out.println("result : "+current_result);
                     }
                      break;
                 }
                 case 6:{

                     current_result =0;
                     System.out.println(" Clear current result: "+current_result);
                     break;

                 }
                 case 7:{
                     System.out.println("Do you want to perform another operation? (Y/N)");
                     String choice2 = sc.next();
                     if (choice2.equalsIgnoreCase("N")){
                         System.out.println("Exiting....");
                         return;
                     }else
                         break;
                 }
                 default:
                     System.out.println("Invalid choice");
             }

         }
    }
}
