public class Main {
    public static void main(String[] args) {
        // Creating object with default constructor
        Student student1 = new Student();
        student1.displayDetails();

        // Creating object with parameterized constructor
        Student student2 = new Student("Alice", 101, "Computer Science");
        student2.displayDetails();

        Student student3 = new Student("Bob", 102, "Mathematics");
        student3.displayDetails();

        // Forcing garbage collection (not guaranteed)
        student1 = null;
        student2 = null;
        System.gc(); // Hint to JVM to call finalize (for learning only)

        // End of program
        System.out.println("End of main method.");
    }
}

class Student {
    // Instance variables
    String name;
    int rollNo;
    String course;

    // Default Constructor
    Student() {
        name = "Not Provided";
        rollNo = 0;
        course = "Not Assigned";
        System.out.println("Default constructor called.");
    }

    // Parameterized Constructor
    Student(String n, int r, String c) {
        name = n;
        rollNo = r;
        course = c;
        System.out.println("Parameterized constructor called.");
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Course  : " + course);
        System.out.println("------------------------------");
    }

    // Destructor-like method (not commonly used)
    protected void finalize() throws Throwable {
        System.out.println("Student object (" + name + ") is being destroyed.");
    }
}