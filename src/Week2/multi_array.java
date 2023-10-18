package Week2;

import java.util.Scanner;

//2차원 배열 행,열 갯수 입력받고, 안의 내용도 입력받기
public class multi_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int MultiArry[][];
        System.out.print("행의 갯수를 입력하세요 : ");
        int a = scanner.nextInt();
        System.out.print("열의 갯수를 입력하세요 : ");
        int b = scanner.nextInt();
        MultiArry = new int[a][b];

        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.println(i + "행 " + j + "열의 값을 입력하세요");
                MultiArry[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(MultiArry[i][j] + " ");
            }
            System.out.println();
        }
    }
}
