package v1;

public class Bird {
    public String name;
    public String type;
    public int weight;
    public int feathers;
    public String color;

    public Bird() {

    }

    public void fly() {
        System.out.println(this.name + ": v1.Bird flying");
    }

    public void makeSound() {
        if (this.type.equals("crow")) {
            System.out.println(this.name + ": crow makes sound");
        }
        else if (this.type.equals("pigeon")) {
            System.out.println(this.name + ": pigeon makes sound");
        }
        else {
            System.out.println(this.name + ": v1.Bird makes sound");
        }
    }

    public void walk() {
        System.out.println(this.name + ": v1.Bird walking");
    }

    public void dance() {
        System.out.println(this.name + ": v1.Bird dance");
    }

}
