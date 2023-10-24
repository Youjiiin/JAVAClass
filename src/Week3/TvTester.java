package tvEx;

class Tv {
	String color;
	boolean power;
	int channel;
	void power() { power = !power;}
	void channelUp() {channel++; }
	void channelDown() {channel--; }
}

public class TvTester {

	public static void main(String[] args) {
		//객체 인스턴스
	/*	
		Tv t= new Tv();
		System.out.println("t.color=" + t.color);
		System.out.println("t.power=" + t.power);
		System.out.println("t.channel=" + t.channel);
		
		t.channel = 7;
		t.channelDown();
		System.out.println(t.channel);
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t1.color="black";
		t1.channel=10;
		t2.color = "Silver";
		t2.channel = 23;
		System.out.println("t1.color=" + t1.color);
		System.out.println("t1.power=" + t1.power);
		System.out.println("t1.channel=" + t1.channel);
		System.out.println("t2.color=" + t2.color);
		System.out.println("t2.power=" + t2.power);
		System.out.println("t2.channel=" + t2.channel);
		
		t2=t1;
		System.out.println("After t2=t1");
		System.out.println("t2.color=" + t2.color);
		System.out.println("t2.power=" + t2.power);
		System.out.println("t2.channel=" + t2.channel);
		
		t1.channel=7;
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	*/

		//객체 배열
		Tv[] tvArr = new Tv[3];
		for(int i =0; i < tvArr.length; i++) {
			tvArr[i]=new Tv();
		}

		for(int i =0; i < tvArr.length; i++) {
			System.out.println("tvArr[" + i +"].color=" + tvArr[i].color);
			System.out.println("tvArr[" + i +"].power=" + tvArr[i].power);
			System.out.println("tvArr[=" + i +"].channel=" + tvArr[i].channel);
		}
	}

}
