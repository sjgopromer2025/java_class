package 상속과다형성;

// 추상 클래스
abstract class Shape {
    private String color; // 공통 속성

    // 생성자
    public Shape(String color) {
        this.color = color;
    }

    // Getter
    public String getColor() {
        return color;
    }

    // Setter
    public void setColor(String color) {
        this.color = color;
    }

    // 추상 메서드
    public abstract void draw(); // 각 도형의 그리기 방식 정의

    // 공통 메서드
    public void display() {
        System.out.println("이 도형의 색상은 " + color + "입니다.");
    }
}

// 자식 클래스 1: 원
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // 부모 클래스 생성자 호출
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("원을 그립니다. 반지름: " + radius);
    }

    public double calculateArea() {
        return Math.PI * radius * radius; // 원의 면적 계산
    }
}

// 자식 클래스 2: 사각형
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color); // 부모 클래스 생성자 호출
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그립니다. 너비: " + width + ", 높이: " + height);
    }

    public double calculateArea() {
        return width * height; // 사각형의 면적 계산
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Circle 객체 생성
        Shape circle = new Circle("빨간색", 5.0);
        circle.display();
        circle.draw();
        System.out.println("원의 면적: " + ((Circle) circle).calculateArea());

        System.out.println();

        // Rectangle 객체 생성
        Shape rectangle = new Rectangle("파란색", 4.0, 6.0);
        rectangle.display();
        rectangle.draw();
        System.out.println("사각형의 면적: " + ((Rectangle) rectangle).calculateArea());
    }
}

/*
 * 이론 설명:
 * 1. 추상 클래스(Abstract Class):
 * - 추상 클래스는 객체를 직접 생성할 수 없는 클래스입니다.
 * - 공통 속성과 메서드를 정의하며, 추상 메서드를 포함할 수 있습니다.
 * - 자식 클래스에서 추상 메서드를 반드시 구현해야 합니다.
 * 
 * 2. 추상 메서드(Abstract Method):
 * - 메서드의 선언만 있고, 구현은 자식 클래스에서 작성합니다.
 * - 예: `public abstract void draw();`
 * 
 * 3. 추상 클래스의 장점:
 * - 공통된 기능은 추상 클래스에서 정의하고, 세부적인 구현은 자식 클래스에서 작성.
 * - 코드의 재사용성과 유지보수성을 높입니다.
 * 
 * 4. 코드 설명:
 * - `Shape` 클래스는 공통 속성(`color`)과 메서드(`display`)를 정의하며, 추상 메서드 `draw`를 포함합니다.
 * - `Circle`과 `Rectangle` 클래스는 `Shape`를 상속받아 `draw` 메서드를 구현하고, 각 도형의 고유한 속성과
 * 메서드를 추가합니다.
 * - `main` 메서드에서 다형성을 활용하여 `Shape` 타입으로 객체를 참조하고, 다운캐스팅을 통해 고유 메서드를 호출합니다.
 * 
 * 5. 추가 실습:
 * 1) 새로운 도형 클래스(예: 삼각형)를 추가하고, `draw`와 면적 계산 메서드를 구현하세요.
 * 2) `Shape` 클래스에 새로운 공통 속성(예: 테두리 두께)을 추가하고, 이를 활용하세요.
 */