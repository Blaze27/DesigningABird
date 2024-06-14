package v2.ConcreteClass;

import v2.abstractclass.Bird;

public class Peacock extends Bird {
    @Override
    public void fly() {
        System.out.println("Peacock flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Peacock makeSound");
    }

    @Override
    public void dance() {
        System.out.println("Peacock dance");
    }
}
