package Week2;
import java.util.*;

public class Week2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] reggArr;
        System.out.print("가변 배열 행의 갯수 : ");
        int numRows = input.nextInt();

        reggArr = new int[numRows][];

        for(int i=0; i < reggArr.length; i++){
            System.out.print("reggArr " + i + "번째 행의 열의 갯수 : ");
            int numColums = input.nextInt();
            reggArr[i] = new int[numColums];
        }
        for(int i = 0; i < reggArr.length; i++){
            for(int j = 0; j < reggArr[i].length; j++){
                reggArr[i][j] = (int)(Math.random() * 1000);
            }
        }

        for (int i=0; i < reggArr.length; i++){
            for (int j=0; j < reggArr[i].length; j++) {
                System.out.print(reggArr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
