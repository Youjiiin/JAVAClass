package Week2;
import java.util.*;

//예제 4-7
public class Week2_1 {
    public static void main(String[] args) {
        game(); //게임 실행
    }
    public static void game() { //게임 메소드
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Scissors(1) or Rock(2) or Paper(3) : ");
        int user = scanner.nextInt(); //사용자의 값을 입력받음
        int computer = (int)(Math.random() * 3) + 1; //1 or 2 or 3 중에 컴퓨터가 난수를 생성함

        if(user == 1){ //사용자가 가위일 때
            if(computer == 1){
                System.out.println("computer : " + computer + " / Draw!"); //컴퓨터가 가위일 때
            } else if (computer == 2) {
                System.out.println("computer : " + computer + " / Lose!"); //컴퓨터가 바위일 때
            } else {
                System.out.println("computer : " + computer + " / Win!"); //컴퓨터가 보일 때
            }
        } else if (user == 2) { //사용자가 바위일 때
            if (computer == 1) {
                System.out.println("computer : " + computer + " / Win!");
            } else if (computer == 2) {
                System.out.println("computer : " + computer + " / Draw!");
            } else {
                System.out.println("computer : " + computer + " / Lose!");
            }
        } else if (user == 3) { //사용자가 보일 때
            if (computer == 1) {
                System.out.println("computer : " + computer + " / Lose!");
            } else if (computer == 2) {
                System.out.println("computer : " + computer + " / Win!");
            } else {
                System.out.println("computer : " + computer + " / Draw!");
            }
        } else { //사용자가 1, 2, 3중에 입력하지 않았을 때
            System.out.println("Input only 1, 2, 3!");
            game(); //게임 재시작
        }
        scanner.close();
    }
}