// Write a Java class Student that has multiple constructors. One constructor should accept
// student name and ID, while another should accept student name, ID, and grades. Implement
// constructor overloading and ensure the constructors call each other using this().

import java.util.Arrays;

class Student{
    String name;
    String id;
    char[] grades;

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    public Student(String name, String id, char[] grades){
        this(name, id);
        this.grades = grades;
    }

    void display(){
        System.out.println("Student Name: " + name + ", ID: " + id + ", Grades: " + Arrays.toString(grades));
    }
}

public class pract1 {

    public static void main(String[] args) {
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002", new char[]{'A', 'B', 'A'});

        student1.display();
        student2.display();
    }
}
