package main.java.com.example.demo;

public class BankAccount {
    public String ownerName;
    public double balance;

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        else {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ". New balance: " + balance);
    }
}
