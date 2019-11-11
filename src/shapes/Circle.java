package shapes;

import java.util.Objects;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.pow(radius, 2) * Math.PI;
        return  area;
    }

    public double getPerimeter() {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle[color = " + super.getColor() + ", filled = " + super.isFilled() + ", radius = " + radius + "]";
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
        return getColor().equals(circle.getColor()) && isFilled() == circle.isFilled() && radius == circle.radius;
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + super.hashCode();
        code = 31 * code + Objects.hashCode(radius);
        return code;
    }
}
