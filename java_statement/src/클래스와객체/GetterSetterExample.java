package 클래스와객체;

public class GetterSetterExample {
    // 필드 (Field)
    private String name; // 이름
    private int age; // 나이

    // 생성자 (Constructor)
    public GetterSetterExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter 메서드
    // 필드 값을 반환하는 메서드
    public String getName() {
        return name; // 이름 반환
    }

    public int getAge() {
        return age; // 나이 반환
    }

    // Setter 메서드
    // 필드 값을 설정하는 메서드
    public void setName(String name) {
        this.name = name; // 이름 설정
    }

    public void setAge(int age) {
        if (age > 0) { // 유효성 검사: 나이는 0보다 커야 함
            this.age = age;
        } else {
            System.out.println("나이는 0보다 커야 합니다.");
        }
    }

    // 메인 메서드 (Main Method)
    public static void main(String[] args) {
        // 객체 생성
        GetterSetterExample person = new GetterSetterExample("홍길동", 25);

        // Getter 메서드 호출
        System.out.println("이름: " + person.getName());
        System.out.println("나이: " + person.getAge());

        // Setter 메서드 호출
        person.setName("이순신");
        person.setAge(30);

        // 변경된 값 출력
        System.out.println("\n변경된 이름: " + person.getName());
        System.out.println("변경된 나이: " + person.getAge());

        // 유효하지 않은 값 설정 시도
        person.setAge(-5); // 유효성 검사로 인해 설정되지 않음
    }
}

/*
 * 이론 설명:
 * 1. Getter와 Setter란?
 * - Getter: 클래스의 필드 값을 반환하는 메서드.
 * - Setter: 클래스의 필드 값을 설정하는 메서드.
 * 
 * 2. Getter와 Setter의 역할:
 * - 캡슐화(Encapsulation)를 구현하는 데 사용됩니다.
 * - 필드에 직접 접근하지 못하도록 하고, 메서드를 통해 안전하게 값을 읽거나 수정할 수 있도록 합니다.
 * - 유효성 검사를 추가하여 잘못된 값이 설정되지 않도록 방지할 수 있습니다.
 * 
 * 3. Getter와 Setter의 작성 규칙:
 * - Getter 메서드:
 * - 반환 타입은 필드의 데이터 타입과 동일합니다.
 * - 메서드 이름은 "get"으로 시작하고, 필드 이름의 첫 글자를 대문자로 작성합니다.
 * - 예: `public String getName() { return name; }`
 * - Setter 메서드:
 * - 반환 타입은 `void`입니다.
 * - 메서드 이름은 "set"으로 시작하고, 필드 이름의 첫 글자를 대문자로 작성합니다.
 * - 매개변수는 필드의 데이터 타입과 동일합니다.
 * - 예: `public void setName(String name) { this.name = name; }`
 * 
 * 4. Getter와 Setter의 장점:
 * - 필드에 직접 접근하지 못하도록 하여 데이터 보호.
 * - 유효성 검사를 통해 잘못된 값 설정 방지.
 * - 코드의 유지보수성과 가독성 향상.
 * 
 * 5. 실습 문제:
 * 1) GetterSetterExample 클래스에 추가적인 필드(예: 주소)를 선언하고, 이를 설정하고 반환하는 Getter와 Setter
 * 메서드를 작성하세요.
 * 2) 유효성 검사를 추가하여 나이가 0보다 작거나 너무 큰 값(예: 150 이상)이 설정되지 않도록 수정하세요.
 * 3) 새로운 객체를 생성하고, 모든 필드 값을 출력하세요.
 */