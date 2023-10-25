package Work;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        while (true) {
            try {
                System.out.print("배열의 크기를 입력하세요: ");
                size = scanner.nextInt();
                break;  // 정상적으로 입력받았으므로 while 루프 종료
            } catch (InputMismatchException e) {
                System.out.println("정수형이 아닙니다. 다시 입력하세요.");
                scanner.next();  // 잘못된 입력을 비워줌
            }
        }
        int[] num = new int[size];

        // 배열 크기 만큼 사용자로부터 정수값 받아 배열에 저장
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.print("정수값을 입력하세요: ");
                    num[i] = scanner.nextInt();
                    break;  // 정상적으로 입력받았으므로 while 루프 종료
                } catch (InputMismatchException e) {
                    System.out.println("정수형이 아닙니다. 다시 입력하세요.");
                    scanner.next();  // 잘못된 입력을 비워줌
                }
            }
        }
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();

        int total = 0;
        for (int i = 0; i < num.length; i++){
            total += num[i];
        }
        System.out.println(total);
        double average = (double)(total / size);
        System.out.println("average : " + average);
    }
}
