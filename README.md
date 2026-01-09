# Banking System with Inheritance

Demo Video: [https://youtu.be/FOjBIkmgF-8](https://youtu.be/FOjBIkmgF-8 "https://youtu.be/FOjBIkmgF-8")

## Features

- A simple banking system implemented using Java inheritance.
- Core classes:
  - `Account` (abstract base class): defines common account attributes and operations.
  - `SavingsAccount`: represents a savings account with minimum balance and monthly interest calculation.
  - `CurrentAccount`: represents a current account that allows overdraft without transaction fees.
- Supported operations:
  - Deposit
  - Withdraw
  - Monthly interest calculation
  - Overdraft (Current Account)
  - Display account information

## Concepts:

- Inheritance
- Overriding
- Encapsulation

## Description:

- Base class: Account
- Subclasses: SavingsAccount, CurrentAccount
- Each subclass overrides calculateInterest() and withdraw() rules.

## Challenge:

Implement validation logic and monthly interest computation.