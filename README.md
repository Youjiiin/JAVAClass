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

----------------------------------------------------------------------

### 📂 3장 : 연산자

📌 연산자 : 어떠한 기능을 수행하는 기호

📌 연산자의 우선순위
- 괄호의 우선순위가 제일 높음
- 산술 > 비교 > 논리 > 대입
- 단항 > 이항 > 삼항
- 연산 진행방향은 왼쪽에서 오른쪽 / 단항, 대입 연산자만 오른쪽에서 왼쪽
- <<, >>, >>>는 덧셈 연산자보다 우선순위가 낮음
- ||, |(OR)는 &&, &(AND)보다 우선순위가 낮음

📌 이외의 연산자들

✔ 증가 연산자(++) : 피연산자의 값을 1증가시킴 <br>
✔ 감소 연산자(--) : 피연산자의 값을 1감소시킴 <br>
✔ 부호 연산자 (+, -) : '+'는 피연산자에 1을 곱하고, '-'는 피연산자에 -1을 곱함<br>
✔ 논리부정 연산자(!) : true -> false / false -> true <br>
✔ 비트전환 연산자(~) : 2진수일 때, 1 -> 0 / 0 -> 1 <br>
✔ 나머지 연산자(%) : 나누기를 한 나머지를 반환함 <br>
✔ 쉬프트 연산자(<<, >>, >>>) : 2^n으로 곱하거나 나눈 결과를 반환 ( x << n === x * 2^n / x >> n === x * / 2^n ) <br>
✔ 비교 연산자(>, <, >=, <=, ==, !=) : 피연산자를 같은 타입으로 변환 후에 비교 <br>
✔ 비트 연산자(&, |, ^) : AND, OR, XOR -> 결과 값 = 0 / 1 <br>
✔ 논리 연산자(&&, ||) : AND, OR -> 결과 값 = true / false <br>
✔ 삼항 연산자 : (조건) ? (true) : (false) <br>
✔ 대입 연산자 : = / 오른쪽을 왼쪽에 대입 <br>

📌 이항연산자 특징
: 이항연산자는 연산을 수행하기 전에 피연산자의 타입을 일치시킨다.
- int보다 크기가 작은 타입은 int로 변환 (ex : byte, char, short -> int)
- 피연산자 중 표현범위가 큰 타입으로 형변환한
    - byte + short -> int + int -> int
    - char + int -> int + int -> int
    - float + int -> float + float -> float
    - long + float -> float + float -> float
    - float + double -> double + double -> double

👋Math.round() : 소수점 첫째자리에서 반올림한 값을 반환

----------------------------------------------------------------------

### 📂 4장 : [조건문과 반복문](https://github.com/Youjiiin/JAVAClass/blob/master/src/Week2)

📌 if문
    
    if(조건식1){
        //조건식1이 true일 때 수행될 문장들
    } else if (조건식2) {
        //조건식2가 true일 때
    } else {
        //모든 조건식이 false일 때
    }

📌 switch문
    
    switch(조건식){
        case 값1 : 
            //조건식의 결과가 값1과 같을 경우
            break;
        case 값2 : 
            //조건식의 결과가 값2와 같을 경우
            break;
        //...
        default : 
            //조건식의 결과와 일치하는 case문이 없을 경
    }

📌 Math.random()

: Math클래스에 정의된 난수 발생함수, 0.0~1.0 사이의 double값을 반환한다.
- 1~10범위의 임의의 정수를 얻는 식

      int score = (int)(MAth.random() * 10) + 1;

📌 for문
    
    for(초기화;조건식;증감식){
        //조건식이 true일 때 수행될 문장
        //초기화 -> 조건식 -> 수행될 문장 -> 증감식 -> 조건식 -> ...
    }

📌 while문  
    
    while(조건식) {
        //조건식이 true일 때 수행될 문장
    }

📌 do-while문
    
    do {
        //조건식의 연산결과가 true일 때 수행될 문장
    } while (조건식);

✔ for / while / do-while의 차이점 : for은 반복횟수가 정해져 있을 때 / while은 조건이 만족할 동안 계속해서 작동해야 할 때 / do-while은 일단 한 번은 동작해야 할 (선평가후 실행)

📌 break : 자신이 포함된 하나의 반복문 or switch문을 빠져나옴 / if문에서 특정조건을 만족하면 빠져나옴 (반복문 전체를 벗어남)

📌 continue : 자신이 포함된 반복문의 끝으로 이동 / continue문 이후의 문장들은 수행되지 않음 (다음 반복문으로 이동)

- ex
    ```
    int sum = 0;
    int i = 0;
    while (true) {
        if(sum > 100) {
            break;
        }
        i++;
        sum += i;
    } //break시 모든 조건문을 벗어남
    ```
    ```
    for(int i = 0; i <= 10; i++){
        if(i % 3 == 0){
            continue;
        } //continue시 해당 반복문에서 벗어남
        System.out.println(i);
    }
    ```
👋 반복문에 이름을 붙여서 해당 반복문을 벗어날 수 있
