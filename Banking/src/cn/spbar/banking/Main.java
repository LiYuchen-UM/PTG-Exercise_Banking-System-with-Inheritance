package cn.spbar.banking;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit = false;

        while (exit == false) { 
            System.out.println("\nSelamat datang XXX Bank!");
            System.out.println("Select your account type:");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Exit");
            System.out.print("\n> ");

            switch (sc.nextInt()) {
                case 1 -> savings();
                case 2 -> current();
                case 3 -> exit = true;
                default -> System.out.println("Invaild input!");
            }
        }
    }

    static void savings() {
        
        System.out.print("Enter Account No.:\t");
        long number = sc.nextInt();
        System.out.print("Enter Initial Bal:\tRM ");
        double initialBalance = sc.nextDouble();
        System.out.print("Enter Annual IR:\t");
        double annualInterestRate = sc.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(number, initialBalance, annualInterestRate);

        boolean exit = false;
        while (exit == false) {
            System.out.println("\nSelect Service");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Account Info");
            System.out.println("4. Check Interest");
            System.out.println("5. Exit");
            System.out.print("\n> ");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.print("\nEnter Deposit Amount:\tRM ");
                    double amount = sc.nextDouble();
                    savingsAccount.deposit(amount);
                }
                case 2 -> {
                    System.out.print("\nEnter Withdraw Amount:\tRM ");
                    double amount = sc.nextDouble();
                    savingsAccount.withdraw(amount);
                }
                case 3 -> {
                    savingsAccount.info();
                    System.out.print("\nPress Enter to continue...\n> ");
                    sc.nextLine();
                    sc.nextLine();
                }
                case 4 -> System.out.printf("Monthly Interest:\tRM %.2f\n", savingsAccount.calculateInterest());
                case 5 -> exit = true;
                default -> System.out.println("Invaild input!");
            }
        }
    }

    static void current() {

        System.out.print("Enter Account No.:\t");
        int number = sc.nextInt();
        System.out.print("Enter Initial Bal:\tRM ");
        double initialBalance = sc.nextDouble();
        System.out.print("Enter Annual IR:\t");
        double annualInterestRate = sc.nextDouble();
        System.out.print("Enter Overdraft Limit:\tRM ");
        double overdraftLimit = sc.nextDouble();

        CurrentAccount currentAccount = new CurrentAccount(number, initialBalance, annualInterestRate, overdraftLimit);

        boolean exit = false;
        while (exit == false) {
            System.out.println("\nSelect Service");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Set Overdraft Limit");
            System.out.println("4. Account Info");
            System.out.println("5. Check Interest");
            System.out.println("6. Exit");
            System.out.print("\n> ");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.print("\nEnter Deposit Amount:\tRM ");
                    double amount = sc.nextDouble();
                    currentAccount.deposit(amount);
                }
                case 2 -> {
                    System.out.print("\nEnter Withdraw Amount:\tRM ");
                    double amount = sc.nextDouble();
                    currentAccount.withdraw(amount);
                }
                case 3 -> {
                    System.out.print("\nEnter Overdraft Limit:\tRM ");
                    double odLimit = sc.nextDouble();
                    currentAccount.setOverdraftLimit(odLimit);
                }
                case 4 -> {
                    currentAccount.info();
                    System.out.print("\nPress Enter to continue...\n> ");
                    sc.nextLine();
                    sc.nextLine();
                }
                case 5 -> System.out.printf("Monthly Interest:\tRM %.2f\n", currentAccount.calculateInterest());
                case 6 -> exit = true;
                default -> System.out.println("Invaild input!");
            }
        }
    }
}
