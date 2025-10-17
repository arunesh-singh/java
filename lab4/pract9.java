/* 
  Create a class with an inner class and use this to refer to the outer class’s instance variables or methods.
 */

class OuterClass {

    String name;

    public OuterClass(String name) {
        this.name = name;
    }

    void displayOuter() {
        System.out.println("Outer Class Name: " + name);
    }

    class InnerClass {

        void displayInner() {
            System.out.println("Inner Class Name: " + name);
            displayOuter();
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass("Outer variable");

        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.displayInner();
    }
}
