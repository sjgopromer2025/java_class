package seven;

// 부모 클래스
class Parent {
    protected String name = "부모 클래스";

    protected void display() {
        System.out.println("Protected 메서드 호출: " + name);
    }
}

// 자식 클래스
class Child extends Parent {
    public void show() {
        display(); // 부모 클래스의 protected 메서드 호출
    }
}

public class ProtectedAccessModifier {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}

/*
 * 이론 설명:
 * 1. Protected 접근 제한자:
 * - 같은 패키지 또는 상속받은 클래스에서 접근할 수 있습니다.
 * - 외부 클래스에서는 접근할 수 없습니다.
 * 
 * 2. 사용 예:
 * - 부모 클래스의 멤버를 자식 클래스에서 사용할 때 유용합니다.
 * - 예: `protected int value;`
 */