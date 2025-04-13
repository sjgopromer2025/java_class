package 콘솔입출력;

import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        // 정수 입력
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        // 실수 입력
        System.out.print("키를 입력하세요(cm): ");
        double height = scanner.nextDouble();

        System.out.println("안녕하세요, " + name + "님!");
        System.out.println("나이: " + age + "세, 키: " + height + "cm");

        scanner.close();
    }
}

/*
 * 이론 설명:
 * 1. 콘솔 입력:
 * - `Scanner` 클래스를 사용하여 콘솔에서 사용자 입력을 처리할 수 있습니다.
 * 
 * 2. 주요 메서드:
 * - `nextLine()`: 문자열 입력.
 * - `nextInt()`: 정수 입력.
 * - `nextDouble()`: 실수 입력.
 * - `close()`: 스캐너를 닫아 리소스를 해제.
 * 
 * 3. 사용 사례:
 * - 사용자로부터 데이터를 입력받아 처리할 때 사용.
 */