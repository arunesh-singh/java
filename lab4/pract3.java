/* 
  Write a class Chain where methods step1(), step2(), and step3() return this to
allow method chaining.
 */

class Car {
  private String model;
  private int mileage;
  private String color;

  public Car setModel(String model){
    this.model = model;
    return this;
  }
  
  public Car setMileage(int mileage){
    this.mileage = mileage;
    return this;
  }

  public Car setColor(String color){
    this.color = color;
    return this;
  }

  public void display(){
    System.out.println("Model: " + model + ", Mileage: " + mileage + ", Color: " + color );
  }
  
  public static void main(String[] args){
    Car car = new Car();
    car.setModel("Punch").setMileage(24).setColor("White").display();
  }
}
