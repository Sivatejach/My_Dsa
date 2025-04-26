
import java.util.*; 

public class FizzBizz {
    public static List<String>  fizzBuzz(int n) {
 
        List<String> ans = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            ans.add(i % 15 == 0 ? "FizzBuzz" : i % 5 == 0  ? "Buzz" : i % 3 == 0  ? "Fizz" : String.valueOf(i));
        }

        return ans;
    }

    public static void main(String[] args) {

        int n1 = 15;
        System.out.println("Input: n = " + n1);
        System.out.println("Output: " + fizzBuzz(n1));

        int n2 = 5;
        System.out.println("Input: n = " + n2);
        System.out.println("Output: " + fizzBuzz(n2));

    }
}