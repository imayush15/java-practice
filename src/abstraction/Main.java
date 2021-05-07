package abstraction;

public class Main {
    public static void repair(Vehicle v) {
        System.out.println("Vehicle " + v.getClass() + " is repaired");
    }

    public static void main(String[] args) {
        Scooty activa = new Scooty();
        Bike thunderBird = new Bike();

        repair(activa);
        repair(thunderBird);
    }
}
