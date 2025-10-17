/* 
  Implement a Human class with two constructors. Create a Student class that calls both the Human constructors in different ways using super().
 */

class Human {

    String name;
    int age;

    public Human() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default constructor called.");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor called for " + name);
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Human {

    String course;

    public Student(String course) {
        this.course = course;
        System.out.println("Student Constructor 1");
    }

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
        System.out.println("Student Constructor 2");
    }

}

public class pract10 {

    public static void main(String[] args) {
        Student student1 = new Student("MCA");
        student1.display();
        System.out.println();

        Student student2 = new Student("Alice", 20, "BSC");
        student2.display();
    }
}
