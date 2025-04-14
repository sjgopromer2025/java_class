package 파일입출력;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        // String filePath = "./src/파일입출력/example.txt"; // 읽을 파일 경로
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
 * - 텍스트 파일 읽기는 파일에 저장된 데이터를 프로그램으로 가져오는 작업입니다.
 * - 자바에서는 `FileReader`와 `BufferedReader`를 사용하여 텍스트 파일을 읽을 수 있습니다.
 * - `BufferedReader`는 버퍼를 사용하여 파일을 효율적으로 읽습니다.
 * 
 * 2. 주요 클래스:
 * - `FileReader`:
 * - 파일에서 문자 데이터를 읽기 위한 클래스입니다.
 * - 파일의 경로를 지정하여 파일을 열고, 데이터를 읽습니다.
 * - 단독으로 사용하면 비효율적일 수 있으므로, 보통 `BufferedReader`와 함께 사용됩니다.
 * 
 * - `BufferedReader`:
 * - 파일을 효율적으로 읽기 위해 버퍼를 사용하는 클래스입니다.
 * - `FileReader`와 함께 사용하여 파일에서 데이터를 한 줄씩 읽을 수 있습니다.
 * - 대량의 데이터를 처리할 때 성능을 향상시킵니다.
 * 
 * 3. 주요 메서드:
 * - `readLine()`:
 * - 파일에서 한 줄씩 읽어 문자열로 반환합니다.
 * - 파일 끝에 도달하면 `null`을 반환합니다.
 * 
 * - `close()`:
 * - 파일을 닫아 리소스를 해제합니다.
 * - 파일을 닫지 않으면 리소스 누수가 발생할 수 있으므로, 항상 닫아야 합니다.
 * - `try-with-resources` 구문을 사용하면 자동으로 파일을 닫을 수 있습니다.
 * 
 * 4. 사용 사례:
 * - 텍스트 파일에서 데이터를 읽어와 화면에 출력하거나, 데이터를 처리할 때 사용.
 * - 예:
 * - 로그 파일 분석.
 * - 설정 파일 읽기.
 * - 데이터 파일에서 정보를 읽어와 처리.
 * 
 * 5. 주의사항:
 * - 파일 경로:
 * - 파일 경로를 정확히 지정해야 합니다. 상대 경로와 절대 경로를 사용할 수 있습니다.
 * - 예: `./src/파일입출력/example.txt` (상대 경로), `C:/example.txt` (절대 경로).
 * 
 * - 예외 처리:
 * - 파일이 존재하지 않거나 읽기 권한이 없으면 `IOException`이 발생합니다.
 * - 항상 예외를 처리하여 프로그램이 비정상 종료되지 않도록 해야 합니다.
 * 
 * - 인코딩:
 * - 파일의 인코딩 형식(예: UTF-8, ISO-8859-1)을 확인해야 합니다.
 * - 잘못된 인코딩으로 파일을 읽으면 데이터가 깨질 수 있습니다.
 * 
 * 6. 확장:
 * - 파일에서 데이터를 읽어와 특정 패턴을 검색하거나, 데이터를 변환하여 저장하는 프로그램을 작성할 수 있습니다.
 * - 대량의 데이터를 처리할 때는 `BufferedReader` 외에도 `Files` 클래스의 `lines()` 메서드를 사용할 수
 * 있습니다.
 */