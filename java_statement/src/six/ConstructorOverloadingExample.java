package six;

public class ConstructorOverloadingExample {
    // 필드 (Field)
    private String name = "이름 없음";
    private int age = 0;
    private String address = "주소 없음";

    // 기본 생성자 (Default Constructor)
    public ConstructorOverloadingExample() {
        this.name = "이름 없음";
        this.age = 0;
        this.address = "주소 없음";
    }

    // 매개변수가 하나인 생성자
    public ConstructorOverloadingExample(String name) {
        this.name = name;
    }

    // 매개변수가 두 개인 생성자
    public ConstructorOverloadingExample(String name, int age) {
        this(name);
        this.age = age;
    }

    // 매개변수가 세 개인 생성자
    public ConstructorOverloadingExample(String name, int age, String address) {
        this(name, age);
        this.address = address;
    }

    // 메서드 (Method)
    public void displayInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + address);
    }

    // 메인 메서드 (Main Method)
    public static void main(String[] args) {
        // 기본 생성자 사용
        ConstructorOverloadingExample person1 = new ConstructorOverloadingExample();
        person1.displayInfo();

        System.out.println();

        // 매개변수가 하나인 생성자 사용
        ConstructorOverloadingExample person2 = new ConstructorOverloadingExample("홍길동");
        person2.displayInfo();

        System.out.println();

        // 매개변수가 두 개인 생성자 사용
        ConstructorOverloadingExample person3 = new ConstructorOverloadingExample("이순신", 30);
        person3.displayInfo();

        System.out.println();

        // 매개변수가 세 개인 생성자 사용
        ConstructorOverloadingExample person4 = new ConstructorOverloadingExample("유관순", 20, "서울");
        person4.displayInfo();
    }
}

/*
 * 이론 설명:
 * 1. 생성자 오버로딩이란?
 * - 생성자 오버로딩은 동일한 이름의 생성자를 여러 개 정의하는 것을 의미합니다.
 * - 각 생성자는 매개변수의 개수나 타입이 달라야 합니다.
 * 
 * 2. 생성자 오버로딩의 특징:
 * - 생성자 오버로딩을 통해 객체 생성 시 다양한 초기화 방법을 제공할 수 있습니다.
 * - 기본 생성자와 매개변수가 있는 생성자를 함께 사용할 수 있습니다.
 * 
 * 3. 생성자 오버로딩의 규칙:
 * - 생성자의 이름은 클래스 이름과 동일해야 합니다.
 * - 매개변수의 개수나 타입이 달라야 합니다 (메서드 오버로딩과 동일한 규칙).
 * 
 * 4. this 키워드:
 * - 생성자 내부에서 다른 생성자를 호출할 때 `this()`를 사용할 수 있습니다.
 * - 예: `this(name, 0, "주소 없음");`
 * 
 * 5. 생성자 오버로딩의 장점:
 * - 객체 생성 시 다양한 초기화 방법을 제공하여 코드의 유연성을 높입니다.
 * - 코드의 가독성과 재사용성을 향상시킵니다.
 * 
 * 실습 문제:
 * 1. ConstructorOverloadingExample 클래스에 추가적인 필드(예: 이메일)를 선언하고, 이를 초기화하는 생성자를
 * 작성하세요.
 * 2. 생성자 오버로딩을 활용하여 다양한 방식으로 객체를 생성하고, 모든 필드 값을 출력하세요.
 * 3. 생성자 내부에서 `this()`를 사용하여 중복 코드를 제거하세요.
 */