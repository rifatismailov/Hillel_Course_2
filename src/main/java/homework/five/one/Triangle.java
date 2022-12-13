package homework.five.one;

public class Triangle implements Geometry {
    /**
     * P = (a + b + c) / 2
     * S = sqrt(p * ((P - a) * (P - b) * (P - c))
     */
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int periMeter() {
        return (a + b + c) / 2;
    }

    @Override
    public double aRea() {
        double p = periMeter();
        return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
    }
}
