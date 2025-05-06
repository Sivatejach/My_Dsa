package OOPS.Encapsulation;

public class Student {
    private String name;
    private int age;
    private String rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be positive.");
        }
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }


    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("John Doe");
        s1.setAge(20);
        s1.setRollNo("12345");
        s1.displayInfo();
        System.out.println("*****************************");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("*****************************");
        s1.setAge(-5); 
        System.out.println("*****************************");
        s1.displayInfo(); 

    }
}
