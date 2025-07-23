---

## 🏥 병원 환자 관리 시스템 – 단계별 실습 문제 설명

---

### 🟢 **1단계. 인터페이스 정의하기**

#### 🎯 목표 개념

* 인터페이스란 **클래스가 반드시 구현해야 하는 기능의 목록**입니다.
* 인터페이스는 메서드의 "형식(이름, 리턴값, 매개변수)"만 정의하고, 실제 내용은 클래스가 구현합니다.

#### 🔧 실습 지시

* `Checkable`이라는 이름의 인터페이스를 만들고 다음 3개의 메서드를 선언하세요:

```java
void checkStatus();        // 환자의 상태를 출력하는 메서드
int getRiskLevel();        // 위험도를 반환
String getDepartment();    // 진료과를 반환
```

> 💡 힌트: 메서드 본문은 쓰지 않고 세미콜론(;)으로 끝나야 합니다.

---

### 🟡 **2단계. 환자 클래스(Patient) 만들기**

#### 🎯 목표 개념

* 클래스를 만들어 **여러 정보를 하나로 묶는 법**을 배웁니다.
* 인터페이스를 **implements** 하여 정의된 메서드를 모두 구현해야 합니다.

#### 🔧 실습 지시

* `Patient` 클래스를 만들고 아래와 같은 정보를 담을 수 있도록 필드를 선언하세요:

| 변수명        | 자료형    | 설명          |
| ---------- | ------ | ----------- |
| name       | String | 환자 이름       |
| age        | int    | 나이          |
| department | String | 진료과 (내과 등)  |
| riskLevel  | int    | 위험도 (1\~10) |

* 위 4개 필드를 초기화할 수 있는 **생성자**를 만들고, 각 필드의 값을 반환하는 `getter`도 작성하세요.

* `Checkable` 인터페이스를 구현하여 다음과 같이 메서드를 완성하세요:

```java
@Override
public void checkStatus() {
    System.out.println(name + "님은 " + department + " 진료 중입니다. (위험도: " + riskLevel + ")");
}
```

> 💡 힌트: `implements Checkable`을 클래스 선언부에 붙이세요.

---

### 🔵 **3단계. 환자 목록을 ArrayList로 저장하기**

#### 🎯 목표 개념

* **여러 개의 객체를 저장**하려면 ArrayList를 사용합니다.
* ArrayList는 **반복문과 함께 사용할 수 있는 자료구조**입니다.

#### 🔧 실습 지시

* `ArrayList<Checkable>` 타입으로 리스트를 생성하고, `Patient` 객체를 3개 이상 만들어 리스트에 추가하세요.

```java
ArrayList<Checkable> patients = new ArrayList<>();
patients.add(new Patient("김민지", 34, "내과", 8));
```

> 💡 힌트: `ArrayList`는 제네릭 문법을 사용하며 `import java.util.*;` 필요

---

### 🟠 **4단계. 전체 환자 상태 출력하기 (for-each문)**

#### 🎯 목표 개념

* `for-each` 문을 사용해 리스트 안의 객체를 **하나씩 꺼내서 메서드 호출**할 수 있습니다.

#### 🔧 실습 지시

* `checkStatus()` 메서드를 반복문을 통해 모든 환자에 대해 호출하세요.

```java
for (Checkable p : patients) {
    p.checkStatus();
}
```

> 💡 힌트: `Checkable` 인터페이스 타입이기 때문에 `checkStatus()`를 직접 호출할 수 있어요.

---

### 🟣 **5단계. 위험한 환자만 골라서 출력하기 (조건문)**

#### 🎯 목표 개념

* 조건문(`if`)을 사용해 특정 조건을 만족하는 객체만 출력할 수 있습니다.

#### 🔧 실습 지시

* `riskLevel`이 7 이상인 환자만 출력하도록 조건을 추가하세요.

```java
if (p.getRiskLevel() >= 7) {
    p.checkStatus();
}
```

> 💡 힌트: `getRiskLevel()`은 위험도를 숫자로 반환합니다.

---

### ⚪ **6단계. 특정 진료과(내과) 환자만 출력하기**

#### 🎯 목표 개념

* `String` 값을 비교하여 필터링하는 법을 배웁니다. (`equals()` 메서드 사용)

#### 🔧 실습 지시

* `getDepartment()` 값이 `"내과"`인 환자만 출력되도록 조건문을 작성하세요.

```java
if (p.getDepartment().equals("내과")) {
    p.checkStatus();
}
```

---

### 🔴 **7단계. 잘못된 값 입력 시 예외 처리하기 (try-catch)**

#### 🎯 목표 개념

* `try-catch` 문으로 프로그램이 **강제 종료되지 않도록 예외를 처리**합니다.
* 생성자 내부에서는 `throw new IllegalArgumentException()` 으로 **직접 오류를 발생**시킵니다.

#### 🔧 실습 지시

* 생성자 안에 다음 조건을 위반할 경우 예외를 발생시키세요:

  * 이름이 비어 있으면
  * 나이가 음수이면
  * 위험도가 1\~10 사이가 아니면

```java
if (riskLevel < 1 || riskLevel > 10) {
    throw new IllegalArgumentException("위험도는 1~10 사이여야 합니다.");
}
```

* `main()` 메서드에서 `try-catch`를 이용해 예외를 처리하세요.

```java
try {
    patients.add(new Patient("홍길동", -10, "외과", 5));
} catch (IllegalArgumentException e) {
    System.out.println("[입력 오류] " + e.getMessage());
}
```

---

## ✅ 마무리 정리표

| 단계 | 주제          | 사용 문법                        |
| -- | ----------- | ---------------------------- |
| 1  | 인터페이스 정의    | `interface`, 메서드 선언만         |
| 2  | 클래스 구현      | `class`, 생성자, `implements`   |
| 3  | 리스트 저장      | `ArrayList`, 제네릭             |
| 4  | 전체 출력       | `for-each`, 다형성              |
| 5  | 조건 필터 (숫자)  | `if`, `>=` 조건문               |
| 6  | 조건 필터 (문자열) | `equals()` 문자열 비교            |
| 7  | 예외처리        | `throw`, `try-catch`, 유효성 검사 |

