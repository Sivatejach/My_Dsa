package OOPS.Abstraction;

interface Animal {
    void makeSound(); // abstract method
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class Absusinginterface {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); 
    }
}
