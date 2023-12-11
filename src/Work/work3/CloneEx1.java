package Work.work3;

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone();
        if (original.equals(copy)) {
            System.out.println(original);
            System.out.println(copy);
        }
        Circle c1 = new Circle(new Point(10, 20), 2.0);
        Circle c2 = (Circle) c1.clone();
        if (c1.equals(c2)) {
            System.out.println(c1);
            System.out.println(c2);
        }
    }
}
