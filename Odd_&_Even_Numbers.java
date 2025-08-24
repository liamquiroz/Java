import java.util.Scanner;

public class OddEvenConverter {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Prompt user for input
System.out.print("Enter a number: ");
int number = scanner.nextInt();

// Check if the number is odd or even
if (number % 2 == 0) {
System.out.println(number + " is even.");
number += 1; // Convert even to odd
System.out.println("Converted to odd: " + number);
} else {
System.out.println(number + " is odd.");
number -= 1; // Convert odd to even
System.out.println("Converted to even: " + number);
}

scanner.close();
}
}