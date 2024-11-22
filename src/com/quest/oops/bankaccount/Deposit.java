package com.quest.oops.bankaccount;

public class Deposit extends Transaction {


    @Override
    void processTransaction(BankAccount bankAccount) {
        bankAccount.deposit(amount);
    }

    public Deposit(double amount) {
        super(amount);
    }


}
