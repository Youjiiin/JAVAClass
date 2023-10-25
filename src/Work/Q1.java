package Work;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int size = scanner.nextInt();
        int[] num = new int[size];

        for(int i = 0; i < num.length; i++){
            System.out.print("배열에 저장할 값을 입력하세요 : ");
            num[i] = scanner.nextInt();
        }
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
