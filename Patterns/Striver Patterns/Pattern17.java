import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        char ch;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  "); 
            }

            int bpoint= (2*i+1)/2;
            ch='A';

            for(int j=1;j<=2*i +1 ;j++){
                System.out.print(ch+" ");
                if(j <= bpoint) ch++;
                else ch--;
                
            }
            System.out.println();
        }
        sc.close();
    }    
}
