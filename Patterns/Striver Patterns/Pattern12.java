import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp=n+1;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(" "+j);
            }
            sp=sp-2;
            System.out.println();
        }
        sc.close();
    }
}
