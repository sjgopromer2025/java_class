package seven;

// 부모 클래스
class ElectronicDevice {
    private String brand; // private 멤버 (직접 접근 불가)

    // 생성자
    public ElectronicDevice(String brand) {
        this.brand = brand;
    }

    // Getter: private 멤버에 간접적으로 접근
    public String getBrand() {
        return brand;
    }

    // Setter: private 멤버 값을 설정
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void powerOn() {
        System.out.println(brand + " 전자기기가 켜졌습니다.");
    }

    public void powerOff() {
        System.out.println(brand + " 전자기기가 꺼졌습니다.");
    }
}

// 자식 클래스
class Smartphone extends ElectronicDevice {
    private String model; // 자식 클래스 고유 멤버

    // 생성자
    public Smartphone(String brand, String model) {
        super(brand); // 부모 클래스 생성자 호출
        this.model = model;
    }

    public void makeCall(String number) {
        System.out.println(getBrand() + " " + model + "에서 " + number + "로 전화를 겁니다.");
    }

    public void displayInfo() {
        System.out.println("브랜드: " + getBrand() + ", 모델: " + model);
    }
}

public class ClassInheritance {
    public static void main(String[] args) {
        // 객체 생성
        Smartphone phone = new Smartphone("삼성", "갤럭시 S23");

        // 부모 클래스의 메서드 호출
        phone.powerOn();

        // 자식 클래스의 메서드 호출
        phone.makeCall("010-1234-5678");
        phone.displayInfo();

        // 부모 클래스의 private 멤버 값을 Setter로 변경
        phone.setBrand("애플");
        System.out.println("\n브랜드 변경 후:");
        phone.powerOn();
        phone.makeCall("010-9876-5432");
        phone.displayInfo();
    }
}

/*
 * 이론 설명:
 * 1. private 멤버:
 * - 부모 클래스의 `private` 멤버는 자식 클래스에서 직접 접근할 수 없습니다.
 * - 하지만, 부모 클래스에서 제공하는 `Getter`와 `Setter` 메서드를 통해 간접적으로 접근할 수 있습니다.
 * 
 * 2. Getter와 Setter:
 * - `Getter`: `private` 멤버 값을 반환하는 메서드.
 * - `Setter`: `private` 멤버 값을 설정하는 메서드.
 * 
 * 3. 코드 설명:
 * - `ElectronicDevice` 클래스의 `brand` 필드는 `private`로 선언되어 자식 클래스에서 직접 접근할 수 없습니다.
 * - `getBrand()`와 `setBrand()` 메서드를 통해 `brand` 필드에 간접적으로 접근합니다.
 * - 자식 클래스 `Smartphone`은 부모 클래스의 `Getter`를 사용하여 `brand` 값을 읽고 출력합니다.
 */