package org.mugurtas.medium.access_modifier;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter method to access the private balance
    public double getBalance() {
        return balance;
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
