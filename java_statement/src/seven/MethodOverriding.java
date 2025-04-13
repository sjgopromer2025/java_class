package seven;

// 부모 클래스
class Animal {
    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

// 자식 클래스
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("고양이가 야옹합니다.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Cat cat = new Cat();
        cat.sound(); // 재정의된 메서드 호출
    }
}

/*
 * 이론 설명:
 * 1. 메서드 재정의(Method Overriding):
 * - 부모 클래스의 메서드를 자식 클래스에서 재정의하여 새로운 동작을 정의하는 것.
 * - `@Override` 어노테이션을 사용하여 재정의 여부를 명시적으로 표시.
 * 
 * 2. 재정의 규칙:
 * - 메서드 이름, 매개변수, 반환 타입이 부모 클래스와 동일해야 합니다.
 * - 접근 제한자는 부모 클래스의 메서드보다 더 제한적일 수 없습니다.
 * 
 * 3. 재정의의 장점:
 * - 다형성을 구현하여 객체의 동작을 유연하게 변경할 수 있습니다.
 */