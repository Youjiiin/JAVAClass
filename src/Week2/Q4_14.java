package Week2;

import java.util.Scanner;

//숫자맞추기 게임
public class Q4_14 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int count = 0;

        do {
            count++;
            System.out.print("1~100사이의 수를 입력하세요 : ");
            input = scanner.nextInt();
            if(input > answer){
                System.out.println("answer : " + answer);
                System.out.println(input + "보다 작습니다.");
            } else if (input < answer) {
                System.out.println("answer : " + answer);
                System.out.println(input + "보다 큽니다.");
            } else {
                System.out.println("answer : " + answer);
                System.out.println("정답입니다.");
                System.out.println(count + "번만에 성공했습니다.");
                break;
            }
        } while (true);
    }
}
