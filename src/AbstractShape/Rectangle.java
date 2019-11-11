package AbstractShape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double area = width * length;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * (width * length);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle[color = " + super.getColor() + ", filled = " + super.isFilled() + "width = " + width +
                ", length = " + length + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return getColor().equals(rectangle.getColor()) && isFilled() == rectangle.isFilled() &&
                width == rectangle.width && length == rectangle.length;
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + super.hashCode();
        code = 31 * code + (int) width;
        code = 31 * code + (int) length;
        return code;
    }
}
