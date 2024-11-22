package com.quest.oops.bankaccount;

public class SavingsAccount extends BankAccount {
    double minimumBalance = 500;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        double minimumBalance = 500;
        if (getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance");

        }


    }
}
