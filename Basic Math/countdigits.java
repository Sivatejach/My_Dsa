import java.util.Scanner;


public class countdigits {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        int val=n;
        int rem;
        while(temp!=0){
           rem=temp%10;
           if(val%rem==0){
               count++;
              }
            temp=temp/10;
        }
        System.out.println("The number of digits that divide " + n + " is: " + count);
        sc.close();
    }
}