// Compile-time Polymorphism (Method Overloading)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Runtime Polymorphism (Method Overriding)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Abstract Class
abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Most vehicles use fuel");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

// Interface
interface Flyable {
    void fly();
}

interface Landable {
    void land();
}

// Class implementing multiple interfaces
class Airplane implements Flyable, Landable {
    public void fly() {
        System.out.println("Airplane is flying");
    }

    public void land() {
        System.out.println("Airplane is landing");
    }
}

public class Main {
    public static void main(String[] args) {

        // Compile-time Polymorphism
        Calculator calc = new Calculator();
        System.out.println("Sum (int): " + calc.add(2, 3));
        System.out.println("Sum (double): " + calc.add(2.5, 3.7));

        // Runtime Polymorphism
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();     // Dog's sound
        a2.sound();     // Cat's sound

        // Abstract Class Example
        Vehicle myCar = new Car();
        myCar.start();
        myCar.fuelType();

        // Interface Example
        Airplane plane = new Airplane();
        plane.fly();
        plane.land();
    }
}