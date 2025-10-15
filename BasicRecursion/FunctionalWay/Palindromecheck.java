package BasicRecursion.FunctionalWay;

public class Palindromecheck {
    static int n=5;
    public static void main(String[] args) {
        String str = "madam";
        boolean result = isPalindrome(str, 0, str.length() - 1);
        boolean res=isPalindromewithoutusingrecursion(str);
        boolean resultval=isPalindromeusingsinglepointer(str,0,n);
        if (result && res && resultval) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left + 1, right - 1);
    }
    public static boolean isPalindromewithoutusingrecursion(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalindromeusingsinglepointer(String str,int i,int n){
        if(i>=n/2) return true;
        if(str.charAt(i)!=str.charAt(n-i-1)) return false;
        return isPalindromeusingsinglepointer(str,i+1,n);
    }
    public static void isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println(str + " is not a palindrome.");
                return;
            }
            left++;
            right--;
        }
        System.out.println(str + " is a palindrome.");
    }
    //We cant write Palindrome problem in Tail Recursion because we have to check the characters from both ends of the string
    //So we have to use Head Recursion
    //In Tail Recursion the recursive call is the last statement in the function
    //In Head Recursion the recursive call is the first statement in the function
}
