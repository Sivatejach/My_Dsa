package BasicRecursion;
public class Ntimesnameprintusingrecursion {
    public static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Your Name");
        printName(n - 1);
    }

    public static void main(String[] args) {
        printName(5);
    }
}
