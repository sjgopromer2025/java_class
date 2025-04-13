package practice.seven;

// 부모 클래스
class Animal {
    protected String name; // protected 접근 제한자: 자식 클래스에서 접근 가능

    // 부모 생성자
    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "이(가) 먹고 있습니다.");
    }

    public final void sleep() { // final 메서드: 재정의 불가
        System.out.println(name + "이(가) 잠을 잡니다.");
    }
}

// 자식 클래스 1
class Dog extends Animal {
    public Dog(String name) {
        super(name); // 부모 생성자 호출
    }

    @Override
    public void eat() { // 메서드 재정의
        System.out.println(name + "이(가) 사료를 먹고 있습니다.");
    }

    public void bark() {
        System.out.println(name + "이(가) 멍멍 짖습니다.");
    }
}

// 자식 클래스 2
class Cat extends Animal {
    public Cat(String name) {
        super(name); // 부모 생성자 호출
    }

    @Override
    public void eat() { // 메서드 재정의
        System.out.println(name + "이(가) 생선을 먹고 있습니다.");
    }

    public void purr() {
        System.out.println(name + "이(가) 골골 소리를 냅니다.");
    }
}

// Final 클래스: 상속 불가
final class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + "이(가) 씨앗을 먹고 있습니다.");
    }

    public void fly() {
        System.out.println(name + "이(가) 하늘을 날고 있습니다.");
    }
}

// 추상 클래스
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract void draw(); // 추상 메서드

    public void displayColor() {
        System.out.println("이 도형의 색상은 " + color + "입니다.");
    }
}

// 추상 클래스 구현 1
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("원을 그립니다. 반지름: " + radius);
    }
}

// 추상 클래스 구현 2
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그립니다. 너비: " + width + ", 높이: " + height);
    }
}

public class InheritancePractice2 {
    public static void main(String[] args) {
        // 1. 클래스 상속 및 부모 생성자 호출
        Dog dog = new Dog("바둑이");
        dog.eat();
        dog.bark();
        dog.sleep();

        System.out.println();

        Cat cat = new Cat("나비");
        cat.eat();
        cat.purr();
        cat.sleep();

        System.out.println();

        Bird bird = new Bird("참새");
        bird.eat();
        bird.fly();
        bird.sleep();

        System.out.println();

        // 2. 추상 클래스와 다형성
        Shape circle = new Circle("빨간색", 5.0);
        Shape rectangle = new Rectangle("파란색", 4.0, 6.0);

        circle.displayColor();
        circle.draw();

        System.out.println();

        rectangle.displayColor();
        rectangle.draw();

        System.out.println();

        // 3. 타입 변환과 다형성
        Animal[] animals = { new Dog("진돗개"), new Cat("코숏"), new Bird("앵무새") };

        for (Animal animal : animals) {
            animal.eat(); // 다형성: 각 클래스의 재정의된 메서드 호출

            if (animal instanceof Dog) {
                ((Dog) animal).bark();
            } else if (animal instanceof Cat) {
                ((Cat) animal).purr();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
        }
    }
}

/*
 * 문제 내용:
 * 1. 클래스 상속 및 부모 생성자 호출:
 * - 부모 클래스 `Animal`을 작성하고, `Dog`, `Cat`, `Bird` 클래스를 상속받으세요.
 * - `Animal` 클래스에 `eat()` 메서드를 작성하고, 자식 클래스에서 재정의하세요.
 * - `Animal` 클래스에 `final` 메서드 `sleep()`을 작성하여 재정의할 수 없도록 하세요.
 * - `Bird` 클래스를 `final`로 선언하여 상속할 수 없도록 하세요.
 * 
 * 2. 추상 클래스와 다형성:
 * - 추상 클래스 `Shape`를 작성하고, `draw()` 추상 메서드를 선언하세요.
 * - `Circle`과 `Rectangle` 클래스를 작성하여 `Shape`를 상속받고, `draw()` 메서드를 구현하세요.
 * - `Shape` 타입의 배열을 사용하여 여러 도형 객체를 다형적으로 처리하세요.
 * 
 * 3. 타입 변환과 다형성:
 * - `Animal` 타입의 배열을 생성하고, `Dog`, `Cat`, `Bird` 객체를 저장하세요.
 * - 반복문을 사용하여 각 객체의 `eat()` 메서드를 호출하고, 다운캐스팅을 통해 고유 메서드를 호출하세요.
 * 
 * 4. 실습 목표:
 * - 상속, 부모 생성자 호출, 메서드 재정의, `final` 클래스와 메서드, `protected` 접근 제한자, 추상 클래스, 다형성을
 * 활용하여 객체 지향 프로그래밍의 개념을 이해하세요.
 * - 각 클래스의 공통 동작과 고유 동작을 구분하여 설계하세요.
 */