package Work.work3;

public class Circle implements Cloneable {
    private Point p;
    private double r;

    Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
            Circle c = (Circle) obj;
            c.r = this.r;
            c.p = new Point(this.p.getX(), this.p.getY());
            return c;

        } catch (CloneNotSupportedException e) {
            System.out.println("Error");
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            return p.getX() == ((Circle) obj).p.getX() && p.getY() == ((Circle) obj).p.getY() && r == ((Circle) obj).r;
        }
        System.out.println("Different");
        return false;
    }

    public String toString() {
        return p.toString() + ", r=" + r;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
