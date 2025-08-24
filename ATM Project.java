import java.util.Scanner;

public class ATMSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 5000.0;
        int choice;
        boolean running = true;

        System.out.println("=========================================");
        System.out.println("           Welcome to Tarak's ATM");
        System.out.println("=========================================");

        while (running) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;

               case 2:
                    System.out.print("Enter amount to deposit: $");
                double deposit = scanner.nextDouble();
            if (deposit > 0) {
                balance += deposit;
                System.out.println("Amount deposited successfully.");
                System.out.println("New balance: $" + balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
            break;

        case 3:
            System.out.print("Enter amount to withdraw: $");
            double withdraw = scanner.nextDouble();
            if (withdraw > 0 && withdraw <= balance) {
                balance -= withdraw;
                System.out.println("Please collect your cash.");
                System.out.println("Remaining balance: $" + balance);
            } else if (withdraw > balance) {
                System.out.println("Insufficient balance.");
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
            break;

        case 4:
            System.out.println("Thank you for using Tarak's ATM. Goodbye!");
            running = false;
            break;
            }
         }
         scanner.close();
      }
  }