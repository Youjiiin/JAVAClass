package Work.work3;

import java.lang.*;
import java.lang.Cloneable;

public class Point implements Cloneable {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x="+x +", y="+ y;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error");
        }
        return obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            return x == ((Point) obj).x && y==((Point) obj).y;
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
