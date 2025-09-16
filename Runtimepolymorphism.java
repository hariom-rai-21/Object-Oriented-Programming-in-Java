// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class OverridingExample {
    public static void main(String[] args) {
        Animal a; // reference of Animal

        a = new Dog();  // Dog object
        a.sound();      // Output: Dog barks

        a = new Cat();  // Cat object
        a.sound();      // Output: Cat meows
    }
}
