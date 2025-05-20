package Doubts;

class Student {
    String name;
    int age;

    // Regular constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println(this.name + " - " + this.age);
    }
}

public class CopyConst {
    public static void main(String[] args) {
        Student s1 = new Student("Siva", 22);
        Student s2 = new Student(s1);  // using copy constructor

        s1.display();  // Output: Siva - 22
        s2.display();  // Output: Siva - 22
    }
}
