package BasicRecursion;

public class printNtooneusingBacktracking {
    public static void main(String[] args) {
        int n = 5; 
        printNtoOne(1,n);
    }

    public static void printNtoOne(int i,int n) {
        if(i>n) return;
        printNtoOne(i+1,n);
        System.out.println(i);
    }
}
