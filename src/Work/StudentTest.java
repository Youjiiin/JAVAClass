package Work;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("장유진");
        s1.setEng(100);
        s1.setKor(95);
        s1.setMath(100);
        System.out.println(s1.getAverage());
        System.out.println(s1.info());

        Student s2 = new Student("정유진", 100, 100, 50);
        System.out.println(s2.getAverage());
        System.out.println(s2.info());
    }
}
