public class Rectangle {
    protected double x1;
    protected double x2;
    protected double x3;
    protected double x4;
    protected double y1;
    protected double y2;
    protected double y3;
    protected double y4;

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public double getY4() {
        return y4;
    }

    public void setY4(double y4) {
        this.y4 = y4;
    }

    public Rectangle(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }

    public double area(double x1, double x2, double y2, double y3){
        double a = Math.abs(x1 - x2);
        double b = Math.abs(y2 - y3);
        return a * b;
    }

    public double perimeter(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4){
        double a = Math.abs(x1 - x2);
        double b = Math.abs(y2 - y3);

    }
}
