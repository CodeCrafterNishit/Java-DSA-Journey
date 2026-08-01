package OOPS.Abstraction;

interface Bird {
    void fly();

    void eat();
}

class Sparrow implements Bird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void eat() {
        System.out.println("Sparrow is eating");
    }
}

class Crow implements Bird {
    public void fly() {
        System.out.println("Crow is flying");
    }

    public void eat() {
        System.out.println("Crow is eating");
    }
}

public class Main {
    public static void doBirdStuff(Bird b) {
        b.fly();
        b.eat();
    }

    public static void main(String[] args) {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}

// 🔑 Key Points of Abstraction in Your Code
// Interface (Bird):
// Defines what a bird can do (fly, eat) but not how. This is the essence of abstraction—hiding implementation details and exposing only essential behavior.

// Concrete Classes (Sparrow, Crow):
// Each class provides its own implementation of the abstract methods.

// Sparrow → "Sparrow is flying", "Sparrow is eating"

// Crow → "Crow is flying", "Crow is eating"

// Polymorphism via Abstraction:
// The method doBirdStuff(Bird b) accepts any Bird type. It doesn’t care whether it’s a Sparrow or a Crow. This shows how abstraction allows writing flexible, reusable code.

// Main Method:
// By calling doBirdStuff(new Sparrow()) and doBirdStuff(new Crow()), you demonstrate how different implementations can be used interchangeably through the abstract interface.

// 🧩 Why This Is a Good Example
// It clearly separates interface (contract) from implementation (details).

// It shows runtime polymorphism: the same method (doBirdStuff) works with different bird types.

// It’s simple, easy to understand, and highlights the purpose of abstraction: focus on what an object does, not how it does it.