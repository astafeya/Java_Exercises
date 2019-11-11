package movableobjects;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint[x = " + x + ",y = " + y + ",xSpeed = " + xSpeed + ", ySpeed = " + ySpeed + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovablePoint)) {
            return false;
        }
        MovablePoint point = (MovablePoint) obj;
        return x == point.x && y == point.y && xSpeed == point.xSpeed && ySpeed == point.ySpeed;
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + x;
        code = 31 * code + y;
        code = 31 * code + xSpeed;
        code = 31 * code + ySpeed;
        return code;
    }
}
