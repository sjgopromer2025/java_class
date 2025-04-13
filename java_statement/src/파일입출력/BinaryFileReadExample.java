package 파일입출력;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReadExample {
    public static void main(String[] args) {
        String filePath = "example.bin"; // 읽을 바이너리 파일 경로

        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            int data;
            System.out.println("바이너리 파일 내용:");
            while ((data = inputStream.read()) != -1) { // 한 바이트씩 읽기
                System.out.print((char) data); // 바이트 데이터를 문자로 변환하여 출력
            }
        } catch (IOException e) {
            System.out.println("바이너리 파일 읽기 중 예외 발생: " + e.getMessage());
        }
    }
}

/*
 * 이론 설명:
 * 1. 바이너리 파일 읽기:
 * - `FileInputStream`을 사용하여 바이너리 데이터를 읽을 수 있습니다.
 * - 파일의 내용을 바이트 단위로 읽어 처리합니다.
 * 
 * 2. 주요 메서드:
 * - `read()`: 파일에서 한 바이트를 읽어 반환. 파일 끝에 도달하면 -1 반환.
 * - `close()`: 파일을 닫아 리소스를 해제.
 * 
 * 3. 사용 사례:
 * - 이미지, 오디오, 비디오 파일 등 바이너리 데이터를 읽어 처리할 때 사용.
 */