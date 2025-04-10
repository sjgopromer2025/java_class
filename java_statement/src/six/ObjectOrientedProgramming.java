package six;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍(OOP)의 기본 개념
        // 1. 클래스: 객체를 생성하기 위한 설계도.
        // 2. 객체: 클래스에서 생성된 인스턴스.
        // 3. 캡슐화, 상속, 다형성, 추상화가 OOP의 주요 특징.

        // 클래스에서 객체 생성
        Car myCar = new Car("현대", "소나타", 2023, "검정색");
        System.out.println("내 차 정보: " + myCar.getCarInfo());
    }
}

// 클래스 정의
class Car {
    private String brand; // 브랜드
    private String model; // 모델
    private int year; // 연식
    private String color; // 색상

    // 생성자
    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // 메서드
    public String getCarInfo() {
        return brand + " " + model + " (" + year + ", " + color + ")";
    }
}

/*
 * 이론 설명:
 * 1. 객체 지향 프로그래밍(OOP):
 * - 객체 지향 프로그래밍은 현실 세계를 모델링하여 객체를 중심으로 프로그램을 설계하는 방식입니다.
 * - 주요 특징:
 * 1) 캡슐화: 데이터와 메서드를 하나의 단위로 묶고, 외부에서 접근을 제한.
 * 2) 상속: 기존 클래스의 속성과 메서드를 재사용하여 새로운 클래스를 생성.
 * 3) 다형성: 동일한 메서드가 다양한 방식으로 동작.
 * 4) 추상화: 불필요한 세부 사항을 숨기고 중요한 부분만 표현.
 * 
 * 2. 클래스와 객체:
 * - 클래스는 객체를 생성하기 위한 설계도입니다.
 * - 객체는 클래스에서 생성된 인스턴스로, 실제 데이터를 저장하고 동작을 수행합니다.
 */