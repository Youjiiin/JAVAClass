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