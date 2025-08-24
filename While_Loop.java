import java.util.Scanner;

public class WhileLoopWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();

        // Ask how far to go in the table
        System.out.print("Enter how far you want the table to go (e.g., 10): ");
        int limit = scanner.nextInt();

        int i = 1;

        // Use while loop to print the table
        while (i <= limit) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++; // Increase the counter
        }

        scanner.close();
    }
}