package com.quest.oops.bankaccount;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        double overDraftLimit = 1000;
        if(getBalance()+amount >= overDraftLimit) {
            super.withdraw(amount);
        }else {
            System.out.println("Overdraft limit exceeded");
        }

    }

}