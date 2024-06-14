package v3.concreteClass;

import v3.abstractClass.FlyingBird;

public class Pigeon extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("Pigeon flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Pigeon makeSound");
    }

    @Override
    public void eat() {
        System.out.println("Pigeon eat");
    }
}
