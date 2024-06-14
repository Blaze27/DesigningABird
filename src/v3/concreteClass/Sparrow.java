package v3.concreteClass;

import v3.abstractClass.FlyingBird;

public class Sparrow extends FlyingBird{
    @Override
    public void fly() {
        System.out.println("Sparrow Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow MakeSound");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow Eat");
    }
}
