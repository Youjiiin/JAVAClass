# JAVAClass 
📕책 : JAVA의 정석


### 📂 2장 : 변수(Variable)

📌 변수 : 하나의 값을 저장할 수 있는 메모리 공
- 기본형 : boolean, char, byte, short, int, long, float, double
  -> 실제 값을 저장
  <img width="541" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/f54216d8-5859-46b3-b8ee-784d45c589cf">

  논리형 <br>
  boolean : true / false <br>
  문자형 <br>
  char : 2byte (ex : 'a') <br>
  정수형 <br>
  byte, short, int, long <br>
  -> 크기 순서대로, 보통 int(4byte), long(8byte)을 가장 많이 사용한다. <br>
  -> long형을 사용할 때는 맨뒤에 'L'을 붙여줘야한다. (ex : 9284389272L) <br>
  실수형 <br>
  float(4byte), double(8byte) <br>
  -> float형을 사용할 때는 맨뒤에 'f'를 붙여줘야 한다. (ex : 1.2321f) <br>
  
- 참조형 : 기본형을 제외한 나머지 -> String, System ...<br>
  -> 객체의 주소를 저장

  

📌 명명규칙


1. 대소문자가 구분되며 길이에 제한이 없다
2. 예약어를 사용할 수 없다<br>
3. 숫자로 시작하면 안된다<br>
4. 특수문자는 '_', '$'만 허용한다.<br>
5. 클래스 이름의 첫 글자는 항상 대문자로 한다.<br>
6. 여러 단어 이름은 단어의 첫글자를 대문자로 한다.(카멜식)<br>
7. 상수의 이름은 대문자로 한다. 단어는 '_'로 구분한다.<br>

*변수는 선언하고 값을 저장(초기화) 해주어야 한다.<br>
ex)

    int number; //변수 선언
    int num = 1; //변수 선언 후 1로 초기화

📌 형변환 <br>
: 값의 타입을 다른 타입으로 변환하는 것 (boolean을 제외한 7개의 기본형은 서로 형변환이 가능)<br>
    
    int num = 65;
    (char)num; // --> 'A'
    float num2 = 1.6f;
    (int)num2; // --> 1
    byte b = 10;
    int i = (int)b; //(int) 생략가능
    int i2 = 300;
    byte b2 = (byte)i2; //(byte) 생략불가

📌 printf()의 지시자

%f : float형식 환<br>
%d : 정수형식 <br>

📌 Scanner로 입력받기
    
    import java.util.*;
    Scanner scaneer = new Scanner(System.in);
    int num = scanner.nextInt; //입력받은 정수를 num에 저장
    String input = scanner.nextLine(); // 입력받은 문자열을 input에 저장
    int num2 = Integer.parseInt(input); // 문자열 -> 숫자 변환
