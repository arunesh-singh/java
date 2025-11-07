/* 
 * Create a class Employee with fields name, id, designation, and salary. Implement
multiple constructors that initialize different combinations of these fields, and ensure that they
chain to a primary constructor using the this() keyword.
 */

 class Employee {
    String name;
    String id;
    String designation;
    double salary;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Employee(String name, String id, String designation) {
        this(name, id);
        this.designation = designation;
    }

    public Employee(String name, String id, String designation, double salary) {
        this(name, id, designation);
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name + ", ID: " + id + ", Designation: " + designation + ", Salary: " + salary);
    }
}

public class prac2 {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "E001");
        Employee emp2 = new Employee("Bob", "E002", "Manager");
        Employee emp3 = new Employee("Charlie", "E003", "Developer", 75000);

        emp1.display();
        emp2.display();
        emp3.display();
    }
}
