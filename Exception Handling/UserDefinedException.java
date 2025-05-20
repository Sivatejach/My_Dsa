


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// This is a custom exception class that extends the Exception class.
// It is used to handle specific error conditions in the program.



public class UserDefinedException {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }
    public static void main(String[] args) {
        try {
            int age = 15; // Example age
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException: " +
            e.getMessage());
        }
         finally {
            System.out.println("This block always executes.");
        }
        System.out.println("Program continues after exception handling.");
    }
}
