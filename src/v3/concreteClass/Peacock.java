package v3.concreteClass;

import v3.abstractClass.FlyingBird;

public class Peacock extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("Peacock flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Peacock makeSound");
    }

    @Override
    public void eat() {
        System.out.println("Peacock eat");
    }
}
