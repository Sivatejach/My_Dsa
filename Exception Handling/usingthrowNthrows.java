


//throw and throws are keywords in Java that are used to handle exceptions.
// The throw keyword is used to explicitly throw an exception, while the throws keyword is used in method signatures to declare that a method may throw one or more exceptions.
// The throw keyword is used to explicitly throw an exception, while the throws keyword is used in method signatures to declare that a method may throw one or more exceptions.

public class usingthrowNthrows {
     public static void main(String[] args) {
        int age = 15;
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }
    }
}
