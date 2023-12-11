//package quiz2;
//
//public class InterfaceTest {
//    public static void main(String[] args) {
//        Person p1 = new Person(20, 160, "일유진");
//        Person p2 = new Person(25, 170, "이유진");
//        Person p3 = new Person(30, 180, "삼유진");
//        Person p4 = new Person(35, 181, "사유진");
//        Person p5 = new Person(40, 182, "오유진");
//
//        Employee[] e = new Employee[5];
//        e[0] = new Employee(p1.getName(), p1.getAge(), p1.getHeight(), "manage1");
//        e[1] = new Employee(p2.getName(), p2.getAge(), p2.getHeight(), "marketing");
//        e[2] = new Employee(p3.getName(), p3.getAge(), p3.getHeight(), "coding1");
//        e[3] = new Employee(p4.getName(), p4.getAge(), p4.getHeight(), "manage2");
//        e[4] = new Employee(p5.getName(), p5.getAge(), p5.getHeight(), "coding2");
//
//        int[] ages = new int[e.length];
//        int[] heights = new int[e.length];
//        int[] salaries = new int[e.length];
//
//        for (int i = 0; i < e.length; i++) {
//            ages[i] = e[i].getAge();
//            heights[i] = e[i].getHeight();
//            salaries[i] = e[i].getSalary();
//        }
//        EmployeeManager manager = new EmployeeManager();
//        double averageAge = manager.average(ages);
//        double averageHeight = manager.average(heights);
//        double averageSalary = manager.average(salaries);
//
//        System.out.println("평균 나이: " + averageAge);
//        System.out.println("평균 키: " + averageHeight);
//        System.out.println("평균 급여: " + averageSalary);
//    }
//}