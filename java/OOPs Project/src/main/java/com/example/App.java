package com.example;

import main.java.com.example.demo.BankAccount;
import main.java.com.example.demo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    // For students

    // public static void main( String[] args )
    // {
    //     Student student = new Student();
    //     student.name = "Shubham";
    //     student.age = 29;
    //     student.batch = "Dec 24";

    //     Student student2 = new Student();
    //     student2.name = "John";
    //     student2.age = 30;
    //     student2.batch = "Jan 25";

    //     System.out.println("Student Details:");
    // }

    // For BankAccount
    public static void main( String[] args )
    {
        BankAccount account = new BankAccount();
        account.ownerName = "Shubham";
        account.balance = 1000.0;


         // Deposit money
        account.deposit(500.0);

        // Withdraw money
        account.withdraw(200.0);

        // Attempt to withdraw more than the balance
        account.withdraw(2000.0);
    }

   
}
