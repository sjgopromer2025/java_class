package 조건문과반복문;

import java.util.Scanner;

public class ConditionalStatementsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요:");
        int number = scanner.nextInt();

        // 1. if 문
        if (number > 0) {
            System.out.println("입력한 숫자는 양수입니다.");
        }

        // 2. if-else 문
        if (number % 2 == 0) {
            System.out.println("입력한 숫자는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자는 홀수입니다.");
        }

        // 3. if-else if-else 문
        if (number > 0) {
            System.out.println("입력한 숫자는 양수입니다.");
        } else if (number < 0) {
            System.out.println("입력한 숫자는 음수입니다.");
        } else {
            System.out.println("입력한 숫자는 0입니다.");
        }

        // 4. if 문을 중첩하여 사용
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("입력한 숫자는 양수이고 짝수입니다.");
            }
        }

        // 4. switch 문
        System.out.println("\n요일 번호를 입력하세요 (1~7):");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }

        scanner.close();
    }
}