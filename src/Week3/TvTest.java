package Week3;


//Tv 시리얼넘버 한개씩늘어날때마다 1씩 추가하기
public class TvTest {
    public static void main(String[] args) {
        Tv1 t1 = new Tv1();
        Tv1 t2 = new Tv1();
        Tv1 t3 = new Tv1();
        System.out.println("t1 : " + t1.serialNo);
        System.out.println("t2 : " + t2.serialNo);
        System.out.println("t3 : " + t3.serialNo);
    }
}
