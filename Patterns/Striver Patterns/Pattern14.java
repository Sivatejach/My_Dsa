import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        char ch;
        for(int i=0;i<n;i++){
            ch='A';
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
                if(ch>'Z')
                    ch='A';
            }
            System.out.println();
        }
    }    
}
