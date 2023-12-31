package Week5;
public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x : " + x + " y : " + y;
    }

    public String toString() {
        return getClass().getName() + '@' + " [" +  getLocation() + "]";
    }
}
