/* 
  Create a class Building with overloaded constructors. Then create a class House that extends Building, and use super() to call different constructors from the superclass based on input parameters
 */

class Building {

    private String name;
    private int floors;
    private double area;

    public Building() {
        this.name = "";
        this.floors = 0;
        this.area = 0.0;
    }

    public Building(String name, int floors) {
        this.name = name;
        this.floors = floors;
        this.area = 0.0;
    }

    public Building(String name, int floors, double area) {
        this.name = name;
        this.floors = floors;
        this.area = area;
    }

    public Building(String name) {
        this(name, 1, 0.0);
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Floors: " + floors + ", Area: " + area);
    }

}

class House extends Building {

    public House() {
        super();
    }

    public House(String name) {
        super(name);
    }

    public House(String name, int floors) {
        super(name, floors);
    }

    public House(String name, int floors, int area) {
        super(name, floors, area);
    }

    public static void main(String[] args) {
        House h1 = new House();
        h1.displayInfo();

        House h2 = new House("DLF Mall");
        h2.displayInfo();

        House h3 = new House("Burj Khalifa", 50);
        h3.displayInfo();

        House h4 = new House("Department Building", 2, 60);
        h4.displayInfo();
    }

}
