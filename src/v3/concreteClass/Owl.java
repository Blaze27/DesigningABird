package v3.concreteClass;

import v3.abstractClass.FlyingBird;

public class Owl extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("Owl flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Owl makeSound");
    }

    @Override
    public void eat() {
        System.out.println("Owl eat");
    }
}
