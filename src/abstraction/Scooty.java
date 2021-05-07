package abstraction;

public class Scooty extends Vehicle {
    public String name = "Activa";
    @Override
    public void acceleration() {
        System.out.println("Scooty is accelerrating !");
    }

    @Override
    public void breaking() {
        System.out.println("Scooty is Breaking !");
    }
}
