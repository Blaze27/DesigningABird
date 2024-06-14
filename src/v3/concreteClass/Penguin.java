package v3.concreteClass;

import v3.abstractClass.NonFlyingBird;

public class Penguin extends NonFlyingBird {

    @Override
    public void makeSound() {
        System.out.println("Penguin made sound");
    }

    @Override
    public void eat() {
        System.out.println("Penguin eat");
    }
}
