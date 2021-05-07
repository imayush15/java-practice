package abstraction;

public class Bike extends Vehicle {
    public String name = "ThunderBird";

    @Override
    public void acceleration() {
        System.out.println("Bike is Accelerating !");
    }

    @Override
    public void breaking() {
        System.out.println("Bike is Breaking !");
    }
}
