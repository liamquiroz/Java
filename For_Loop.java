import java.util.Scanner;

public class TableWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();

        // Ask how far the user wants the table to go
        System.out.print("Enter how far you want the table to go (e.g., 10): ");
        int limit = scanner.nextInt();

        System.out.println("\nMultiplication Table of " + number + ":");

        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}