package com.quest.oops.bankaccount;

public abstract class Transaction {
    abstract void processTransaction(BankAccount bankAccount);

    public  double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }

}
