package Week4;

public class Week4_2 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product("black");
        p3.setColor("white");

        System.out.println("p1 serialno = " + p1.getSerialNo());
        System.out.println("p2 serialno = " + p2.getSerialNo());
        System.out.println("p3 serialno = " + p3.getSerialNo());
        System.out.println("p4 serialno = " + p4.getSerialNo() + "color = " + p4.getColor());
        System.out.println("생산된 제품 개수는" + Product.getCount() + "개");
    }
}
