package Work;

public class Q5 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        Tv t3 = new Tv();

        System.out.println(t1.getSerialNo());
        System.out.println(t2.getSerialNo());
        System.out.println(t3.getSerialNo());
    }
}
class Tv{
    private static int count = 1000;
    private int serialNo;

    Tv(){} //기본생성자
    {
        count++;
        serialNo = count;
    }

    public int getSerialNo() {
        return serialNo;
    }
}