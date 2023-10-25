package Work;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("열의 크기를 입력하세요 : ");
        int a = scanner.nextInt();
        int[][] num = new int[5][a];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < a; j++){
                num[i][j] = (int)(Math.random()*9);
            }
        }

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < a; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
