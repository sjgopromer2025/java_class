package six;

public class InstanceMemberAndThis {
    // 인스턴스 변수 (Instance Variable)
    private String name; // 이름
    private int age; // 나이

    // 생성자 (Constructor)
    public InstanceMemberAndThis(String name, int age) {
        // this 키워드를 사용하여 인스턴스 변수와 매개변수를 구분
        this.name = name;
        this.age = age;
    }

    // 인스턴스 메서드 (Instance Method)
    public void displayInfo() {
        // this 키워드를 사용하여 현재 객체의 인스턴스 변수에 접근
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
    }

    // 메서드 체이닝 (Method Chaining) 예제
    public InstanceMemberAndThis setName(String name) {
        this.name = name; // this를 사용하여 인스턴스 변수 설정
        return this; // 현재 객체를 반환
    }

    public InstanceMemberAndThis setAge(int age) {
        this.age = age; // this를 사용하여 인스턴스 변수 설정
        return this; // 현재 객체를 반환
    }

    // 메인 메서드 (Main Method)
    public static void main(String[] args) {
        // 객체 생성
        InstanceMemberAndThis person = new InstanceMemberAndThis("홍길동", 25);

        // 인스턴스 메서드 호출
        person.displayInfo();

        // 메서드 체이닝을 사용하여 필드 값 변경
        person.setName("이순신").setAge(30);

        // 변경된 값 출력
        System.out.println("\n변경된 정보:");
        person.displayInfo();
    }
}

/*
 * 이론 설명:
 * 1. 인스턴스 멤버:
 * - 인스턴스 변수와 인스턴스 메서드를 포함합니다.
 * - 인스턴스 변수는 객체마다 독립적인 값을 가집니다.
 * - 인스턴스 메서드는 특정 객체에서 호출되며, 해당 객체의 인스턴스 변수에 접근할 수 있습니다.
 * 
 * 2. this 키워드:
 * - 현재 객체를 참조하는 키워드입니다.
 * - 주로 다음과 같은 경우에 사용됩니다:
 * 1) 인스턴스 변수와 매개변수의 이름이 동일할 때 구분하기 위해 사용.
 * 2) 현재 객체를 반환하여 메서드 체이닝을 구현할 때 사용.
 * 3) 생성자에서 다른 생성자를 호출할 때 사용 (`this()`).
 * 
 * 3. 메서드 체이닝:
 * - 메서드 호출이 연속적으로 이어지도록 설계된 패턴입니다.
 * - 메서드가 `this`를 반환하여 동일한 객체에서 여러 메서드를 호출할 수 있습니다.
 * - 예: `object.setName("홍길동").setAge(25);`
 * 
 * 4. this의 주요 용도:
 * - 현재 객체의 인스턴스 변수와 메서드에 접근.
 * - 메서드 체이닝 구현.
 * - 생성자에서 다른 생성자 호출.
 * 
 * 실습 문제:
 * 1. InstanceMemberAndThis 클래스에 추가적인 인스턴스 변수(예: 주소)를 선언하고, 이를 설정하고 반환하는 메서드를
 * 작성하세요.
 * 2. 메서드 체이닝을 사용하여 이름, 나이, 주소를 설정하고, 모든 정보를 출력하세요.
 */