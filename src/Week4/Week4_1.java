package Week4;

public class Week4_1 {
    public static class Car {
        String color;
        String gearType;
        int door;

        Car() {
            this("white", "auto", 4);
        }

        Car(String color){
            this(color, "auto", 4);
            door = 4;

        }

        Car(String color, String gearType, int door){
            this.color = color;
            this.gearType = gearType;
            this.door = door;

        }
        Car(Car c){
            color = c.color;
            gearType = c.gearType;
            door = c.door;
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.color = "white";
        c.gearType = "auto";
        c.door = 4;
        System.out.println(c);
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
    static void info(Car c) {
        System.out.println("color = " + c.color + "gearType = " + c.gearType + "door" + c.door);
    }
}
