package 파일입출력;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String filePath = "output.txt"; // 작성할 파일 경로

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, Java!");
            writer.newLine(); // 줄바꿈
            writer.write("파일 입출력 예제입니다.");
            System.out.println("파일 쓰기 완료.");
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 예외 발생: " + e.getMessage());
        }
    }
}

/*
 * 이론 설명:
 * 1. 텍스트 파일 쓰기:
 * - `FileWriter`와 `BufferedWriter`를 사용하여 텍스트 파일에 데이터를 쓸 수 있습니다.
 * - `BufferedWriter`는 버퍼를 사용하여 파일 쓰기 작업을 효율적으로 처리합니다.
 * 
 * 2. 주요 메서드:
 * - `write(String text)`: 파일에 문자열을 작성.
 * - `newLine()`: 줄바꿈 추가.
 * - `close()`: 파일을 닫아 리소스를 해제.
 * 
 * 3. 사용 사례:
 * - 텍스트 데이터를 파일에 저장하거나, 로그 파일을 작성할 때 사용.
 */