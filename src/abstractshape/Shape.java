package abstractshape;

import java.util.Objects;

public abstract class Shape {
    protected String color;
    protected boolean filled;

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
        code = 31 * code + Objects.hashCode(filled);
        return code;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
