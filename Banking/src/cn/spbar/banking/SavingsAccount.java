package cn.spbar.banking;

public class SavingsAccount extends Account {    
    public SavingsAccount(long number, double initialBalance, double annualInterestRate) {
        super(number, initialBalance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive!");
            return;
        }
        if (this.balance - amount < 0) {
            System.out.println("No enough balance!");
            return;
        }
        this.balance -= amount;
        System.out.printf("Success. New balance:\tRM %.2f\n", this.balance);
    }

    @Override
    public double calculateInterest() {
        if (balance <= 0) return 0;
        return balance * (annualInterestRate / 12.0);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Account Type:\tSavingsAccount");
    }
}
