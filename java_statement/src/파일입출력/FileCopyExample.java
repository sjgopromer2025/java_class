package 파일입출력;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {
    public static void main(String[] args) {
        String sourcePath = "source.txt"; // 원본 파일 경로
        String destinationPath = "destination.txt"; // 복사본 파일 경로

        try (
                FileInputStream inputStream = new FileInputStream(sourcePath);
                FileOutputStream outputStream = new FileOutputStream(destinationPath)) {
            int data;
            while ((data = inputStream.read()) != -1) { // 원본 파일에서 한 바이트씩 읽기
                outputStream.write(data); // 복사본 파일에 한 바이트씩 쓰기
            }
            System.out.println("파일 복사 완료.");
        } catch (IOException e) {
            System.out.println("파일 복사 중 예외 발생: " + e.getMessage());
        }
    }
}

/*
 * 이론 설명:
 * 1. 파일 복사:
 * - `FileInputStream`과 `FileOutputStream`을 사용하여 파일을 복사할 수 있습니다.
 * - 원본 파일에서 데이터를 읽어 복사본 파일에 씁니다.
 * 
 * 2. 주요 메서드:
 * - `read()`: 원본 파일에서 한 바이트를 읽어 반환.
 * - `write(int b)`: 복사본 파일에 한 바이트를 작성.
 * - `close()`: 파일을 닫아 리소스를 해제.
 * 
 * 3. 사용 사례:
 * - 파일 백업, 데이터 이동 등 파일 복사가 필요한 작업에 사용.
 */