import java.util.Scanner;

class ATM {
    private float balance;
    private final int PIN = 5674;
    private static final Scanner sc = new Scanner(System.in);

    public void checkPin() {
        while (true) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();
            if (enteredPin == PIN) {
                menu();
                break;
            } else {
                System.out.println("Invalid PIN. Try again.\n");
            }
        }
    }

    public void menu() {
        while (true) {
            System.out.println("----------------------------- ");
            System.out.println("        ATM SERVICE");
            System.out.println("----------------------------- ");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your Choice: ");

            int opt = sc.nextInt();
            switch (opt) {
                case 1 -> checkBalance();
                case 2 -> withdrawMoney();
                case 3 -> depositMoney();
                case 4 -> {
                    System.out.println("Thank you for using ATM Service.");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance + "\n");
    }

    public void withdrawMoney() {
        System.out.print("Enter amount to withdraw: ");
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient Balance\n");
        } else {
            balance -= amount;
            System.out.println("Money Withdrawal Successful\n");
        }
    }

    public void depositMoney() {
        System.out.print("Enter the amount to deposit: ");
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Money Deposited Successfully\n");
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}