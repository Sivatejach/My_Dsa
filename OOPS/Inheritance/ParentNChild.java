package OOPS.Inheritance;

// Parent class
class Animal{
    String breed;

    public void sound(){
        System.out.println("Animal makes sound");
    }

    public void eat(){
        System.out.println("Animal eats food");
    }
}


// Child class
class Dog extends Animal{
    String name="Dog";

    public void sound(){
        System.out.println("Dog barks");
    }

    public void eat(){
        System.out.println("Dog eats dog food");
    }
}


public class ParentNChild {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Output: Animal makes sound
        animal.eat();   // Output: Animal eats food

        System.out.println("*****************************");

        Dog dog = new Dog();
        dog.sound();    // Output: Dog barks
        dog.eat();      // Output: Dog eats dog food

        System.out.println("*****************************");

        // Upcasting
        Animal myDog = new Dog();
        myDog.sound();  // Output: Dog barks (overridden method)
        myDog.eat();    // Output: Dog eats dog food (overridden method)

        System.out.println("*****************************");
    }
}
