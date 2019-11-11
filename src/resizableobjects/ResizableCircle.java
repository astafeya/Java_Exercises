package resizableobjects;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        radius = radius * (1 + percent/100);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResizableCircle)) {
            return false;
        }
        ResizableCircle circle = (ResizableCircle) obj;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + super.hashCode();
        return code;
    }
}
