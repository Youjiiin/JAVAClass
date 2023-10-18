package Week2;

import java.util.Scanner;

//행의 갯수 5, 열의 갯수 입력받기
public class multi_array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[][];
        System.out.print("열의 갯수를 입력하세요 : ");
        int row = scanner.nextInt();
        arr = new int[5][row];

        for(int i = 0; i < 5; i++){
            for (int j = 0; j < row; j++){
                arr[i][j] = (int)(Math.random() * 9);
            }
        }

        for(int i = 0; i < 5; i++){
            for (int j = 0; j < row; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
