package 콘솔입출력;

import java.util.Scanner;

public class ConsoleInputValidationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        while (true) {
            try {
                System.out.print("나이를 입력하세요: ");
                age = Integer.parseInt(scanner.nextLine()); // 문자열을 정수로 변환
                if (age < 0) {
                    throw new IllegalArgumentException("나이는 음수가 될 수 없습니다.");
                }
                break; // 올바른 입력이면 반복 종료
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 숫자입니다. 다시 입력하세요.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("입력된 나이: " + age + "세");
        scanner.close();
    }
}

/*
 * 이론 설명:
 * 1. 사용자 입력 예외 처리:
 * - 사용자가 잘못된 데이터를 입력했을 때 프로그램이 비정상 종료되지 않도록 처리합니다.
 * 
 * 2. 주요 예외:
 * - `NumberFormatException`: 숫자로 변환할 수 없는 문자열을 입력했을 때 발생.
 * - `IllegalArgumentException`: 잘못된 인수를 전달했을 때 발생.
 * 
 * 3. 사용 사례:
 * - 사용자 입력의 유효성을 검사하고, 잘못된 입력에 대해 적절한 메시지를 제공할 때 사용.
 */