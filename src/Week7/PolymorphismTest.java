package Week7;

public class PolymorphismTest {
    public static void main(String[] args) {
        Car car = new Car();
        FireEngine fe = new FireEngine();
        Ambulance am = new Ambulance();

        Car c1 = new FireEngine(); //up-casting
        c1.drive();
        //c1.water();

        fe.water();
        Car c = fe;
        //c.water();

        FireEngine fe2 = (FireEngine) c; //down-casting
        fe2.water();

//        FireEngine fe3 = (FireEngine)car ;
//        fe3.water();
        System.out.println("For the fe");
        if (fe instanceof FireEngine) {
            System.out.println("this is a FireEngine instance.");
        }
        if (fe instanceof Car) {
            System.out.println("this is a Car instance.");
        }
        if (fe instanceof Object) {
            System.out.println("this is a Object instance.");
        }

        System.out.println();
        System.out.println("For the c");
        if (c instanceof FireEngine) {
            System.out.println("this is a FireEngine instance.");
        }
        if (c instanceof Car) {
            System.out.println("this is a Car instance.");
        }
        if (c instanceof Object) {
            System.out.println("this is a Object instance.");
        }
        System.out.println("calling method(fe)");
        method(fe);
        System.out.println("calling method(car)");
        method(car);
    }

    public static void method(Object obj) {
        if(obj instanceof Car) {
            Car c = (Car) obj;
            c.drive();
        }
        if (obj instanceof FireEngine) {
            FireEngine fe = (FireEngine) obj;
            fe.water();
        }
    }
}
