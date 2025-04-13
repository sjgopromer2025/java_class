package 콘솔입출력;

import java.io.Console;

public class PasswordInputExample {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("콘솔을 사용할 수 없습니다.");
            return;
        }

        // 비밀번호 입력
        char[] password = console.readPassword("비밀번호를 입력하세요: ");
        System.out.println("입력된 비밀번호 길이: " + password.length);

        // 비밀번호 배열 초기화 (보안 목적)
        java.util.Arrays.fill(password, ' ');
    }
}

/*
 * 이론 설명:
 * 1. 비밀번호 입력:
 * - `Console` 클래스의 `readPassword()` 메서드를 사용하여 비밀번호를 입력받을 수 있습니다.
 * - 입력된 비밀번호는 화면에 표시되지 않습니다.
 * 
 * 2. 주요 메서드:
 * - `readPassword(String fmt, Object... args)`: 비밀번호를 입력받아 `char[]`로 반환.
 * 
 * 3. 사용 사례:
 * - 보안이 필요한 입력(예: 비밀번호, PIN 코드)을 처리할 때 사용.
 */