package six;

public class MethodOverloadingExample {
    // 메서드 오버로딩 예제

    // 1. 매개변수가 없는 메서드
    public void printInfo() {
        System.out.println("정보가 없습니다.");
    }

    // 2. 매개변수가 하나인 메서드
    public void printInfo(String name) {
        System.out.println("이름: " + name);
    }

    // 3. 매개변수가 두 개인 메서드
    public void printInfo(String name, int age) {
        System.out.println("이름: " + name + ", 나이: " + age);
    }

    // 4. 매개변수의 타입이 다른 메서드
    public void printInfo(int age, String address) {
        System.out.println("나이: " + age + ", 주소: " + address);
    }

    // 메인 메서드 (Main Method)
    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        // 매개변수가 없는 메서드 호출
        example.printInfo();

        // 매개변수가 하나인 메서드 호출
        example.printInfo("홍길동");

        // 매개변수가 두 개인 메서드 호출
        example.printInfo("이순신", 30);

        // 매개변수의 타입이 다른 메서드 호출
        example.printInfo(25, "서울");
    }
}

/*
 * 이론 설명:
 * 1. 메서드 오버로딩이란?
 * - 메서드 오버로딩은 동일한 이름의 메서드를 여러 개 정의하는 것을 의미합니다.
 * - 각 메서드는 매개변수의 개수나 타입이 달라야 합니다.
 * 
 * 2. 메서드 오버로딩의 특징:
 * - 메서드 오버로딩을 통해 동일한 작업을 수행하는 메서드를 다양한 방식으로 호출할 수 있습니다.
 * - 반환 타입은 메서드 오버로딩에 영향을 주지 않습니다.
 * 
 * 3. 메서드 오버로딩의 규칙:
 * - 메서드 이름은 동일해야 합니다.
 * - 매개변수의 개수나 타입이 달라야 합니다.
 * - 반환 타입만 다르고 매개변수가 동일하면 컴파일 오류가 발생합니다.
 * 
 * 4. 메서드 오버로딩의 장점:
 * - 코드의 가독성과 재사용성을 향상시킵니다.
 * - 동일한 작업을 수행하는 메서드를 다양한 방식으로 호출할 수 있습니다.
 * 
 * 5. 메서드 오버로딩의 예:
 * - `System.out.println()` 메서드는 다양한 데이터 타입을 출력할 수 있도록 오버로딩되어 있습니다.
 * 
 * 실습 문제:
 * 1. MethodOverloadingExample 클래스에 추가적인 메서드를 작성하여 다음을 출력하세요:
 * - 이름과 이메일 (String, String).
 * - 이름, 나이, 주소 (String, int, String).
 * 2. 메서드 오버로딩을 활용하여 다양한 방식으로 메서드를 호출하고 결과를 출력하세요.
 */