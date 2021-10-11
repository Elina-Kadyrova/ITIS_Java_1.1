import java.util.Objects;

public class Circumference {
    protected double x;
    protected double y;
    protected double rad;

    public Circumference(double x, double y, double rad) {
        this.x = x;
        this.y = y;
        this.rad = rad;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circumference that = (Circumference) o;
        return Double.compare(that.x, x) == 0 &&
                Double.compare(that.y, y) == 0 &&
                Double.compare(that.rad, rad) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, rad);
    }

    @Override
    public String toString() {
        return "Circumference {" +
                "x = " + x +
                "y = " + y +
                "rad = " + rad +
                '}';
    }

    public double area(double rad){
        double area = Math.PI * rad * rad;
        return Math.round(area) * 1000.0 / 1000.0;
    }

    public double length(double rad){
        double length = 2 * Math.PI * rad;
        return Math.round(length) * 1000.0 / 1000.0;
    }

    public boolean hasIntersection(Circumference cir){
        double rad1 = this.rad;
        double rad2 = cir.rad;
        double o1o2 = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        if((Math.abs(rad1 - rad2) <= o1o2) & (o1o2 <= rad1 + rad2)) {
            return true;
        }
        else
            return false;
    }
}
