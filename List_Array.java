import java.util.ArrayList;

public class ArrayExample {

    public static void main(String[] args) {

        // One-Dimensional Array
        int[] ages = {20, 21, 22, 23};
        System.out.println("One-Dimensional Array:");
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Age[" + i + "] = " + ages[i]);
        }

        // Two-Dimensional Array
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };
        System.out.println("\nTwo-Dimensional Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();

        // Multi-Dimensional Array
        int[][][] cube = new int[2][2][2];
        cube[0][0][0] = 5;
        System.out.println("\nMulti-Dimensional Array:");
        System.out.println("cube[0][0][0] = " + cube[0][0][0]);
    

        // ArrayList Example
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("\nArrayList Operations:");
        System.out.println("Initial list: " + fruits);

        fruits.set(1, "Mango"); // Replace Banana with Mango
        System.out.println("After set: " + fruits);

        fruits.remove(0); // Remove Apple
        System.out.println("After remove: " + fruits);

        System.out.println("Element at index 0: " + fruits.get(0));
        System.out.println("List contains 'Cherry': " + fruits.contains("Cherry"));
        System.out.println("List size: " + fruits.size());

        fruits.clear();
        System.out.println("After clear, List: " + fruits);
    }
}