package cn.spbar.banking;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(long number, double initialBalance, double annualInterestRate, double overdraftLimit) {
        super(number, initialBalance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive!");
            return;
        }
        if (this.balance + overdraftLimit - amount < 0) {
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
        System.out.println("Account Type:\tCurrentAccount");
        System.out.printf("OD Limit:\tRM %.2f\n", overdraftLimit);
    }

    public void setOverdraftLimit(double odLimit) {
        if (odLimit <= 0) {
            System.out.println("Overdraft Limit must be positive!");
            return;
        }
        this.overdraftLimit = odLimit;
        System.out.printf("Success. New OD Limit:\tRM %.2f\n", this.overdraftLimit);
    }
}
