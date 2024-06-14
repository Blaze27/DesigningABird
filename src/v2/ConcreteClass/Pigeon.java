package v2.ConcreteClass;

import v2.abstractclass.Bird;

public class Pigeon extends Bird{
    @Override
    public void fly() {
        System.out.println("Pigeon flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Pigeon makeSound");
    }

    @Override
    public void dance() {
        System.out.println("Pigeon dance");
    }
}
