/*
 * Create two interfaces Flying and Swimming, each with a method void fly() and void
 * swim() respectively. Create a class Duck that implements both interfaces and overrides both
 * methods. Write a test class that demonstrates the Duck's ability to both fly and swim.
 */

interface Flying {
    void fly();
}

interface Swimming {
    void swim();
}

class Duck implements Flying, Swimming {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying in the sky!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming in the pond!");
    }

    public void quack() {
        System.out.println(name + " says: Quack! Quack!");
    }
}

public class pract8 {
    public static void main(String[] args) {
        Duck duck = new Duck("Donald");

        duck.fly();
        duck.swim();
        duck.quack();

        System.out.println("\nDemonstrating polymorphism:");
        Flying flyingDuck = duck;
        flyingDuck.fly();

        Swimming swimmingDuck = duck;
        swimmingDuck.swim();
    }
}
