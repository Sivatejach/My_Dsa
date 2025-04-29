


class ReverseanInteger {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x)); // Output: 321
    }

    public static int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) ? 0 : (int) reversed;
    }
}
