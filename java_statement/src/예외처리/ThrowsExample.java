package 예외처리;

import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) throws IOException {
        readFile();
    }

    public static void readFile() throws IOException {
        {
            throw new IOException("파일을 읽을 수 없습니다.");
        }
    }

    // 예외 다중 처리
    // public static void readFile() throws IOException, SQLException {
    // {
    // throw new IOException("파일을 읽을 수 없습니다.");
    // }
    // }
}
/*
 * 이론 설명:
 * 1. 예외 떠넘기기(throws):
 * - 메서드에서 발생할 수 있는 예외를 호출한 곳으로 떠넘깁니다.
 * - `throws` 키워드를 사용하여 메서드 선언부에 예외를 명시합니다.
 * 
 * 2. 사용 목적:
 * - 예외를 직접 처리하지 않고, 호출한 메서드에서 처리하도록 위임합니다.
 */