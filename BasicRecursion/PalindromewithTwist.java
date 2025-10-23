package BasicRecursion;

import java.util.*;
public class PalindromewithTwist {
    static List<Integer> al=new ArrayList<>();
    public static boolean palindrome(String s,int i,int n){
        if(i>n+1/2) return true;
        if(s.charAt(i)!=s.charAt(n)){
            al.add(i);
        }
        return palindrome(s,i+1,n-1);
        }
    public static boolean canBecomePalindrome(String s) {
        // Code Here
        palindrome(s,0,s.length()-1);
        if(al.size()==2){
            s.replace(s.charAt(al.get(0)),s.charAt(al.get(1)));
            if(palindrome(s,0,s.length()-1)){
                return true;
            }
        }
        if(al.size()==1){
            s.replace(s.charAt(al.get(0)),s.charAt((s.length()/2)-1));
            if(palindrome(s,0,s.length()-1)){
                return true;
            }
        }
        if(al.size()==0) return true;
        return false;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(canBecomePalindrome(s));
        sc.close();
    }
}