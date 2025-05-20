package Doubts;

@FunctionalInterface
interface Add{
    int add(int a, int b);
}
public class Lamdaimpl implements Add {
   
    public static void main(String[] args) {

        Add a = (int x, int y) -> x + y;
        System.out.println(a.add(10, 20));

        Add al=new Lamdaimpl(){
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(al.add(0, 20));

        Add al2=new Lamdaimpl();
        System.out.println(al2.add(11, 22));
    }

    @Override
    public int add(int a, int b) {

        return a + b;
    }
    
}
