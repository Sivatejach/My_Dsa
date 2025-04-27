import java.util.Scanner;

class IndexOfFirstOcc  {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String haystack = sc.nextLine(); 
        String needle = sc.nextLine();
        int index = haystack.indexOf(needle);

        System.out.println(index); /
    }
}
