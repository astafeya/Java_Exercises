package ResizableObjects;

public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = Math.pow(radius, 2) * Math.PI;
        return  area;
    }

    @Override
    public String toString() {
        return "Circle[radius = " + radius + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) obj;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + (int) radius;
        return code;
    }
}
