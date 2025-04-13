package 콘솔입출력;

import java.util.Scanner;

public class MultiLineInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        System.out.println("여러 줄의 텍스트를 입력하세요. 입력을 종료하려면 'exit'를 입력하세요:");

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) { // 'exit' 입력 시 종료
                break;
            }
            input.append(line).append("\n");
        }

        System.out.println("입력된 텍스트:");
        System.out.println(input.toString());
        scanner.close();
    }
}

/*
 * 이론 설명:
 * 1. 여러 줄 입력:
 * - `Scanner`의 `nextLine()` 메서드를 반복적으로 호출하여 여러 줄의 입력을 처리할 수 있습니다.
 * 
 * 2. 주요 메서드:
 * - `nextLine()`: 한 줄의 입력을 읽어 문자열로 반환.
 * - `append(String s)`: 문자열을 `StringBuilder`에 추가.
 * 
 * 3. 사용 사례:
 * - 사용자로부터 여러 줄의 텍스트를 입력받아 처리할 때 사용.
 */