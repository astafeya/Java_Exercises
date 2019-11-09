package Shapes;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[color = " + color + ", filled = " + filled + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shape)) {
            return false;
        }
        Shape shape = (Shape) obj;
        return color.equals(shape.color) && filled == shape.filled;
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + color.hashCode();
        return code;
    }
}
