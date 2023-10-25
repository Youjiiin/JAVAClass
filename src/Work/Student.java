package Work;

public class Student {
    private static int count = 0; //학생 수 기록용
    private String name; //학생 이름
    private int no; //학생 번호 - count를 사용해서 유일한 번호를 갖도록
    private int kor; //국어점수
    private int eng; //영어점수
    private int math; //수학점수

    Student(){
        //기본생성자
    }

    Student(String name){
        this.name = name;
        count++;
        this.no = count;
    }

    Student(String name, int kor, int eng, int math){
        this(name);
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    //총점계산
    int getTotal () {
        int total = kor + eng + math;
        return total;
    }

    //평균계산
    Double getAverage() {
        double average = Math.round(getTotal() / 3.0 * 100.0) / 100.0;
        //getTotal() / 3.0을 통해 평균을 계산합니다.
        //계산된 평균을 100으로 곱해서 소수점 아래 두 자리를 정수부로 올립니다.
        //Math.round()를 사용해 반올림을 합니다.
        //반올림된 값을 다시 100으로 나누어 원래의 소수점 위치로 돌려놓습니다.
        return average;
    }

    String info() {
        return "Name = " + name + ", No : " + no + ", Kor : " + kor + ", Eng : " + eng + ", Math : " + math;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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
}
