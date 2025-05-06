package OOPS.Polymorphism;


class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompilePoly {
    public static void main(String[] args) {
        MathUtils mu = new MathUtils();
        System.out.println(mu.add(2, 3));          // 5
        System.out.println(mu.add(2.5, 3.5));      // 6.0
        System.out.println(mu.add(1, 2, 3));       // 6
    }
}
