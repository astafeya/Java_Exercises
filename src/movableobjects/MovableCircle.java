package movableobjects;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle[radius = " + radius + ", center = " + center.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovableCircle)) {
            return false;
        }
        MovableCircle circle = (MovableCircle) obj;
        return radius == circle.radius && center.equals(circle.center);
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + radius;
        code = 31 * code + center.hashCode();
        return code;
    }
}
