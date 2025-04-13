package practice.seven;

// 부모 클래스
class Vehicle {
    // 필드
    private String brand;

    // 생성자
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // 메서드
    public void start() {
        System.out.println(brand + " 차량이 출발합니다.");
    }

    public void stop() {
        System.out.println(brand + " 차량이 멈춥니다.");
    }
}

// 자식 클래스
class Car extends Vehicle {
    private int doors;

    // 생성자
    public Car(String brand, int doors) {
        super(brand); // 부모 클래스 생성자 호출
        this.doors = doors;
    }

    // 메서드
    public void displayInfo() {
        System.out.println("이 자동차는 " + doors + "개의 문을 가지고 있습니다.");
    }
}

// 또 다른 자식 클래스
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // 생성자
    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand); // 부모 클래스 생성자 호출
        this.hasSidecar = hasSidecar;
    }

    // 메서드
    public void displayInfo() {
        if (hasSidecar) {
            System.out.println("이 오토바이는 사이드카가 있습니다.");
        } else {
            System.out.println("이 오토바이는 사이드카가 없습니다.");
        }
    }
}

public class InheritancePractice {
    public static void main(String[] args) {
        // 자동차 객체 생성
        Car car = new Car("현대", 4);
        car.start();
        car.displayInfo();
        car.stop();

        System.out.println();

        // 오토바이 객체 생성
        Motorcycle motorcycle = new Motorcycle("혼다", true);
        motorcycle.start();
        motorcycle.displayInfo();
        motorcycle.stop();
    }
}

/*
 * 문제 내용:
 * 1. 부모 클래스 `Vehicle`을 작성하세요:
 * - 필드: 브랜드(brand).
 * - 메서드: `start()`와 `stop()` 메서드로 차량의 출발과 정지를 출력하세요.
 * 
 * 2. 자식 클래스 `Car`를 작성하세요:
 * - 추가 필드: 문 개수(doors).
 * - 메서드: 자동차의 문 개수를 출력하는 `displayInfo()` 메서드를 작성하세요.
 * 
 * 3. 또 다른 자식 클래스 `Motorcycle`을 작성하세요:
 * - 추가 필드: 사이드카 여부(hasSidecar).
 * - 메서드: 사이드카 여부를 출력하는 `displayInfo()` 메서드를 작성하세요.
 * 
 * 4. `InheritancePractice` 클래스의 `main` 메서드에서 다음을 수행하세요:
 * - `Car` 객체와 `Motorcycle` 객체를 생성하세요.
 * - 각 객체의 `start()`, `displayInfo()`, `stop()` 메서드를 호출하여 동작을 확인하세요.
 * 
 * 추가 실습:
 * 1. `Vehicle` 클래스에 새로운 메서드 `honk()`를 추가하고, 자식 클래스에서 호출해 보세요.
 * 2. `Car`와 `Motorcycle` 클래스에 각각 고유한 메서드를 추가하고 호출해 보세요.
 */