package practice.조건문과반복문;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문제 1: for 문을 사용하여 1부터 10까지의 합을 구하세요.
        System.out.println("[문제 1] for 문을 사용하여 1부터 10까지의 합을 구하세요.");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i; // i 값을 sum에 더함
        }
        System.out.println("1부터 10까지의 합: " + sum);

        // 문제 2: while 문을 사용하여 사용자가 입력한 숫자가 0이 될 때까지 숫자를 더하세요.
        System.out.println("\n[문제 2] while 문을 사용하여 숫자를 입력받아 0이 될 때까지 합을 구하세요.");
        int total = 0;
        int input;
        System.out.println("숫자를 입력하세요 (0을 입력하면 종료):");
        while ((input = scanner.nextInt()) != 0) {
            total += input; // 입력받은 값을 total에 더함
        }
        System.out.println("입력한 숫자의 합: " + total);

        // 문제 3: do-while 문을 사용하여 최소 한 번은 실행되도록 숫자를 입력받고, 입력한 숫자를 출력하세요.
        System.out.println("\n[문제 3] do-while 문을 사용하여 숫자를 입력받고 출력하세요.");
        int number;
        do {
            System.out.println("숫자를 입력하세요 (0을 입력하면 종료):");
            number = scanner.nextInt();
            if (number != 0) {
                System.out.println("입력한 숫자: " + number);
            }
        } while (number != 0);

        // 문제 4: 중첩 반복문을 사용하여 구구단을 출력하세요.
        System.out.println("\n[문제 4] 중첩 반복문을 사용하여 구구단을 출력하세요.");
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단:");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // 단 사이에 빈 줄 추가
        }

        scanner.close();
    }
}

// 문제 1: for 문을 사용하여 1부터 10까지의 합을 구하세요.
// - 1부터 10까지의 숫자를 더한 결과를 출력합니다.
// - 출력 예시: "1부터 10까지의 합: 55"

// 문제 2: while 문을 사용하여 사용자가 입력한 숫자가 0이 될 때까지 숫자를 더하세요.
// - 사용자가 입력한 숫자를 계속 더합니다.
// - 사용자가 0을 입력하면 반복을 종료하고 합계를 출력합니다.
// - 출력 예시:
// 숫자를 입력하세요 (0을 입력하면 종료):
// 5
// 10
// 0
// 입력한 숫자의 합: 15

// 문제 3: do-while 문을 사용하여 최소 한 번은 실행되도록 숫자를 입력받고, 입력한 숫자를 출력하세요.
// - 사용자가 입력한 숫자를 출력합니다.
// - 사용자가 0을 입력하면 반복을 종료합니다.
// - 출력 예시:
// 숫자를 입력하세요 (0을 입력하면 종료):
// 7
// 입력한 숫자: 7
// 숫자를 입력하세요 (0을 입력하면 종료):
// 0

// 문제 4: 중첩 반복문을 사용하여 구구단을 출력하세요.
// - 2단부터 9단까지의 구구단을 출력합니다.
// - 출력 예시:
// 2단:
// 2 x 1 = 2
// 2 x 2 = 4
// ...
// 9단:
// 9 x 1 = 9
// 9 x 2 = 18
// ...
