package com.pluralsight.finance;

public class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;
    double deposit;
    double withdraw;

    public BankAccount(String name, String accountNumber, double balance, double deposit, double withdraw) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
