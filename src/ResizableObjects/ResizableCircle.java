package ResizableObjects;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        radius = radius * (1 + percent/100);
    }
}
