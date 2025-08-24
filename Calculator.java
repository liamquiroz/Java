import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        // Performing the operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                System.out.println("Error: Division by zero is not allowed.");
                return; // exit the program
            }
            break;
        default:
            System.out.println("Error: Invalid operator.");
            return; // exit the program
     }

      // Displaying results
      System.out.println("Result (double): " + result);

      // Explicit casting from double to int
      int intResult = (int) result;
      System.out.println("Result (int after casting): " + intResult);
    }
}