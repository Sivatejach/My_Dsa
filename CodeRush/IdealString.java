
// Find the return minimum number of removals and also ideal string
// Input : XYXXYXXY
// output : 2

public class IdealString {
    public static String minRemoval(String input) {
        StringBuilder sb=new StringBuilder(input);
        int remcount=0;
        for(int i=0;i<sb.length()-1;i++){
            if(sb.charAt(i)== sb.charAt(i+1)){
                sb.deleteCharAt(i);
                remcount++;
                i--;
            }
        }
        return String.valueOf(remcount);
    }
    public static void main(String[] args) {
        String input = "aabbb";
        System.out.println("Ideal String: " + minRemoval(input));
    }
}