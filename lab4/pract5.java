/* 
  Write a class Person with a constructor that accepts name and age. Create a subclass Employee that accepts name, age, and salary, and use super() to initialize the name and age
 */

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {

    int salary;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Arunesh", 12, 2000);
        emp.display();
    }
}
