package Points;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = getX();
        result[1] = getY();
        result[2] = z;
        return result;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() +", " + getY() + ", " + z + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (! (obj instanceof Point3D)) {
            return false;
        }
        Point3D point = (Point3D) obj;
        return getXYZ().equals(point.getXYZ());
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + super.hashCode();
        code = 31 * code + (int)z;
        return code;
    }
}
