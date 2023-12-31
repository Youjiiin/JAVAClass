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

<details>
  <summary>
    👩‍💻 클래스 / 객체 / 인스턴스
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

✍️[인스턴스의 생성과 사용](https://github.com/Youjiiin/JAVAClass/tree/master/src/Week3)

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

<details>
  <summary>
    👩‍💻 변수와 메서드
  </summary>

```
public class test {
    int iv; //인스턴스 변수
    static int cv; //클래스 변수
    void method() {
        int lv; //지역변
    }
}
```
<img width="423" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/1e6b828b-0318-4b50-af88-28ea094934c3">

    
📌 인스턴스변수
- 각 인스턴스의 개별적인 공간
- 인스턴스 생성 후, '참조변수.인스턴스변수명'으로 접근
- 참조변수가 없을 때 자동으로 제거됨

  
📌 클래스변수 
- 같은 클래스의 모든 인스턴스들이 공유하는 변수
- 인스턴스 생성없이 '클래스이름.클래스변수명'으로 접근
- 클래스가 로딩될 때 생성, 프로그램이 종료될 때 소멸
- 클래스 내에 **static** 키워드로 선언

  
📌 지역변수
- 메서드 내에 선언, 메서드 종료시 소멸
- 조건문, 반복문 블럭{} 내에 선언 됐을 때, 블럭을 벗어나면 소멸

🧩 메서드
- 작업을 수행하기 위한 명령문의 집합
- 어떤 값을 입력받아서 처리하고 그 결과를 돌려준다. (입력받는 값이 없을 수도 있고 결과를 돌려주지 않을 수도 있다.)
- 반복적인 코드를 줄이고 코드의 관리가 용이하다.
- 반복적으로 수행되는 여러 문장을 메서드로 작성한다.
- 하나의 메서드는 한 가지 기능만 수행하도록 작성하는 것이 좋다.
- 관련된 여러 문장을 메서드로 작성한다.

✔ 메서드 선언
```
//리턴타입 메서드이름 (타입 변수명, ...) {...}
```

✔ 메서드의 호출방법
```
//참조변수.메서드 이름();
Math m = new Math();
m.add(1, 2);

int add(int a, int b) {
    int result = a + b;
    return result; //실행중인 메서드를 종료하고 호출한 메서드로 돌아간다.
    //void선언 이외에 return 뒤에 반환값이 필요
}
```

🧩 JVM의 메모리 구조 <br>
<img width="240" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/7f7d7e20-cb3d-4096-a3f2-de2242b9ef19">

✅ 메서드 영역 : 클래스 정보와 클래스 변수가 저장되는 곳 <br>
✅ 호출 스택 : 메서드의 작업공간, 메서드 호출 시 메서드 수행에 필요한 메모리 공간 할당받은 후, 종료되면 사용하던 메모리 반환 <br>
✅ 힙 : 인스턴스가 생성되는 공간, new 연산자에 의해서 생성되는 배열과 객체는 모두 이곳에 생성 <br>

✅ 기본형 매개변수 : 변수의 값을 읽기만 할 수 있음 <br>
✅ 참조형 매개변수 : 변수의 값을 읽고 변경 가능 <br>
✅ 참조형 반환타입 : 메서드가 *객체의 주소*를 반환 <br>
✅ 재귀호출 : 메서드 내에서 자기자신을 반복적으로 호출하는 것 <br>

🧩 인스턴스 메서드
- 인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
- 인스턴스 변수나 인스턴스 메서드와 관련된 작업을 하는 메서드
- 메서드 내에서 인스턴스 변수 사용 가능

🧩 클래스 메서드 (static 메서드)
- 객체 생성없이 '클래스이름.메서드이름()'으로 호출
- 인스턴스 변수나 인스턴스 메서드와 관련없는 작업을 하는 메서드
- 메서드 내에서 인스턴스 변수 사용불가
- 메서드 내에서 인스턴스 변수를 사용하지 않는다면 static을 붙이는 것을 고려

```
class Math {
    int a, b;

    int add() { //인스턴스 메서드
        return a + b;
    }

    static int add(int a, int b) { //클래스 메서드
        return a+ b;
    }
}

class Test {
    public static void main(String arg[]){
        System.out.println(Math.add(1, 2)); //클래스 메서드 호출
        Math m = new Math(); //인스턴스 생성
        m.a = 1;
        m.b = 2;
        System.out.println(m.add); //인스턴스메서드 호
    }
}
```
✅ static <br>
: static은 메모리 할당을 딱 한 번만 하게 되고, 이에 대한 값을 공유할 수 있게 해준다.

```
class Counter  {
    int count = 0;
    Counter() {
        this.count++;
        System.out.println(this.count);
    }
}

public class Sample {
    public static void main(String[] args) {
        Counter c1 = new Counter();  //1
        Counter c2 = new Counter();  //1
    }
}
```
위의 코드를 실행하면 둘다 1이 출력되게 된다. 생성자를 호출하며 서로 다른 메모리를 가리키고 있기 때문이다.
```
class Counter  {
    static int count = 0;
    Counter() {
        count++;  // count는 더이상 객체변수가 아니므로 this를 제거하는 것이 좋다.
        System.out.println(count);  // this 제거
    }
}

public class Sample {
    public static void main(String[] args) {
        Counter c1 = new Counter();  //1
        Counter c2 = new Counter();  //2
    }
}
```
static키워드를 붙여주면 count의 값은 같은 메모리를 공유해서 같은 count값에 대한 count++;가 두번 실행된다.

🧩 메서드 오버로딩 <br>
: 하나의 클래스에 같은 이름의 메서드를 여러 개 정의하는 것을 메서드 오버로딩이라고 한다.

✅ 오버로딩 조건
- 메서드의 이름이 같아야 한다.
- 매개변수의 개수 또는 타입이 달라야 한다.
- 리턴타입이 다른 경우에는 오버로딩이 성립되지 않는다.
- ex. System.out.println 메서드
```
long add(int a, long b) { return a + b; }
long add(long a, int b) { return a + b; }4
```
- 같은 기능을 하는 메서드를 하나의 이름으로 정의해 사용할 수 있음
</details>

<details>
  <summary>
    👩‍💻 생성자
  </summary>

📌 생성자
- 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
- 인스턴스 변수의 초기화 / 인스턴스 생성시 수행할 작업에 사용
- 몇가지 조건을 제외하고 메서드와 같음
- 모든 클래스에 반드시 하나 이상의 생성자가 있어야 한다.

```
Card c = new Card();
// 1. 연산자 new에 의해서 메모리(heap)에 Card클래스의 인스턴스가 생성됨
// 2. 생성자 Card()가 호출되어 수행됨
// 3. 연산자 new의 결과로, 생성된 Card 인스턴스의 주소가 변환되어 참조변수 c에 저장됨
```

- 생성자의 이름은 클래스의 이름과 같아야 함
- 생성자는 return값이 없다. (but void는 사용하지 않음)
```
class Card() {
  Card (){
    //기본 생성자, 입력하지 않아서 빈내용의 생성자를 컴파일러가 추가.
    //인스턴스 초기화 작업
  }

  int value;
  Card ( int x ) {
    // 매개변수가 있는 생성자
    value = x;
  }
}

Card c1 = new Card();
c1.vaule = 1;
//or
Card c2 = new Card(2);
```

📌 생성자에서 다른 생성자 호출하기 - this()
```
class Car {
  String color;
  int door;

  Car () {
    this("white", 4);
    // = Car("white", 4);
  }

  Car (String c, int d) {
    color = c;
    door = d;
  }
}
```

📌 참조변수 this <br>
: 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어있음
```
class Car {
  String color;
  int door;

  Car () {
    this("white", 4);
  }

  Car (String color, int door) {
    this.color = color; //this.지역변수 = 인스턴스 변수
    this.door = door;
  }

  //생성자를 이용한 인스턴스의 복사
  Car (Car c) {
    color = c.color;
    door = c.door;
  }
}
```

🧩 [초기화](https://github.com/Youjiiin/JAVAClass/tree/master/src/Week4)
```
class InitTest {
  static int cv = 1; // 명시적 초기화
  int iv = 1; // 명시적 초기화

  static { cv = 2; // 클래스 초기화 블럭 }
  { iv = 2; // 인스턴스 초기화 블럭 }

  InitTest () { //생성자
    iv = 3; 
  }
}
```
</details>

</details>

----------------------------------------------------------------------

<details>
  <summary>
    📂 8장 : 예외처리
  </summary>
  
  😮예외 vs 오류
  - 에러(error) : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
  - 예외(exception) : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
  
  ✅ 예외처리의 정의와 목적
  - 정의 : 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
  - 목적 : 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
  
  📌 예외처리 구문 try - catch
  ```
    try {
        //예외가 발생할 가능성이 있는 문장들을 넣는다.
    } catch (Exception e1) {
        //예외가 발생했을 경우, 이를 처리하기 위한 문장을 적는다.
    }
  ```
  ✔ try 블럭 내에서 예외가 발생한 경우
  1. 발생한 예외와 일치하는 catch 블럭이 있는지 확인한다.
  2. 일치하는 catch 블럭을 찾게 되면, 그 catch 블럭 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 
  그 다음 문장을 계속해서 수행한다. 만일 일치하는 catch블럭을 찾지 못하면, 예외는 처리되지 못한다.
  
  ✔ try 블럭 내에서 예외가 발생하지 않은 경우
  1. catch블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속한다.
  
  📌 예외 발생시키기
  1. 먼저, 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
  ```
    Exception e = new Exception("고의로 발생시켰음");
  ```
  2. 키워드 throw를 이용해서 예외를 발생시킨다.
  ```
    throw e;
  ```
  
  📌 예외 클래스의 계층구조
  - RuntimeException 클래스들 : 프로그래머의 실수로 발생하는 예외 -> 예외처리 필수
  - Exception 클래스들 : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외 -> 예외처리 선택
  
  try블럭에서 예외가 발생하면, 발생한 예외를 처리할 catch블럭을 찾는다. 첫번째 catch 블럭부터 순서대로 찾아 내려가며, 마지막에는 모든 종류의 에러를 처리할 수 있어야 한다.
  
  발생한 예외 객체를 catch블럭의 참조변수로 접근할 수 있다.
  - printStackTrace() : 예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
  - getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
  
  ✔ finally 블럭
  - 예외의 발생여부와 관계없이 실행되어야 하는 코드를 넣는다.
  - 선택적으로 사용할 수 있으며, try-catch-finally의 순서로 구성된다.
  - 예외 발생시, try-catch-finally의 순서로 실행되고 예외 미발생시, try-finally의 순서로 실행된다.
  - try 또는 catch 블럭에서 return문을 만나도 finally블럭은 수행된다.
  ```
    try {
        //예외가 발생할 가능성이 있는 문장들을 넣는다.
    } catch (Exception e1) {
        //예외처리를 위한 문장을 적는다.
    } finally {
        //예외의 발생여부에 관계없이 항상 수행되어야 하는 문장들을 넣는다.
        //finally 블럭은 try-catch문의 맨 마지막에 위치해야한다.
    }  
  ```
  
  ✔ 메서드에 예외 선언하기
  : 예외를 처리하는 것이 아니라, 호출한 메서드로 전달해 주는 것, 호출한 메서드에서 예외처리를 해야한 만 할 때 사용
  ```
    void method() thorws Exception1, Exception2,... ExceptionN {
        //메서드 내용
    }
    //예외를 발생시키는 키워드 throw와 예외를 메서드에 선언할 때 쓰이는 throws 구별
  ```
  ```
    class ExceptionEx18 {
        public static void main(String[] args) throws Exception {
            method1();
        }
        static void method1() throws Exception {
            method2();
        }
        static void method2() throws Exception {
            thorw new Exception();
        }
    }
  ```
  
  ✔ 예외 되던지기
  : 예외를 처리한 후에 다시 예외를 생성해서 호출한 메서드로 전달, 예외가 발생한 메서드와 호출한 메서드, 양쪽에서 예외를 처리하는 경우에 사용
  ```
    class Exception23 {
        public static void main(String[] args) {
            try {
                method1();
            } catch (Exception e) {
                System.out.prinln("main메서드에서 예외가 처리되었습니다.");
            }
        }

        static void method1() thorws Exception {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.prinln("method1메서드에서 예외가 처리되었습니다.");
                thorw e;
            }
        }
    }
  ```
  
  ✔ 사용자정의 예외 만들기
  : 기존 예외 클래스를 상속받아서 새로운 예외 클래스를 정의할 수 있다.
  ```
    class MyException extends Exception {
        MyException(String msg) { //문자열을 매개변수로 받는 생성자
            super(msg); //조상인 Exception클래스의 생성자를 호출한다.
        }
    }
  ```
  ```
    class MyException extends Exception {
        //에러 코드 값을 저장하기 위한 필드를 추가 했다.
        private final int ERR_CODE;

        MyException(String msg, int errCode) { //생성자
            super(msg);
            ERR_CODE = errCode;
        }

        MyException (String msg) { //생성자
            this(msg, 100); //ERR_CODE를 100(기본값)으로 초기화 한다.
        }

        public int getErrCode () { //에러코드를 얻을 수 있는 메서드도 추가했다.
            return ERR_CODE; //이 메서드는 주로 getMessage()와 함께 사용될 것이다.
        }
    }
  ```
  
  ✔ 연결된 예외
  - 예외 A가 예외 B를 발생시켰다면, A를 B의 '원인 예외'라고 한다.
  ```
    Throwable initCause (Throwable cause) //지정한 예외를 원인 예외로 등록
    Throwable getCause() //원인 예외를 반환
  ```
  
  - SpaceException이 발생했을 때, 이를 원인예외로 하는 InstallException발생시키는 방법 (호출한 쪽에서는 InstallException으로 처리)
  ```
    try {
        startInstall();  //SpaceException 발생
        copyFiles();
    } catch (SpaceException e) {
        InstallException ie = new InstallException("설치 중 예외발생"); //예외 생성
        ie.initCause(e); //InstallException의 원인 예외를 SpaceException으로 지정
        throw ie; //InstallException을 발생시킨다.
        } catch (MemoryException me) {
            //...
        }
  ```
</details>

----------------------------------------------------------------
<details>
  <summary>
    📂 9장 : Object 클래스
  </summary>
  <img width="541" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/b4da7b26-57d3-4090-8933-52e3f27bfbe9">

  <details>
  <summary>
    👩‍💻 Object 클래스
  </summary>
    
  📌 equals(Object obj)
  - 객체 자신과 주어진 객체를 비교한다. 같으면 true / 다르면 false
  - Object클래스에 정의된 equals()는 참조변수 값을 비교한다.
  - equals()를 오버라이딩해서 인스턴스변수의 값을 비교하도록 바꾼다.
    
  ```
    clas Person {
        long id;

        public boolean equals(Object obj) {
            if(obj!=null && obj instanceof Person) {
                return id == ((Person)obj).id; 
                //obj가 Object타입이므로 id값을 참조하기 위해서는 Person타입으로 형변환이 필요하다.
            } else {
                return false; //타입이 Person이 아니면 값을 비교할 필요도 없다.
            }
        }

        Person(long id) {
            this.id = id;
        }
    }
  ```
  
  📌 hashCode()
  - 객체의 해시코드(int 타입의 정수)를 반환하는 메서드. 다량의 데이터를 저장&검색하는 해싱기법에 사용된다.
  - Object 클래스의 hashCode()는 객체의 내부주소를 반환한다.
  ```
    public class Object {
        public native int hashCode();
    }
  ```
  - equals()를 오버라이딩하면, hashCode()도 같이 오버라이딩 해야한다. equals()의 결과가 true인 두 객체의 hash code는 같아야하기 때문
  ```
    String str1 = new String("abc"); 
    String str2 = new String("abc");
    System.out.println(str1.equals(str2)); //true
    System.out.println(str1.hashCode()); //96354
    System.out.println(str2.hashCode()); //96354
  ```
  - System.identityHashCode(Object obj)는 Object클래스의 hashCode()와 동일한 결과를 반환한다.
  ```
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
  ```
  
  📌 toString()
  - 객체의 정보를 문자열로 제공할 목적으로 정의된 메서드
  
  📌 clone()
  - 객체 자신을 복제해서 새로운 객체를 생성하는 메서드
  - Cloneable인터페이스를 구현한 클래스의 인스턴스만 복제할 수 있다.
  - Object클래스에 정의된 clone()은 인스턴스변수의 값만을 복제한다.
  - 인스턴스변수가 참조형일 때, 참조하는 객체도 복제되게 오버라이딩 해야함.
  
  📌 getClass()
  - 자신이 속한 클래스의 Class객체를 반환하는 메서드
  - Class 객체는 클래스의 모든 정보를 담고 있으며, 클래스당 단 1개만 존재 (클래스파일이 메모리에 로드될 때 생성된다.)
  - Class객체를 얻는 여러가지 방법
      
  ```
        Card c = new Card();
        Class cObj = c.getCalss();
  ```
      
  </details>
  
  <details>
  <summary>
    👩‍💻 String 클래스
  </summary>
  ✅String 클래스의 특징
  - 문자형 배열(char[])과 그에 관련된 메서드들이 정의되어 있다.
  - String 인스턴스의 내용은 바꿀 수 없다.

  ✔ 빈문자열 ("")
  - 내용이 없는 문자열, 크기가 0인 char형 배열을 저장하는 문자열
  - 크기가 0인 배열을 생성하는 것은 어느 타입이나 가능
  - String str = "";은 가능 / char c = '';은 불가능
   ```
    String s = ""; //빈 문자열로 초기화
    char c = ' '; //공백으로 초기화
   ```
   
   ✔ 문자열과 기본형간의 변환
   - 기본형 값을 문자열로 바꾸는 두 가지 방법 (방법2가 더 빠름)
   ```
    int i = 100;
    String str1 = i + ""; //100 -> "100" 방법1
    String str2 = String.valueOf(i); //100 -> "100" 방법2
   ```
   - 문자열을 기본형 값으로 변환하는 방법
   ```
    int i = Integer.parseInt("100"); //"100" -> 100
    int i2 = Integer.valueOf("100"); //"100" -> 100
    char c = "A".charAt(0); //"A" -> 'A'
   ```
  <img width="240" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/7f7d7e20-cb3d-4096-a3f2-de2242b9ef19">

  </details>
  
  <details>
  <summary>
      👩‍💻 StringBuffer 클래스
  </summary>
  ✅ StringBuffer클래스의 특징
  - String처럼 문자형 배열(char[])을 내부적으로 가지고 있다.
  - 그러나, String클래스와 달리 내용을 변경할 수 있다.
  - 인스턴스를 생성할 때 버퍼(배열)의 크기를 충분히 지정해주는 것이 좋다.(버퍼가 적으면 성능 저하 - 작업 중에 더 큰 배열의 생성이 필요)
  - String클래스와 달리 equals()를 오버라이딩하지 않았다.
  </details>
  
  <details>
  <summary>
      👩‍💻 Math & wrapper 클래스
  </summary>
  ✅ Math 클래스
  
  : 수학계산에 용이
  
  ![image](https://github.com/Youjiiin/JAVAClass/assets/114130942/20ecc577-a4aa-4704-81f4-cf015e1dd53e)
  
  ✅ wrapper 클래스
  
  : 기본형을 클래스로 정의한 것. 기본형도 객체로 다뤄져야 할 때가 있다.
  - 내부적으로 기본형 변수를 가지고 있다.
  - 값을 비교하도록 equals()가 오버라이딩되어 있다.
  ![img_3](https://github.com/Youjiiin/JAVAClass/assets/114130942/900533b7-4e98-4fde-8cfe-0d5b2dc149ef)
  
  ✅ Number 클래스
  
  : 숫자를 멤버변수로 갖는 클래스의 조상(추상 클래스)
  ![img_4](https://github.com/Youjiiin/JAVAClass/assets/114130942/2a254d0e-7bfb-4ddb-9479-07f3a65134ab)

  </details>
</details>

----------------------------------------------------------------------

<details>
  <summary>
    📂 11장 : 컬렉션 프레임웍
  </summary>
  
  ✅ 컬렉션 프레임웍의 핵심 인터페이스
  - **List** : 순서가 있는 데이터 집합, 데이터의 중복을 허용한다.
  
  => 구현 클래스 : ArrayList, LinkedList, Stack, Vector
  
  - **Set** : 순서를 유지하지 않는 데이터의 집합. 데이터의 중복을 허용하지 않는다. 
  
  => 구현 클래스 : HashSet, TreeSet
  
  - **Map** : key와 value의 쌍으로 이루어진 데이터의 집합. 순서는 유지되지 않으며, 키는 중복을 허용하지 않고, 값은 중복을 허용한다.
  
  => 구현 클래스 : HashMap, TreeMap, Hashtable, Properites
  
  📌 List 인터페이스의 메서드 - 순서O, 중복O
  <img width="501" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/cc81142b-6593-4f0b-aa69-5f868f773818">
  
  📌 Set 인터페이스의 메서드 - 순서X, 중복X
  <img width="562" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/f99834fd-3287-49e0-8d93-30c05b624bb3">

  📌 Map 인터페이스의 메서드 - 순서X, 중복(키X, 값O)
  <img width="560" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/5d436230-bb72-4baa-afbf-a3cefe257af3">

  🧩 **ArrayList**

  - ArrayList는 기존의 Vector를 개선한 것으로 구현원리가 기능적으로 동일, Vector는 자체적으로 동기화 처리가 되어 있으나 ArrayList는 그렇지 않다.
  - List 인터페이스를 구현하므로, 저장순서가 유지되고 중복을 허용한다.
  - 데이터의 저장공간으로 배열을 사용한다.(배열 기반)
<img width="272" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/77355df1-c0f4-4fcd-97be-184e596df848">

```
  //리스트에 추가
  ArrayList list = new ArrayList();
  list.add("1");
  list.add("2");
  list.add("3");
  System.out.println(list);
  // [1, 2, 3]

  //특정 인덱스에 추가
  list.add(0, "0");
  System.out.println(list);
  //[0, 1, 2, 3]

  //객체 찾기
  System.out.println("index = " + list.indexOf("3"));
  //index = 3

  //개체 삭제
  list.remove("3");
  System.out.println(list);
  //[0, 1, 2]

  //없는 객체 삭제시
  System.out.println(list.remove("3"));
  //false

  //없는 객체 탐색시
  System.out.println("index = " + list.indexOf("3"));
  //index = -1
```
✔ ArrayList에 저장된 객체의 삭제 과정
0. ArrayList에 저장된 세 번째 데이터(data[2])를 삭제하는 과정. list.remove(2); 호출
<img width="90" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/7729246a-4cfc-45cc-a111-18fcb3882458">

1. 삭제할 데이터 아래의 데이터를 한 칸씩 위로 복사해서 삭제할 데이터를 덮어쓴다.
<img width="327" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/3284b074-56bf-473a-afcf-511cdeb143bb">

2. 데이터가 모두 한 칸씩 이동했으므로 마지막 데이터는 null로 변경한다.
3. 데이터가 삭제되어 데이터의 개수가 줄었으므로 size의 값을 감소시킨다.   
* 마지막 데이터를 삭제하는 경우, 1의 과정은 필요 없다.

✔ ArrayList의 장점과 단점
- 장점 : 배열은 구조가 간단하고 데이터를 읽는 데 걸리는 시간(접근 시간)이 짧다.
- 단점1 : 크기를 변경할 수 없다.
    - 크기를 변경해야 하는 경우 새로운 배열을 생성 후 데이터를 복사해야 함
    - 크기 변경을 피하기 위해 충분히 큰 배열을 생성하면, 메모리가 낭비됨.
- 단점 2 : 비순차적인 데이터의 추가, 삭제에 시간이 많이 걸린다.
    - 데이터를 추가하거나 삭제하기 위해, 다른 데이터를 옮겨야 함.
    - 그러나 순차적인 데이터를 (끝에 추가)와 삭제(끝부터 삭제)는 빠름.
 
🧩 **LinkedList**
- 배열의 단점을 보완했으며, 배열과 달리 불연속적으로 존재하는 데이터를 연결한다.
  <img width="534" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/079a4137-fc02-4271-9225-4b0c61790425">

  😮 ArrayList vs LinkedList
  1. 순차적으로 데이터를 추가/삭제 - ArrayList
  2. 비순차적으로 데이터를 추가/삭제 - LinkedList
  3. 접근시간 - ArrayList이 빠름
 
🧩 **Stack & Queue**
- Stack : LIFO구조. 마지막에 저장된 것을 제일 먼저 꺼내게 된다.
    - 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로(웹)
- Queue : FIFO구조. 제일 먼저 저장한 것을 제일 먼저 꺼내게 된다.
    - 최근 사용문서, 인쇄작업대기목록, 버퍼

✔ Queue의 변형
- 덱(Deque) : Stack과 Queue의 결합. 양끝에서 저장과 삭제가능
- 우선순위 큐 : 우선순위가 높은것부터 꺼냄
- 블락킹 큐 : 비어 있을 때 꺼내기와, 가득 차 있을 때 넣기를 지정된 시간동안 지연시킴 - 멀티쓰레드

🧩 **Arrays** - 배열을 다루기 편리한 메서드 제공
1. 배열의 출력 - toString()
```
static String toString(int[] a);
```
2. 다차원 배열의 비교와 출력 - deepEquals(), deepToString(), equals()
```
System.out.println(Arrays.equals(a, b));
```
3. 배열의 복사 - copyOf(), copyOfRange()
```
int[] arr = [0, 1, 2, 3, 4];
int[] arr2 = Arrays.copyOf(arr, 3);
//arr2 = [0, 1, 2]
int[] arr3 = Arrays.copyOfRange(arr, 2, 3);
//arr3 = [2, 3]
```
4. 배열 채우기 - fill(), setAll()
```
int[] arr = new int[5];
Arrays.fill(arr, 9); //[9, 9, 9, 9, 9];
Arrays.setAll(arr, () -> (int)(Math.random() * 5 + 1)); //[1, 9, 2, 3, 5];
```
5. 배열을 List로 변환 - asList(Object... a)
```
List list = Arrays.asList(1, 2, 3, 4, 5);
```
6. 배열의 정렬과 검색 - sort(), binarySearch()
```
int[] arr = {2, 3, 4, 1, 0};
Arrays.sort(arr);
int idx = Arrays.binarySearch(arr, 2);
//idx = 2
```

🧩 Comparator / Comparable : 객체를 정렬하는데 필요한 메서드를 정의한 인터페이스(정렬기준을 제공)
- Comparator : 기본 정렬기준을 구현하는데 사용
- Comparable : 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용

🧩 HashSet / TreeSet - 순서X, 중복X
- HashSet
  - Set 인터페이스를 구현한 대표적인 컬렉션 클래스
  - 순서를 유지하려면, LinkedHashSet클래스를 사용하면 된다.
  - HashSet은 객체를 저장하기전에 기존에 같은 객체가 있는지 확인한다. 같은 객체가 없으면 저장하고, 있으면 저장하지 않는다.
  - boolean add(Object 0)는 저장할 객체의 equals()와 hashCode()를 호출. equals()와 hashCode()가 오버라이딩 되어있어야 함
  - hashCode()의 오버라이딩 조건
    - 동일 객체에 대해 hashCode()를 여러번 호출해도 동일한 값을 반환해야 한다.
    - equlas()로 비교해서 true를 얻은 두 객체의 hashCode()값은 일치해야 한다. (false여도 같을 수 있다. 그러나 성능이 좋지 않음)
 
- TreeSet
  - 범위 검색과 정렬에 유리한 컬렉션 클래스
  - HashSet보다 데이터 추가, 삭제에 시간이 더 걸림
  - 범위 검색과 정렬에 유리한 이진 검색 트리로 구현. 링크드 리스트처럼 각 요소가 나무형태로 연결된 구조
  - 이진 트리는 모든 노드가 최대 두 개의 하위 노드를 갖음(부모-자식관계)
  - 이진 검색 트리는 부모보다 작은 값을 왼쪽에, 큰 값은 오른쪽에 저장
  - HashSet보다 데이터 추가, 삭제에 시간이 더 걸림(반복적인 비교 후 저장)
    <img width="558" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/0dd1dbd4-d9f6-4e48-b8d3-53834b5c400c">
  - 데이터 저장 과정
  <img width="510" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/cac94cc5-bb2d-427f-b6e8-5d26af51a68b">
  <img width="497" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/5e1644cb-f5c2-4363-b1bb-b09cb1df998a">
  <img width="468" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/b7dc241d-a616-4396-9ee9-a8d86309bc25">
  - 트리 순회(전위, 중위, 후위)
    - 이진 트리의 모든 노드를 한번씩 읽는 것을 트리 순회라고 한다.
    - 전위, 중위, 후위 순회법이 있으며, 중위 순회하면 오름차순으로 정렬된다.
      <img width="385" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/7d406c3b-291b-40b1-90ec-51591e8b678d">
      <img width="312" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/09b13bb0-ec39-40f4-805f-3313725d5a77">
      <img width="333" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/0c17f6d3-a6b4-4469-a412-ae10ff361916">
      <img width="350" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/57c6d96a-be3b-4e83-8575-268d70dff7c1">

🧩 **HashMap / TreeMap** - 순서X, 중복(키X, 값O)
- Map인터페이스를 구현, 데이터를 키와 값의 쌍으로 저장
- HashNap(동기화X)은 HashTable(동기화O)의 신버전

📌 HashMap
- Map 인터페이스를 구현한 대표적인 컬렉션 클래스
- 순서를 유지하려면, LinkedHashMap 클래스를 사용하면 된다.
- 해싱기법으로 데이터를 저장, 데이터가 많아도 검색이 빠르다.
- Map 인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장
  - key : 컬렉션 내의 키 중에서 유일해야 한다.
  - value : 키와 달리 데이터의 중복을 허용한다.
<img width="457" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/c78e7454-a783-404f-897d-f896b26aae2f">
- 해싱
  - 해시함수로 해시테이블에 데이터를 저장, 검색
  <img width="386" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/ecc00e12-81b0-4744-bc93-5c0747f99942">

  - 해시테이블은 배열과 링크드 리스트가 조합된 형태
  <img width="217" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/ebc0d309-cec2-4f47-825d-b127a7306431">

  - 해시테이블에 저장된 데터를 가져오는 과정
  1. 키로 해시함수를 호출해서 해시코드를 얻는다.
  2. 해시코드(해시함수의 반환값)에 대응하는 링크드리스트를 배열에서 찾는다.
  3. 링크드리스트에서 키와 일치하는 데이터를 찾는다.
  
  ※ 해시함수는 같은 키에 대해 항상 같은 해시코드를 반환해야 한다.
  서로 다른 키일지라도 같은 값의 해시코드를 반환할 수도 있다.
  <img width="439" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/bc32b2b9-770a-4938-a9eb-1d40fd230551">


📌 TreeMap
- 범위 검색과 정렬에 유리한 컬렉션 클래스
- HashMap보다 데이터 추가, 삭제에 시간이 더 걸림
- 이진 검색 트리의 구조로 키와 값의 쌍으로 이루어진 데이터를 저장
- TreeSet처럼, 데이터를 정렬해서 저장하기 때문에 저장시간이 길다.
- 다수의 데이터에서 개별적인 검색은 TreeMap보다 HashMap이 빠르다.
- Map이 필요할 때 주로 HashMap을 사용하고, 정렬이나 범위검색이 필요한 경우에 TreeMap을 사용

🧩 **Properties**
- 내부적으로 Hashtable을 사용하며, key와 value를 (String, String)로 저장
- 주로 어플리케이션의 환경설정에 관련된 속성을 저장하는데 사용되며 파일로부터 편리하게 값을 읽고 쓸 수 있는 메서드를 제공한다.

🧩 **Collections** - 컬렉션을 위한 메서드를 제공
1. 컬렉션 채우기, 복사, 정렬, 검색 - fill(), copy(), binarySearch() 등
2. 컬렉션의 동기화 - synchronizedXXX()
3. 변경불가(readOnly) 컬렉션 만들기 - unmodifiableXXX()
4. 싱글톤 컬렉션 만들기 - singletonXXX()
5. 한 종류의 객체만 저장하는 컬렉션 만들기 - checkedXXX()

👩‍💻 요약

<img width="408" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/f0eebf8b-29b1-4e35-a0c5-0d54c410b8f1">
<img width="514" alt="image" src="https://github.com/Youjiiin/JAVAClass/assets/114130942/64086d59-cec8-46f2-82ab-84d2e99c9e46">


</details>
