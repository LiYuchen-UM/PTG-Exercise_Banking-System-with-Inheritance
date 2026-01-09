package cn.spbar.banking;

public abstract class Account {
    protected int number;
    protected double balance;
    protected double annualInterestRate;

    public Account(int number, double initialBalance, double annualInterestRate) {
        this.number = number;
        this.balance = initialBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive!");
            return;
        }
        else this.balance += amount;
        System.out.printf("Success. New balance:\tRM %.2f\n", this.balance);
    }

    public abstract void withdraw(double amount);
    public abstract double calculateInterest();

    public void info() {
        System.out.println("=== Account Info ===");
        System.out.println("Account No:\t" + number);
        System.out.printf("Balance:\tRM %.2f\n", balance);
        System.out.println("Annual IR:\t" + annualInterestRate * 100 + "%");
    }
}
