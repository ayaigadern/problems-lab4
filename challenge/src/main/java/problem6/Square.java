package problem6;

public class Square extends Form {

    private double len;

    public Square(double c) {
        this.len = c;
    }

    @Override
    public double getSurface() {
        return Math.round(len * len * 100.0) / 100.0;

    }

    @Override
    public String toString() {
        return String.format("Square (side %.2f cm)", len);
    }
}