package main.lesson20231127.example4;

public class Bank {

    private String accountName;
    private double balance;
    private double interestRate;

    public Bank(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
        this.interestRate = 10.0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance > amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double calculateInterest(int duration) {
        while (duration >= 1) {
            balance = balance * (100 + this.interestRate) / 100;
            duration--;
        }
        return balance;
    }

}
