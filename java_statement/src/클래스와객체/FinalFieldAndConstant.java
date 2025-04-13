package 클래스와객체;

public class FinalFieldAndConstant {
    // final 인스턴스 변수
    // 한 번 초기화되면 값을 변경할 수 없음
    private final String name;

    // static final 상수
    // 클래스에 속하며, 변경할 수 없는 고정된 값
    public static final double PI = 3.14159;

    // 생성자 (Constructor)
    public FinalFieldAndConstant(String name) {
        this.name = name; // final 필드는 생성자에서 초기화 가능
    }

    // 인스턴스 메서드
    public String getName() {
        return name; // final 필드 반환
    }

    // 정적 메서드
    public static double getCircleArea(double radius) {
        // static final 상수를 사용하여 원의 넓이 계산
        return PI * radius * radius;
    }

    // 메인 메서드 (Main Method)
    public static void main(String[] args) {
        // final 필드 사용
        FinalFieldAndConstant person = new FinalFieldAndConstant("홍길동");
        System.out.println("이름: " + person.getName());

        // static final 상수 사용
        System.out.println("PI 값: " + FinalFieldAndConstant.PI);

        // 정적 메서드를 사용하여 원의 넓이 계산
        double radius = 5.0;
        System.out.println("반지름이 " + radius + "인 원의 넓이: " + FinalFieldAndConstant.getCircleArea(radius));
    }
}

/*
 * 이론 설명:
 * 1. final 필드:
 * - `final` 키워드를 사용하여 선언된 변수는 한 번 초기화되면 값을 변경할 수 없습니다.
 * - final 필드는 다음과 같은 방식으로 초기화할 수 있습니다:
 * 1) 선언 시 초기화: `private final int value = 10;`
 * 2) 생성자에서 초기화: 생성자를 통해 객체 생성 시 값을 설정.
 * 
 * 2. static final 상수:
 * - `static`과 `final` 키워드를 함께 사용하여 선언된 변수는 클래스에 속하며, 변경할 수 없는 고정된 값입니다.
 * - 상수 이름은 일반적으로 대문자로 작성하며, 단어는 밑줄(`_`)로 구분합니다.
 * - 예: `public static final double PI = 3.14159;`
 * 
 * 3. final 필드와 상수의 특징:
 * - final 필드는 객체마다 독립적인 값을 가질 수 있지만, 한 번 설정된 값은 변경할 수 없습니다.
 * - static final 상수는 모든 객체가 공유하며, 프로그램 실행 중 값이 변경되지 않습니다.
 * 
 * 4. final 키워드의 주요 용도:
 * - 변수: 값을 변경할 수 없도록 설정.
 * - 메서드: 메서드를 오버라이드할 수 없도록 설정.
 * - 클래스: 클래스를 상속할 수 없도록 설정.
 * 
 * 실습 문제:
 * 1. FinalFieldAndConstant 클래스에 추가적인 final 필드(예: 나이)를 선언하고, 생성자를 통해 초기화하세요.
 * 2. static final 상수를 추가하여 프로그램의 고정된 값을 관리하세요 (예: 중력 가속도 `GRAVITY = 9.8`).
 * 3. 정적 메서드를 작성하여 상수를 활용한 계산을 수행하세요 (예: 자유 낙하 거리 계산).
 */