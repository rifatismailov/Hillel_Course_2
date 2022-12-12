package homework.five.one;

public class Circle implements Geometry {
    /**
     * S = π × r2
     */
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double aRea() {
        return Math.PI * Math.pow(radius,2);
    }
}
