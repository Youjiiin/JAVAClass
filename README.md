# JAVAClass 
📕책 : JAVA의 정석

<details>
  <summary>
  📂 2장 : 변수(Variable)
  </summary>

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


</details>

----------------------------------------------------------------------

<details>
  <summary>
  📂 3장 : 연산자
  </summary>

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

</details>

----------------------------------------------------------------------

<details>
  <summary>
  📂 4장 : 조건문과 반복문
  </summary>

✨ [조건문과 반복문 실습](https://github.com/Youjiiin/JAVAClass/blob/master/src/Week2)

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
👋 반복문에 이름을 붙여서 해당 반복문을 벗어날 수 있음
</details>

----------------------------------------------------------------------

<details>
  <summary>
    📂 5장 : 배열
  </summary>

📌 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
```
//배열 선언
int[] score; 
int score[];
String[] name;
String name[];

//배열 생성
int[] score;
score = new int[];

//배열 초기화
int[] score = { 100, 90, 80, 70 };
int[] score = new int[]{ 100, 90, 80, 70 };
```


📌 배열의 요소

✔ 배열에 값을 저장하고 읽어오기
```
score[3] = 100; //배열 score의 4번째 요소에 100을 저장
int value = score[3]; //배열 score의 4번째 요소에 저장된 값을 value에 할당
```

✔ '배열이름.length'는 배열의 크기를 알려준다.


📌 다차원 배열 : []의 개수가 차원수를 의미

```
int[][] score = new int [5][3]; //5행 3열의 2차원 배열을 생성
```


📌 가변 배열 : 다차원 배열에서 마지막 차수의 크기를 지정하지 않고 각각 다르게 지정

```
int[][] score = new int[3][];
score[0] = new int[3];
score[1] = new int[2];
score[2] = new int[1];
int[][] score =
{
    { 100, 100, 100 },
    { 90, 90 },
    { 80 },
}
```


📌 배열의 복사

✔ for문을 이용한 배열의 복사

```
int[] num = { 1, 2, 3, 4, 5 };
int[] newNum = new int[10];

for( int i = 0; i < num.length; i++ ){
    newNum[i] = num[i];
}
```


✔ System.arraycopy()를 이용한 배열의 복사

```
System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//arr[0]에서 arr2[0]으로 arr.legnth개의 데이터를 복사
```


</details>


----------------------------------------------------------------------

<details>
  <summary>
    📂 6장 : 객체지향개념
  </summary>

🧩 클래스 (Class)
- 객체를 만들어 내기 위한 **설계도** , 객체를 정의해 놓은 것
- 연관되어 있는 변수와 메서드의 집합
- *'붕어빵 틀'이라고 비유*

  
🧩 객체 (Object)
- 실제로 존재하는 것. 사물 또는 개념 
- 자신의 속성을 가지고 있고, 다른 것과 식별 가능한 물리적, 추상적인 모든 대상

✔ 객체의 구성요소 - 속성 / 기능
- 속성 -> 변수
- 기능 -> 메서드
  
🧩 인스턴스 (Instance)
- 현실의 객체를 소프트웨어 내에서 구현한 실체(객체)
- *'붕어빵'이라고 비유*


😮 객체 vs 인스턴스
- 클래스 타입으로 선언되었을 때 ***객체***라고 부르고, 그 객체가 메모리에 할당되어 실제로 사용될 때 ***인스턴스***라고 부른다.
- 객체안에 인스턴스가 포함되어 있음
- 객체는 '실체', 인스턴스는 '관계'에 초점

👩‍💻 인스턴스의 생성과 사용

✔ 인스턴스의 생성
```
//클래스명 참조변수명; -> 객체를 다루기 위한 참조변수 선언
//참조변수명 = new 클래스명(); -> 객체생성 후, 생성된 객체의 주소를 참조변수에 저장

Tv t;
t = new Tv();

Tv t = new Tv();
```

✔ 인스턴스의 사용
```
Tv t;
t = new Tv;
t.channel = 7;
t.channelDown;
...
```


✔ 객체 배열
```
Tv[] rvArr = new Tv[3];
tvArr[0] = new Tv();
tvArr[1] = new Tv();
tvArr[2] = new Tv();
```
</details>
