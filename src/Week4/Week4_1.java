package Week4;

public class Week4_1 {
    public static class Car {
        String color;
        String gearType;
        int door;

        Car() {
            this("white", "auto", 4);
            System.out.println("1");
            //Car(String color, String gearType, int door)를 가르킴
        }

        Car(String color){
            this(color, "auto", 4);
            System.out.println("2");
            //Car(String color, String gearType, int door)를 가르킴
            door = 4;
        }

        Car(String color, String gearType, int door){
            this.color = color;
            this.gearType = gearType;
            this.door = door;
            System.out.println("3");
        }
        Car(Car c){
            color = c.color;
            gearType = c.gearType;
            door = c.door;
            System.out.println("4");
        }
    }
    static void info(Car c) {
        System.out.println("color = " + c.color + " gearType = " + c.gearType + " door" + c.door);
    }

    public static void main(String[] args) {
        Car c = new Car();  //호출 -> Car(String color, String gearType, int door)로 이동
        //Car()로이동
        System.out.println("11");
        c.color = "white";
        c.gearType = "auto";
        c.door = 4;
        System.out.println(22);
        System.out.println("c : " + c);
        System.out.println("33");
        info(c);

        Car c1 = new Car("white", "auto", 4);
        System.out.println(c1);
        info(c1);

        Car c2 = new Car("grey");
        System.out.println(c2);
        info(c2);

        Car c3 = new Car(c2);
        System.out.println(c3);
        info(c3);

        c3 = c;
        System.out.println(c3);
        info(c3);
    }

}
