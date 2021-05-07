package generics;

public class MainClass {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair("Ayush", 32);
        Pair<Boolean, Double> p2 = new Pair(false, 42.00);

        p1.getDescription();
        p2.getDescription();
    }
}
