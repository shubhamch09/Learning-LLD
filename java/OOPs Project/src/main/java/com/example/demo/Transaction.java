package main.java.com.example.demo;

import java.util.List;

public class Transaction {

    private double balance;
    private String ownerName;
    private List<String> transactionHistory;


    public Transaction()
    {
        this.ownerName = "Unknown";
        this.balance = 0.0;
        this.transactionHistory = new java.util.ArrayList<>();
    }

    public Transaction(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.transactionHistory = new java.util.ArrayList<>();
        transactionHistory.add("Account created for "+ownerName + "with initial balance: " + initialBalance);
    }

    public String getOwnerName(){
        return ownerName;
    }
}
