import java.util.Scanner;

public class StringLengthChecker {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Prompt user for input
System.out.print("Enter first string: ");
String str1 = scanner.nextLine();

System.out.print("Enter second string: ");
String str2 = scanner.nextLine();

// Check if the lengths are equal
if (str1.length() == str2.length()) {
System.out.println("Both strings are of equal length.");
} else {
System.out.println("The strings are of different lengths.");
}

scanner.close();
}
}