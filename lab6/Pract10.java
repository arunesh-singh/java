import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class AccountLockedException extends Exception {
    public AccountLockedException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;
    private boolean locked;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.locked = false;
    }

    public void deposit(double amount) throws InvalidAmountException, AccountLockedException {
        if (locked) {
            throw new AccountLockedException("Account is locked");
        }
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ", New balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException, AccountLockedException {
        if (locked) {
            throw new AccountLockedException("Account is locked");
        }
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
    }

    public void lockAccount() {
        locked = true;
        System.out.println("Account locked");
    }

    public void unlockAccount() {
        locked = false;
        System.out.println("Account unlocked");
    }

    public double getBalance() {
        return balance;
    }
}

public class Pract10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        while (true) {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Lock Account");
            System.out.println("5. Unlock Account");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmt = sc.nextDouble();
                        account.deposit(depositAmt);
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmt = sc.nextDouble();
                        account.withdraw(withdrawAmt);
                        break;

                    case 3:
                        System.out.println("Current balance: " + account.getBalance());
                        break;

                    case 4:
                        account.lockAccount();
                        break;

                    case 5:
                        account.unlockAccount();
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid option");
                }

            } catch (InsufficientFundsException | InvalidAmountException | AccountLockedException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.nextLine();
            }
        }
    }
}
