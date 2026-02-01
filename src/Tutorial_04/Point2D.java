package Tutorial_04;

public class Point2D {

    protected float x;
    protected float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
