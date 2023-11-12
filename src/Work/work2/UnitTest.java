package Work.work2;

public class UnitTest {
    public static void main(String[] args) {

        Marine m1 = new Marine("marine");
        Tank t1 = new Tank("tank");
        Dropship d1 = new Dropship("dropship");
        m1.stimPack();
        m1.move(2, 4);
        System.out.println(m1.info());
        d1.load(d1, t1);
        d1.load(d1, m1);
        System.out.println(d1.info());
        System.out.println("dropship의 수송 목록: " + d1.getList());
        d1.move(3, 1);
        d1.unload(d1, t1);
        t1.changeMode();
        System.out.println(t1.info());
        System.out.println(d1.info());
    }
}
