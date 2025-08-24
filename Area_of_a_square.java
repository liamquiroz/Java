public class SquareArea {

    public static void main(String[] args) {
        double side = 5.0;

        // Method 1: Multiplying the side by itself
        double area1 = side * side;
        System.out.println("Area using multiplication: " + area1);

        // Method 2: Using Math.pow()
        double area2 = Math.pow(side, 2);
        System.out.println("Area using Math.pow(): " + area2);
    }
}