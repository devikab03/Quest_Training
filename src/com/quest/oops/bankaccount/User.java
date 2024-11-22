package com.quest.oops.bankaccount;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bank Account Management");
        BankAccount bankAccount = null;

        while (true) {
            System.out.println("1.Create savings Account");
            System.out.println("2.Create current Account");
            System.out.println("3.Deposit Money");
            System.out.println("4.Withdraw Money");
            System.out.println("5.Display Account details");
            System.out.println("6.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Account Number");
                    String savingsAccountNumber = sc.next();
                    System.out.println("Enter Account Name");
                    String savingsAccountName = sc.next();
                    System.out.println("Enter Account InitialBalance");
                    int savingsAccountBalance = sc.nextInt();
                    bankAccount = new SavingsAccount(savingsAccountNumber, savingsAccountName, savingsAccountBalance);
                    System.out.println("Savings Account Created");
                    break;
                case 2:
                    System.out.println("Enter Account Number");
                    String currentAccountNumber = sc.next();
                    System.out.println("Enter Account Name");
                    String currentAccountName = sc.next();
                    System.out.println("Enter Account Balance");
                    int currentAccountBalance = sc.nextInt();
                    bankAccount = new CurrentAccount(currentAccountNumber, currentAccountName, currentAccountBalance);
                    System.out.println("Current Account Created");
                    break;
                case 3:
                    System.out.println("Enter deposit Money");
                    int depositMoney = sc.nextInt();
                    Transaction deposit = new Deposit(depositMoney);
                    deposit.processTransaction(bankAccount);
                    break;
                case 4:
                    System.out.println("Enter withdraw Money");
                    int withdrawMoney = sc.nextInt();
                    Transaction withdraw = new Withdraw(withdrawMoney);
                    withdraw.processTransaction(bankAccount);
                    break;
                case 5:
                    System.out.println("Display Account details");
                    if (bankAccount == null) {
                        System.out.println("Account Not Found");
                    } else {
                        bankAccount.display();
                    }
                    break;
                case 6:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid choice");


            }

        }
    }

}
