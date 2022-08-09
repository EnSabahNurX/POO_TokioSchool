public class Polygon {
    public double side;

    public Polygon(double side) {
        this.side = side;
    }

    public double CalculateArea(double side) {
        return side * side;
    }

}