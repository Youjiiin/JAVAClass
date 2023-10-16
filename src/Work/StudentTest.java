package Work;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동");
        Student s2 = new Student("김길동", 80, 90, 100);
        s1.setEng(100);
        s1.setKor(95);
        s1.setMath(70);

        // 메서드 호출 및 출력
        System.out.println("이름: " + s1.getName());
        System.out.println("번호: " + s1.getNo());
        System.out.println("국어: " + s1.getKor());
        System.out.println("영어: " + s1.getEng());
        System.out.println("수학: " + s1.getMath());
        System.out.println("총 점수: " + s1.getTotal());
        System.out.println("평균 점수: " + s1.getAverage());
        System.out.println("학생 정보: " + s1.info());

        System.out.println("----------------------");

        System.out.println("이름: " + s2.getName());
        System.out.println("번호: " + s2.getNo());
        System.out.println("국어: " + s2.getKor());
        System.out.println("영어: " + s2.getEng());
        System.out.println("수학: " + s2.getMath());
        System.out.println("총 점수: " + s2.getTotal());
        System.out.println("평균 점수: " + s2.getAverage());
        System.out.println("학생 정보: " + s2.info());

        System.out.println("----------------------");
        System.out.println("총 학생수: " + Student.getCount());
    }
}
