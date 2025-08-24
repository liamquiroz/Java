import java.util.Scanner;

public class StringLengthCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Input second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if lengths are equal
        if (str1.length() == str2.length()) {
            System.out.println("The two strings are of equal length.");
        } else {
            System.out.println("The two strings are NOT of equal length.");
        }

        scanner.close();
    }
}