package seven;

// 부모 클래스
class Parent {
    private String familyName;

    // 부모 클래스 생성자
    public Parent(String familyName) {
        this.familyName = familyName;
        System.out.println("부모 클래스 생성자 호출: " + familyName + " 가문");
    }

    // 부모 클래스 메서드
    public String getFamilyName() {
        return familyName;
    }
}

// 자식 클래스
class Child extends Parent {
    private String firstName;

    // 자식 클래스 생성자
    public Child(String familyName, String firstName) {
        super(familyName); // 부모 클래스 생성자 호출
        this.firstName = firstName;
        System.out.println("자식 클래스 생성자 호출: 이름은 " + firstName);
    }

    // 자식 클래스 메서드
    public void displayFullName() {
        System.out.println("전체 이름: " + getFamilyName() + " " + firstName);
    }
}

public class ParentConstructorCall {
    public static void main(String[] args) {
        // 자식 클래스 객체 생성
        Child child = new Child("김", "철수");

        // 자식 클래스 메서드 호출
        child.displayFullName();
    }
}

/*
 * 이론 설명:
 * 1. 부모 생성자를 사용하는 이유:
 * - **중복 제거 및 코드 재사용**:
 *   - 부모 클래스에 공통 속성과 초기화 코드를 정의하면, 자식 클래스에서 이를 재사용할 수 있습니다.
 *   - 자식 클래스는 공통 코드 대신 특화된 속성과 기능만 추가하면 됩니다.
 * - **명확한 설계와 역할 분리**:
 *   - 부모 클래스는 공통 속성과 기능을 정의합니다.
 *   - 자식 클래스는 부모 클래스의 기능을 확장하거나 특화된 기능을 추가합니다.
 * - **유지보수 효율성**:
 *   - 공통 코드를 부모 클래스에만 작성하면, 수정 시 모든 자식 클래스에 자동으로 적용됩니다.
 *   - 중복된 코드를 줄여 오류 발생 가능성을 낮춥니다.
 * 
 * 2. super 키워드:
 * - 부모 클래스의 생성자를 호출할 때 사용합니다.
 * - 반드시 생성자의 첫 줄에 작성해야 합니다.
 * - 부모 클래스의 매개변수가 있는 생성자를 호출할 때 유용합니다.
 * 
 * 3. 비유:
 * - 부모 클래스는 공통으로 쓰이는 "도구 상자"입니다.
 * - 자식 클래스는 그 도구 상자를 물려받아 필요한 도구를 추가하거나, 기존 도구를 활용하여 작업을 수행합니다.
 * - 도구를 일일이 새로 사는 대신, 부모가 미리 준비해둔 도구(속성과 초기화)를 사용합니다.
 * 
 * 4. 코드 설명:
 * - `Parent` 클래스는 공통 속성인 `familyName`을 초기화합니다.
 * - `Child` 클래스는 부모 클래스의 생성자를 호출하여 `familyName`을 초기화하고, 추가 속성인 `firstName`을 초기화합니다.
 * - `displayFullName()` 메서드는 부모 클래스의 `getFamilyName()` 메서드를 호출하여 전체 이름을 출력합니다.
 */