import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        char ch;
        for(int i=0;i<n;i++){
            sb= new StringBuilder();
            ch=(char) ('A' + n - 1 );
            for(int j=0;j<=i;j++){
                sb.append(" "+ch);
                ch--;
            }
            System.out.println(sb.reverse().toString());
            
        }
        
    }
}
