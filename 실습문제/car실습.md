좋아요! 학생 클래스 대신 다른 실생활 예제로 구성하고, 조건문(`if`)과 반복문(`for`)도 활용하는 방향으로 문제를 다시 설계했습니다. 아래는 문제와 단계별 학습 목표를 **분리하여 구성**한 형태입니다.

---

## 🧩 **클래스 실습 문제 (단계별 구성)**

### 🟢 **\[1단계] 자동차(Car) 클래스 만들기**

**문제 1.**
`Car` 클래스를 정의하고, 다음과 같은 기능을 구현하세요.

1. 자동차의 `모델명(model)`과 `연식(year)`을 저장할 수 있는 **인스턴스 변수**를 선언하세요.
2. 두 값을 초기화할 수 있는 **생성자**를 만드세요.
3. 모델명과 연식을 반환하는 **인스턴스 메서드**를 각각 만드세요.

---

### 🟡 **\[2단계] 여러 대의 자동차 출력하기**

**문제 2.**

1. 자동차 객체를 3개 이상 생성하세요.
2. `for`문을 사용하여 각각의 자동차 정보를 출력하세요.

---

### 🔵 **\[3단계] 등록된 차량 수 계산하기 (클래스 변수 활용)**

**문제 3.**

1. 등록된 전체 차량 수를 저장하는 **클래스 변수(static)** 를 선언하세요.
2. 자동차가 생성될 때마다 수를 1씩 증가시키세요.
3. 전체 등록 차량 수를 반환하는 **클래스 메서드(static)** 를 작성하고 출력하세요.

---

### 🟠 **\[4단계] 주행 제한 여부 판별 (조건문 활용)**

**문제 4.**

1. 자동차가 \*\*10년 이상 된 경우 "폐차 대상"\*\*이라는 메시지를 출력하는 메서드를 작성하세요.
2. 현재 연도를 2025로 가정하고, 자동차 객체 각각에 대해 폐차 여부를 판단하세요.
3. `if`문을 활용하여 메시지를 출력하세요.

---

### 🟣 **\[5단계] 연비 정보 추가 및 필터링**

**문제 5.**

1. 자동차의 **연비(fuelEfficiency, km/L)** 정보를 저장하는 인스턴스 변수를 추가하세요.
2. 연비가 **10km/L 미만인 차량만 출력**하도록 `for`문과 `if`문을 활용하세요.

---

## 🎯 **단계별 목표 개념 정리**

| 단계  | 목표 개념                                   | 사용 문법                                 |
| ----- | ------------------------------------------- | ----------------------------------------- |
| 1단계 | 클래스 정의, 생성자, 인스턴스 변수와 메서드 | `class`, `constructor`, `this`, getter    |
| 2단계 | 객체 배열/리스트 처리, 반복문               | `for`, 배열 또는 `List<Car>`              |
| 3단계 | 클래스 변수, 클래스 메서드                  | `static`, 클래스 메서드, 생성자 내부 로직 |
| 4단계 | 조건문 활용                                 | `if`, 비교 연산자, 출력 로직              |
| 5단계 | 조건 필터링 및 출력                         | `if`, `for`, 부등호 비교                  |

---

## 💡 예시 출력 형태 (힌트용)

```
차량 모델: K5, 연식: 2012, 연비: 8.5km/L
-> 폐차 대상입니다.

차량 모델: 소나타, 연식: 2018, 연비: 11.0km/L
-> 정상 차량입니다.

[전체 등록 차량 수: 3대]
[연비 10km/L 미만 차량 목록]
K5
```

---

```java

이 문제들은 \*\*자동차(Car)\*\*를 예제로 하여 현실과 잘 연결되고, `static`, `if`, `for`, 객체 배열 등 다양한 기초 문법을 자연스럽게 연습할 수 있도록 설계했습니다.
필요하다면 `List<Car>`를 쓰도록 유도하거나 `Scanner`를 활용한 입력 버전으로 확장도 가능합니다.
원하시면 각 단계별 해설 코드도 함께 드릴게요.

class Car {
// 인스턴스 변수
private String model;
private int year;
private double fuelEfficiency; // 연비 (km/L)

    // 클래스 변수
    private static int totalCars = 0;

    // 생성자
    public Car(String model, int year, double fuelEfficiency) {
        this.model = model;
        this.year = year;
        this.fuelEfficiency = fuelEfficiency;
        totalCars++;
    }

    // 인스턴스 메서드
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    // 폐차 여부 판단
    public void checkRetirement() {
        int currentYear = 2025;
        if (currentYear - year >= 10) {
            System.out.println("-> 폐차 대상입니다.");
        } else {
            System.out.println("-> 정상 차량입니다.");
        }
    }

    // 클래스 메서드
    public static int getTotalCars() {
        return totalCars;
    }

}

public class CarTest {
public static void main(String[] args) {
// 자동차 객체 배열 생성
Car[] cars = new Car[3];
cars[0] = new Car("K5", 2012, 8.5);
cars[1] = new Car("소나타", 2018, 11.0);
cars[2] = new Car("아반떼", 2020, 15.2);

        // 모든 자동차 정보 출력 및 폐차 여부 판단
        System.out.println("📌 등록 차량 정보:");
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("모델명: %s, 연식: %d, 연비: %.1f km/L\n",
                    cars[i].getModel(), cars[i].getYear(), cars[i].getFuelEfficiency());
            cars[i].checkRetirement();
            System.out.println();
        }

        // 전체 차량 수 출력
        System.out.println("🚗 전체 등록 차량 수: " + Car.getTotalCars() + "대");

        // 연비 10km/L 미만 차량 출력
        System.out.println("\n⚠️ 연비 10km/L 미만 차량 목록:");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getFuelEfficiency() < 10.0) {
                System.out.println(cars[i].getModel());
            }
        }
    }

}
```
