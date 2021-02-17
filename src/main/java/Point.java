public class Point {
    private double x;
    private double y;
    private int number;

    public Point(double x, double y, int number) {
        this.x = x;
        this.y = y;
        this.number = number;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if(x > 1) {
            throw new RuntimeException("x > 1");
        } else if (x < -1) {
            throw new RuntimeException("x < -1");
        }
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if (y > 1) {
            throw new RuntimeException("y > 1");
        } else if (y < -1) {
            throw new RuntimeException("y < -1");
        }
        this.y = y;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "P" + number;
    }
}
