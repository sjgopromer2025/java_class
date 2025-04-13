package 인터페이스;

// 인터페이스 정의
interface Animal {
    void eat();

    void sleep();
}

// 인터페이스 정의 (다중 상속 예제)
interface Pet {
    void play();
}

// 인터페이스 구현 클래스 1
class Dog implements Animal, Pet { // 다중 상속
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + "이(가) 사료를 먹고 있습니다.");
    }

    @Override
    public void sleep() {
        System.out.println(name + "이(가) 잠을 잡니다.");
    }

    @Override
    public void play() {
        System.out.println(name + "이(가) 공놀이를 하고 있습니다.");
    }

    public void bark() {
        System.out.println(name + "이(가) 멍멍 짖습니다.");
    }
}

// 인터페이스 구현 클래스 2
class Cat implements Animal, Pet { // 다중 상속
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + "이(가) 생선을 먹고 있습니다.");
    }

    @Override
    public void sleep() {
        System.out.println(name + "이(가) 잠을 잡니다.");
    }

    @Override
    public void play() {
        System.out.println(name + "이(가) 레이저 포인터를 쫓고 있습니다.");
    }

    public void purr() {
        System.out.println(name + "이(가) 골골 소리를 냅니다.");
    }
}

// 메인 클래스
public class InterfaceExample {
    public static void main(String[] args) {
        // 인터페이스 타입으로 객체 참조
        Animal dog = new Dog("바둑이");
        Animal cat = new Cat("나비");

        // 공통 메서드 호출
        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();

        System.out.println();

        // 다운캐스팅을 통해 고유 메서드 호출
        if (dog instanceof Dog) {
            ((Dog) dog).bark();
            ((Dog) dog).play(); // Pet 인터페이스 메서드 호출
        }

        if (cat instanceof Cat) {
            ((Cat) cat).purr();
            ((Cat) cat).play(); // Pet 인터페이스 메서드 호출
        }
    }
}

/*
 * 이론 설명:
 * 1. 인터페이스란?
 * - 인터페이스는 클래스가 구현해야 하는 메서드의 집합을 정의합니다.
 * - 인터페이스는 다중 상속을 지원하며, 클래스 간의 공통 동작을 정의하는 데 사용됩니다.
 * 
 * 2. 인터페이스의 특징:
 * - 모든 메서드는 기본적으로 `public`이며, 구현부가 없는 추상 메서드입니다.
 * - 필드는 `public static final`로 선언되며, 상수로만 사용됩니다.
 * - 인터페이스는 객체를 생성할 수 없으며, 이를 구현한 클래스에서 객체를 생성합니다.
 * 
 * 3. 다중 상속:
 * - 자바는 클래스 간의 다중 상속을 지원하지 않지만, 인터페이스를 통해 다중 상속을 구현할 수 있습니다.
 * - 한 클래스가 여러 인터페이스를 `implements` 키워드를 사용하여 구현할 수 있습니다.
 * - 예: `class Dog implements Animal, Pet { ... }`
 * 
 * 4. 인터페이스의 역할:
 * - 클래스 간의 공통 동작을 정의하여 코드의 일관성을 유지합니다.
 * - 다형성을 구현하여 다양한 객체를 동일한 방식으로 처리할 수 있습니다.
 * 
 * 5. 코드 설명:
 * - `Animal` 인터페이스는 `eat()`와 `sleep()` 메서드를 정의합니다.
 * - `Pet` 인터페이스는 `play()` 메서드를 정의합니다.
 * - `Dog`와 `Cat` 클래스는 `Animal`과 `Pet` 인터페이스를 모두 구현하며, 각 클래스의 고유 동작을 추가합니다.
 * - `main` 메서드에서 인터페이스 타입으로 객체를 참조하고, 다운캐스팅을 통해 고유 메서드를 호출합니다.
 * 
 * 6. 실습 문제:
 * 1) 새로운 인터페이스 `Vehicle`을 작성하고, `start()`와 `stop()` 메서드를 정의하세요.
 * 2) `Car`와 `Motorcycle` 클래스를 작성하여 `Vehicle` 인터페이스를 구현하세요.
 * 3) `Vehicle`과 또 다른 인터페이스 `Electric`을 작성하고, `charge()` 메서드를 정의하세요.
 * 4) `ElectricCar` 클래스를 작성하여 `Vehicle`과 `Electric` 인터페이스를 모두 구현하세요.
 */