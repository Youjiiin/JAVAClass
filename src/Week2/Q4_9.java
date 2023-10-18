package Week2;

//연습문제 4-9
//문자열 str 각 자리의 합의 결과를 출력하는 코드
public class Q4_9 {
    public static void main(String[] arg){
        String str = "12345";
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            int num = Character.getNumericValue(str.charAt(i));
            System.out.println("sum " + sum);
            System.out.println("i번째 " + num);
            sum += num;
        }

        System.out.println("sum = " + sum);
    }
}
