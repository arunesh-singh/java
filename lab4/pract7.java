/* 
  Write a class Parent with a method display(), and a subclass Child with a constructor that uses super() to call the parent class constructor. Use both super.display() and this.display() in the child class.
 */

class Parent {

    public Parent() {
        System.out.println("Im the parent constructor");
    }

    void display() {
        System.out.println("Im the parent.");
    }
}

class Child extends Parent {

    public Child() {
        super();
        System.out.println("Im the child constructor.");
    }

    @Override
    void display() {
        System.out.println("Im the child.");
    }

    public void show() {
        super.display();
        this.display();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}
