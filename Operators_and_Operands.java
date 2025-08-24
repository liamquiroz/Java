public class OperatorsExample {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b)); // 10 + 5 = 15
        System.out.println("Subtraction: " + (a - b)); // 10 - 5 = 5
        System.out.println("Multiplication: " + (a * b)); // 10 * 5 = 50
        System.out.println("Division: " + (a / b)); // 10 / 5 = 2
        System.out.println("Modulus: " + (a % b)); // 10 % 5 = 0

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a < b: " + (a < b)); // false
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a <= b: " + (a <= b)); // false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x)); // false
    }
}
