package v2.ConcreteClass;

import v2.abstractclass.Bird;

public class Sparrow extends Bird{
    @Override
    public void fly() {
        System.out.println("Sparrow fly");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow makeSound");
    }

    @Override
    public void dance() {
        System.out.println("Sparrow dance");
    }
}
