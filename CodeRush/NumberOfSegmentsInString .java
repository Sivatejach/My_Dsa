import java.util.Scanner;

class NumberOfSegmentsInString  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        String s=sc.nextLine();
        String[] segments = s.split(" ");
        int count = 0;
        for (String segment : segments) {
            if (!segment.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
        

    }
}
