package 파일입출력;

import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriteExample {
    public static void main(String[] args) {
        String filePath = "output.bin"; // 작성할 바이너리 파일 경로

        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            String data = "Hello, Binary World!";
            outputStream.write(data.getBytes()); // 문자열을 바이트 배열로 변환하여 쓰기
            System.out.println("바이너리 파일 쓰기 완료.");
        } catch (IOException e) {
            System.out.println("바이너리 파일 쓰기 중 예외 발생: " + e.getMessage());
        }
    }
}

/*
 * 이론 설명:
 * 1. 바이너리 파일 쓰기:
 * - `FileOutputStream`을 사용하여 바이너리 데이터를 파일에 쓸 수 있습니다.
 * - 데이터를 바이트 단위로 처리합니다.
 * 
 * 2. 주요 메서드:
 * - `write(byte[] b)`: 바이트 배열 데이터를 파일에 작성.
 * - `close()`: 파일을 닫아 리소스를 해제.
 * 
 * 3. 사용 사례:
 * - 이미지, 오디오, 비디오 파일 등 바이너리 데이터를 파일에 저장할 때 사용.
 */