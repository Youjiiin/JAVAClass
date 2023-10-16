package Week3;

public class Week3_1 {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("t.channel = " + t.channel);
        System.out.println("t.color = " + t.color);
        System.out.println("t.power = " + t.power);

        Tv t1 = new Tv();
        Tv t2 = new Tv();
        t1.color = "black";
        t1.channel = 10;
        t2.color = "silver";
        t2.channel = 23;
        System.out.println("t1.color = " + t1.color);
        System.out.println("t2.color = " + t2.color);
        System.out.println("t1.channel = " + t1.channel);
        System.out.println("t2.channel = " + t2.channel);

        t2 = t1;
        t1.channel = 7;
        System.out.println("t1.color = " + t1.color);
        System.out.println("t2.color = " + t2.color);
        System.out.println("t1.channel = " + t1.channel);
        System.out.println("t2.channel = " + t2.channel);

        Tv[] tvArr = new Tv[3];
        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
        }
        for(int i = 0; i < tvArr.length; i++) {
            System.out.println("tvArr[" + i + "].color = " + tvArr[i].color);
            System.out.println("tvArr[" + i + "].power = " + tvArr[i].power);
            System.out.println("tvArr[" + i + "].channel = " + tvArr[i].channel);
        }
    }
}

//class Tv {
//    String color; // 색깔
//    boolean power; // 전원상태(on/off)
//    int channel; // 채널
//    void power() { power = !power; } // 전원on/off
//    void channelUp(){channel++;}  // 채널 높이기
//    void channelDown() {channel--;} // 채널 낮추기
//}
