package generics;

public class Pair<X, Y> {
    X x;
    Y y;

    Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public void getDescription() {
        System.out.println("You entered : " + x + " and " + y);
    }
}
