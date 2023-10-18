package Week2;

//회문수
public class Q4_15 {
    public static void main(String[] args) {
        int number1 = 12321;
        int number2 = 12345;
        int tmp = number2;

        int result = 0;

        while (tmp != 0){
            result = result * 10 + tmp % 10;
            //1. result = 1;
            //2. result = 2;
            // ...
            //5. 1
            tmp /= 10;
            //1. 1232
            //2. 123
            //5. 0
            if(tmp == 0){
                break;
            }
        }

        if(number1 == result){
            System.out.println(number1 + "는 회문수 입니다.");
        } else {
            System.out.println(number1 + "는 회문가 아닙니다.");
        }
    }
}
