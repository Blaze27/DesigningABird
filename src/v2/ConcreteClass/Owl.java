package v2.ConcreteClass;

import v2.abstractclass.Bird;

public class Owl extends Bird {
    @Override
    public void fly() {
        System.out.println("Owl flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Owl makeSound");
    }

    @Override
    public void dance() {
        System.out.println("Owl dance");
    }
}
