package three;

public class BinaryOperators {
    public static void main(String[] args) {
        // 이항 연산자 예제

        // 1. 산술 연산자 (Arithmetic Operators)
        int a = 15;
        int b = 5;

        System.out.println("산술 연산자:");
        System.out.println("a + b = " + (a + b)); // 덧셈
        System.out.println("a - b = " + (a - b)); // 뺄셈
        System.out.println("a * b = " + (a * b)); // 곱셈
        System.out.println("a / b = " + (a / b)); // 나눗셈 (몫)
        System.out.println("a % b = " + (a % b)); // 나머지

        // 2. 비교 연산자 (Comparison Operators)
        System.out.println("\n비교 연산자:");
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a < b: " + (a < b)); // false
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a <= b: " + (a <= b)); // false
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true

        // 3. 논리 연산자 (Logical Operators)
        boolean x = true;
        boolean y = false;

        System.out.println("\n논리 연산자:");
        System.out.println("x && y: " + (x && y)); // 논리 AND (false)
        System.out.println("x || y: " + (x || y)); // 논리 OR (true)
        System.out.println("!x: " + (!x)); // 논리 NOT (false)

        // 4. 대입 연산자 (Assignment Operators)
        int c = 10;
        System.out.println("\n대입 연산자:");
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c); // 15
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c); // 12
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c); // 24
        c /= 4; // c = c / 4
        System.out.println("c /= 4: " + c); // 6
        c %= 2; // c = c % 2
        System.out.println("c %= 2: " + c); // 0
    }
}