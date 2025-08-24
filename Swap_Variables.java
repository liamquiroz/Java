import java.util.Scanner;

public class SwapVariables {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Prompt user for input
System.out.print("Enter the first number: ");
int a = scanner.nextInt();

System.out.print("Enter the second number: ");
int b = scanner.nextInt();

// Display values before swapping
System.out.println("Before swapping: a = " + a + ", b = " + b);

// Swap logic without using a third variable
a = a + b;
b = a - b;
a = a - b;

// Display values after swapping
System.out.println("After swapping: a = " + a + ", b = " + b);

scanner.close();
}
}