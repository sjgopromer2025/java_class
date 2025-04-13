package seven;

// final 클래스
final class FinalClass {
    public void display() {
        System.out.println("이 클래스는 상속할 수 없습니다.");
    }
}

// 부모 클래스
class Parent {
    public final void finalMethod() {
        System.out.println("이 메서드는 재정의할 수 없습니다.");
    }
}

// 자식 클래스
class Child extends Parent {
    // public void finalMethod() { } // 컴파일 오류: final 메서드는 재정의할 수 없음
}

public class FinalClassAndMethod {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display();

        Child child = new Child();
        child.finalMethod();
    }
}

/*
 * 이론 설명:
 * 1. final 클래스:
 * - `final` 키워드를 사용하여 선언된 클래스는 상속할 수 없습니다.
 * - 예: `final class FinalClass { ... }`
 * 
 * 2. final 메서드:
 * - `final` 키워드를 사용하여 선언된 메서드는 재정의할 수 없습니다.
 * - 예: `public final void methodName() { ... }`
 * 
 * 3. final 키워드의 장점:
 * - 클래스나 메서드의 변경을 방지하여 코드의 안정성을 높입니다.
 */