package com.quest.oops.bankaccount;

public class Withdraw extends Transaction{
    public Withdraw(double amount) {
        super(amount);
    }

    @Override
    void processTransaction(BankAccount bankAccount) {
        bankAccount.withdraw(amount);
    }
}
