/* 
  In the class Vehicle with a method move(), create a subclass Car that overrides move(). Use super.move() to call the superclass version inside the overridden method.
 */

class Vehicle {

    void move() {
        System.out.println("The vehicle is moving.");
    }
}

class Car extends Vehicle {

    @Override
    void move() {
        super.move();
        System.out.println("The car is moving.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.move();
    }
}
