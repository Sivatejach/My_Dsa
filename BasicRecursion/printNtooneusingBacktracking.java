package BasicRecursion;

public class printNtooneusingBacktracking {
    public static void main(String[] args) {
        int n = 5; // Example input
        printNtoOne(n);
    }

    public static void printNtoOne(int n) {
        if(n==0) return;
        printNtoOne(n-1);
        System.out.println(n);
    }
}
