package homework.five.one;

public class Square implements Geometry {
    /**
     * S = a * b
     */
    private int a;
    private int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double aRea() {
        return a * b;
    }
}
