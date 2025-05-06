package OOPS.Inheritance;
// Parent class
class Parent{
    String name;
    int age;
    String address;
    public Parent(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
// Child class
class Child extends Parent{
    String schoolName;
    String grade;
    public Child(String name, int age, String address, String schoolName, String grade) {
        super(name, age, address); 
        this.schoolName = schoolName;
        this.grade = grade;
    }
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("School Name: " + schoolName);
        System.out.println("Grade: " + grade);
    }
    public void study() {
        System.out.println(name + " is studying in " + schoolName + " in grade " + grade + ".");
    }
}
public class ParentNChild {
    public static void main(String[] args) {
        Parent parent = new Parent("John Doe", 45, "123 Main St");
        parent.displayInfo();
        System.out.println("*****************************");
        Child child = new Child("Jane Doe", 15, "123 Main St", "ABC High School", "10th Grade");
        child.displayInfo();
        System.out.println("*****************************");
        child.study();

    }
}
