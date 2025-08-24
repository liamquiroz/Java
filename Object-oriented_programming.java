// Base class for Inheritance
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

// Encapsulation and Access Modifiers
class Person {
    private String name; // private variable

    public void setName(String name) { // public setter
        this.name = name;
    }

    public String getName() { // public getter
        return name;
    }
}

// Class and Object Example
class Car {
    String model;
    String color;

    void start() {
        System.out.println(model + " is starting. Color: " + color);
    }
}

// Arrays of Objects Example
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Working with Car object
        Car myCar = new Car();
        myCar.model = "Toyota";
        myCar.color = "Red";
        myCar.start();

        // Encapsulation example
        Person p = new Person();
        p.setName("Alice");
        System.out.println("Person's Name: " + p.getName());

        // Array of Student objects
        Student[] students = new Student[3];
        students[0] = new Student("Bob");
        students[1] = new Student("Charlie");
        students[2] = new Student("Diana");

        System.out.println("Student List:");
        for (Student s : students) {
        s.display();
        }

        // Inheritance examples
        Dog dog = new Dog();
        dog.eat();   // inherited from Animal
        dog.bark();

        Puppy puppy = new Puppy();
        puppy.eat();   // from Animal
        puppy.bark();  // from Dog
        puppy.weep();  // from Puppy

        Cat cat = new Cat();
        cat.eat();   // from Animal
        cat.meow();  // specific to Cat
    }
}