package problem6;

public class Circle extends Form {

    private double radius;
    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getSurface() {
        return Math.round(radius * radius * Math.PI * 100.0) / 100.0;

    }

    @Override
    public String toString() {
        return String.format("Square (radius %.2f cm)", radius);
    }

}