/* 
  Create a parent class Animal with a method makeSound() and a subclass Dog that overrides this method. Use the super keyword to call the parent class's method in the overridden version.
*/

class Animal {
  void makeSound(){
    System.out.println("huh");
  }
}

class Dog extends Animal{
  @Override
  void makeSound(){
    super.makeSound();
    System.out.println("Bhoow");
  }

  public static void main(String[] args) {
      Dog dog = new Dog();
      dog.makeSound();
  }
}