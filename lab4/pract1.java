// Write a class Student with fields name and age. Create a constructor that uses the this
// keyword to distinguish between instance variables and parameters.

class Student {
  String name;
  String course;
  int rollNo;
  int age;

  public Student(String name, String course, int rollNo, int age) {
    this.name = name;
    this.course = course;
    this.rollNo = rollNo;
    this.age = age;
  }
}