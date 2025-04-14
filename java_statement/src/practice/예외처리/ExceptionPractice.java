/*
* 문제 내용:
* 1. 사용자로부터 두 개의 정수를 입력받아 나눗셈 결과를 출력하는 프로그램을 작성하세요.
* - 단, 다음과 같은 예외 상황을 처리해야 합니다:
* a) 0으로 나누는 경우: "0으로 나눌 수 없습니다!" 메시지를 출력하세요.
* b) 숫자가 아닌 값을 입력한 경우: "유효한 숫자를 입력하세요!" 메시지를 출력하세요.
* 
* 2. 추가 문제:
* - 나눗셈 결과가 소수점 이하로 나올 경우, 소수점 둘째 자리까지 출력하세요.
* - 예외가 발생하더라도 프로그램이 종료되지 않고 계속 실행되도록 하세요.
* 
* 3. 도전 과제:
* - 사용자 입력을 반복적으로 받아 여러 번 나눗셈을 수행할 수 있도록 프로그램을 수정하세요.
* - "exit"를 입력하면 프로그램이 종료되도록 하세요.
*/

package practice.예외처리;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 나눗셈 프로그램 ===");
        System.out.println("두 개의 숫자를 입력하세요. (종료하려면 'exit' 입력)");

        while (true) {
            try {
                // 첫 번째 숫자 입력
                System.out.print("첫 번째 숫자: ");
                String input1 = scanner.nextLine();
                if (input1.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                int num1 = Integer.parseInt(input1);

                // 두 번째 숫자 입력
                System.out.print("두 번째 숫자: ");
                String input2 = scanner.nextLine();
                if (input2.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                int num2 = Integer.parseInt(input2);

                // 나눗셈 수행
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다!");
                }
                double result = (double) num1 / num2;
                System.out.printf("결과: %.2f\n", result);

            } catch (ArithmeticException e) {
                System.out.println("오류: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("오류: 유효한 숫자를 입력하세요!");
            } catch (Exception e) {
                System.out.println("알 수 없는 오류가 발생했습니다: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
