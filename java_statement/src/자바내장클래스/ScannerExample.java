package 자바내장클래스;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.println("이름: " + name + ", 나이: " + age);

        scanner.close();
    }
}

/*
 * 이론 설명:
 * 1. `Scanner` 클래스:
 * - 사용자 입력을 처리하기 위한 클래스.
 * - 콘솔에서 입력을 읽을 수 있습니다.
 * 
 * 2. 주요 메서드:
 * - `nextLine()`: 문자열 입력.
 * - `nextInt()`: 정수 입력.
 * - `close()`: 스캐너 닫기.
 */