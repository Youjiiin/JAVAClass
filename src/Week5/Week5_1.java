package Week5;

public class Week5_1 {
    public static void main(String[] args) {
        Point p = new Point(5, 6);
        System.out.println(p);
        System.out.println(p.toString());

        Point30 p3 = new Point30(1,2,3);
        System.out.println(p3.getLocation());
        System.out.println(p3);
        System.out.println(p3.toString());

        Point p1 = new Point30(5, 6, 7);
        System.out.println(p1.getLocation());
        System.out.println(p1.toString());

    }
}
