package Work;

public class Student {
    //클래스 변수
    private static int count = 0;

    //인스턴스 변수
    private final String name;
    private final int no;
    private int kor;
    private int eng;
    private int math;

    //생성자
    public Student(String name){
        this.name = name;
        count++;
        this.no = count;
    }
    public Student(String name, int kor, int eng, int math){
        this(name);
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    //getter / setter 메소드

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public String getName() {
        return name;
    }

    public int getNo() {
        return no;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    //getTotal 메서드
    public int getTotal(){
        return math + eng + kor;
    }
    //getAverage 메서드
    public double getAverage(){
        return Math.round(getTotal() / 3.0 * 100) / 100.0;
    }
    //info 메서드
    public String info() {
        return "Name: " + name + ", No: " + no + ", Kor: " + kor + ", Eng: " + eng + ", Math: " + math;
    }

}
