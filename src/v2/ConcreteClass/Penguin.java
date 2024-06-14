package v2.ConcreteClass;

import v2.abstractclass.Bird;

public class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("But penguin dont fly");
//        This is the problem with this version. If we give this functionality to the client.
//        The client will assume a bird to fly. But he'll be surprised.
//        We should avoid exposing functionality if it's not supported.
    }

    @Override
    public void makeSound() {
        System.out.println("But penguin make sound");
    }

    @Override
    public void dance() {
        System.out.println("But penguin dance");
    }
}
