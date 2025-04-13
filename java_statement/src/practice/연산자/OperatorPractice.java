
package practice.연산자;

import java.util.Scanner;

public class OperatorPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 산술 연산자 실습
        // 사용자로부터 두 개의 숫자를 입력받아 산술 연산을 수행합니다.
        System.out.println("두 개의 숫자를 입력하세요:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("\n[산술 연산자 결과]");
        System.out.println("덧셈: " + (num1 + num2));
        System.out.println("뺄셈: " + (num1 - num2));
        System.out.println("곱셈: " + (num1 * num2));
        System.out.println("나눗셈 (몫): " + (num1 / num2));
        System.out.println("나머지: " + (num1 % num2));

        // 2. 비교 연산자 실습
        // 두 숫자를 비교하여 결과를 출력합니다.
        System.out.println("\n[비교 연산자 결과]");
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));

        // 3. 논리 연산자 실습
        // 두 논리값을 입력받아 논리 연산을 수행합니다.
        System.out.println("\ntrue 또는 false 값을 두 번 입력하세요:");
        boolean bool1 = scanner.nextBoolean();
        boolean bool2 = scanner.nextBoolean();

        System.out.println("\n[논리 연산자 결과]");
        System.out.println("bool1 && bool2: " + (bool1 && bool2)); // 논리 AND
        System.out.println("bool1 || bool2: " + (bool1 || bool2)); // 논리 OR
        System.out.println("!bool1: " + (!bool1)); // 논리 NOT

        // 4. 삼항 연산자 실습
        // 두 숫자 중 더 큰 값을 삼항 연산자를 사용하여 출력합니다.
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("\n[삼항 연산자 결과]");
        System.out.println("더 큰 값: " + max);

        // 5. 대입 연산자 실습
        // 숫자에 대입 연산자를 사용하여 값을 변경합니다.
        System.out.println("\n[대입 연산자 결과]");
        int result = num1;
        result += num2; // result = result + num2
        System.out.println("result += num2: " + result);
        result -= num2; // result = result - num2
        System.out.println("result -= num2: " + result);
        result *= num2; // result = result * num2
        System.out.println("result *= num2: " + result);
        result /= num2; // result = result / num2
        System.out.println("result /= num2: " + result);
        result %= num2; // result = result % num2
        System.out.println("result %= num2: " + result);
        scanner.close();
    }
}