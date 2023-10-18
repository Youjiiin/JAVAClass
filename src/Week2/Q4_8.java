package Week2;

import java.util.*;

//연습문제 4_8
//주민번호를 입력받은 후 여자인지 남자인지 판단
public class Q4_8 {
    public static void main(String[] args) {
        System.out.print("주민번호 13자리를 입력해 주세요 : ");
        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();
        System.out.println(regNo.charAt(6));

        if ( regNo.charAt(6) == '1' || regNo.charAt(6) == '3' ) {
            System.out.println("남자입니다.");
        } else if ( regNo.charAt(6) == '2' || regNo.charAt(6) == '4' ) {
            System.out.println("여자입니다.");
        } else {
            System.out.println("잘못된 주민번호 입니다.");
        }
    }
}
