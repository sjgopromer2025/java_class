package 파일입출력;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        String filePath = "example.txt"; // 읽을 파일 경로

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("파일 내용:");
            while ((line = reader.readLine()) != null) { // 한 줄씩 읽기
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 중 예외 발생: " + e.getMessage());
        }
    }
}

/*
 * 이론 설명:
 * 1. 텍스트 파일 읽기:
 * - `FileReader`와 `BufferedReader`를 사용하여 텍스트 파일을 읽을 수 있습니다.
 * - `BufferedReader`는 버퍼를 사용하여 파일을 효율적으로 읽습니다.
 * 
 * 2. 주요 메서드:
 * - `readLine()`: 파일에서 한 줄씩 읽어 문자열로 반환.
 * - `close()`: 파일을 닫아 리소스를 해제.
 * 
 * 3. 사용 사례:
 * - 텍스트 파일에서 데이터를 읽어와 화면에 출력하거나, 데이터를 처리할 때 사용.
 */