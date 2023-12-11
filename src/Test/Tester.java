package quiz2;

public class Tester {
    public static void main(String[] args) {
        Person p1 = new Person("Changin", 23, 177);
        System.out.println(p1);

        Person p2 = new Employee("Gildong", 20, 180, "team2", 1000);
        System.out.println(p2);

        Person p3 = new Temporary("Minsu", 30, 170, "dep1");
        ((Temporary) p3).setWorkingHours(40);
        System.out.println(p3);
    }
}
