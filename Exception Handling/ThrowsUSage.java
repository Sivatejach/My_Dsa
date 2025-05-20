



//Thorws is used to declare an exception that may be thrown by a method.
// It is used in the method signature to indicate that the method may throw a specific type of exception.


public class ThrowsUSage {
    public static void validateAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or older.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }
    public static void main(String[] args) {
        try{
            validateAge(15);
        }
        catch(Exception e){
            System.out.println("Caught Exception as : " + e.getMessage());
        }
        finally{
            System.out.println("This block always executes.");
        }   
    }
}
