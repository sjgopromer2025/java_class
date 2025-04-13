package 상속과다형성;

// 부모 클래스
class Animal {
    public void eat() {
        System.out.println("동물이 먹고 있습니다.");
    }
}

// 자식 클래스
class Dog extends Animal {
    public void bark() {
        System.out.println("강아지가 짖고 있습니다.");
    }
}

public class InheritanceConcept {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // 부모 클래스의 메서드 호출
        dog.bark(); // 자식 클래스의 메서드 호출
    }
}

/*
 * 이론 설명:
 * 1. 상속(Inheritance)이란?
 * - 상속은 기존 클래스(부모 클래스)의 속성과 메서드를 새로운 클래스(자식 클래스)가 물려받는 것을 의미합니다.
 * - 코드 재사용성을 높이고, 계층 구조를 통해 프로그램을 구조화합니다.
 * 
 * 2. 상속의 특징:
 * - 부모 클래스의 모든 public, protected 멤버를 자식 클래스가 상속받습니다.
 * - private 멤버는 상속되지 않지만, 간접적으로 접근할 수 있습니다(예: Getter/Setter 사용).
 * 
 * 3. 상속의 장점:
 * - 코드 재사용성 증가.
 * - 유지보수성 향상.
 * - 계층 구조를 통해 논리적 설계 가능.
 * 
 * 4. 상속의 키워드:
 * - `extends`: 자식 클래스가 부모 클래스를 상속받을 때 사용.
 * - 예: `class Dog extends Animal { ... }`
 */