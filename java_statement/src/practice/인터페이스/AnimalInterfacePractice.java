package practice.인터페이스;

// 인터페이스 정의
interface Animal {
    void eat(); // 동물이 먹는 동작

    void sleep(); // 동물이 자는 동작
}

// 인터페이스 정의 (추가 기능)
interface Pet {
    void play(); // 애완동물이 노는 동작
}

// Dog 클래스: Animal과 Pet 인터페이스 구현
class Dog implements Animal, Pet {
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

// Cat 클래스: Animal과 Pet 인터페이스 구현
class Cat implements Animal, Pet {
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
public class AnimalInterfacePractice {
    public static void main(String[] args) {
        // Dog 객체 생성
        Animal dog = new Dog("바둑이");
        dog.eat();
        dog.sleep();

        if (dog instanceof Pet) {
            ((Pet) dog).play(); // Pet 인터페이스 메서드 호출
        }

        System.out.println();

        // Cat 객체 생성
        Animal cat = new Cat("나비");
        cat.eat();
        cat.sleep();

        if (cat instanceof Pet) {
            ((Pet) cat).play(); // Pet 인터페이스 메서드 호출
        }
    }
}

/*
 * 문제 내용:
 * 1. 인터페이스 정의:
 * - `Animal` 인터페이스를 작성하고, `eat()`과 `sleep()` 메서드를 선언하세요.
 * - `Pet` 인터페이스를 작성하고, `play()` 메서드를 선언하세요.
 * 
 * 2. 클래스 구현:
 * - `Dog` 클래스를 작성하여 `Animal`과 `Pet` 인터페이스를 구현하세요.
 * - `eat()`: "사료를 먹고 있습니다." 출력.
 * - `sleep()`: "잠을 잡니다." 출력.
 * - `play()`: "공놀이를 하고 있습니다." 출력.
 * - 추가 메서드 `bark()`: "멍멍 짖습니다." 출력.
 * - `Cat` 클래스를 작성하여 `Animal`과 `Pet` 인터페이스를 구현하세요.
 * - `eat()`: "생선을 먹고 있습니다." 출력.
 * - `sleep()`: "잠을 잡니다." 출력.
 * - `play()`: "레이저 포인터를 쫓고 있습니다." 출력.
 * - 추가 메서드 `purr()`: "골골 소리를 냅니다." 출력.
 * 
 * 3. 메인 클래스 작성:
 * - `Dog`와 `Cat` 객체를 생성하고, `Animal`과 `Pet` 인터페이스의 메서드를 호출하세요.
 * - 다운캐스팅을 사용하여 `bark()`와 `purr()` 메서드를 호출하세요.
 * 
 * 4. 추가 실습:
 * - 새로운 인터페이스 `WildAnimal`을 작성하고, `hunt()` 메서드를 선언하세요.
 * - `Lion` 클래스를 작성하여 `Animal`과 `WildAnimal` 인터페이스를 구현하세요.
 * - `Lion` 객체를 생성하고, 모든 메서드를 호출하세요.
 */