package 클래스와객체;

public class MethodExample {
    public static void main(String[] args) {
        // 메서드의 역할 이해
        // 1. 메서드는 특정 작업을 수행하는 코드 블록입니다.
        // 2. 메서드는 재사용성을 높이고, 코드의 가독성을 향상시킵니다.

        Calculator calculator = new Calculator();




        
        System.out.println("덧셈 결과: " + calculator.add(10, 20));
        System.out.println("뺄셈 결과: " + calculator.subtract(30, 15));
        System.out.println("곱셈 결과: " + calculator.multiply(5, 6));
        System.out.println("나눗셈 결과: " + calculator.divide(40, 8));
    }
}

// Calculator 클래스 정의
class Calculator {
    // 덧셈 메서드
    public int add(int a, int b) {
        return a + b;
    }

    // 뺄셈 메서드
    public int subtract(int a, int b) {
        return a - b;
    }

    // 곱셈 메서드
    public int multiply(int a, int b) {
        return a * b;
    }

    // 나눗셈 메서드
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return a / b;
    }
}

/*
 * 이론 설명:
 * 1. 메서드(Method):
 * - 메서드는 특정 작업을 수행하는 코드 블록입니다.
 * - 메서드는 코드의 재사용성을 높이고, 유지보수를 용이하게 합니다.
 * 
 * 2. 메서드의 구성 요소:
 * - 반환 타입: 메서드가 반환하는 값의 데이터 타입.
 * - 메서드 이름: 메서드를 호출할 때 사용하는 이름.
 * - 매개변수: 메서드에 전달되는 입력값.
 * - 메서드 본문: 메서드가 수행할 작업을 정의하는 코드 블록.
 */