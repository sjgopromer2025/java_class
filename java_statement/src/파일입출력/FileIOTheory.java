package 파일입출력;

public class FileIOTheory {
    public static void main(String[] args) {
        System.out.println("파일 입출력 이론 파일입니다. 이 파일은 실행되지 않으며, 이론 정리를 위해 작성되었습니다.");
    }
}

/*
 * 이론 설명: 파일 입출력
 * 1. 파일 입출력이란?
 * - 파일 입출력(File I/O)은 파일을 읽고 쓰는 작업을 의미합니다.
 * - 자바에서는 `java.io` 패키지와 `java.nio` 패키지를 사용하여 파일 입출력을 처리합니다.
 * 
 * 2. 주요 클래스와 메서드:
 * 1) 텍스트 파일 처리:
 * - `FileReader`와 `BufferedReader`:
 * - `readLine()`: 파일에서 한 줄씩 읽기.
 * - `close()`: 파일을 닫아 리소스를 해제.
 * - `FileWriter`와 `BufferedWriter`:
 * - `write(String text)`: 파일에 문자열 쓰기.
 * - `newLine()`: 줄바꿈 추가.
 * - `close()`: 파일을 닫아 리소스를 해제.
 * 
 * 2) 바이너리 파일 처리:
 * - `FileInputStream`:
 * - `read()`: 파일에서 한 바이트씩 읽기.
 * - `close()`: 파일을 닫아 리소스를 해제.
 * - `FileOutputStream`:
 * - `write(byte[] b)`: 바이트 배열 데이터를 파일에 쓰기.
 * - `close()`: 파일을 닫아 리소스를 해제.
 * 
 * 3) 고급 파일 처리:
 * - `Files` 클래스 (java.nio.file):
 * - `readAllBytes(Path path)`: 파일의 모든 내용을 바이트 배열로 읽기.
 * - `write(Path path, byte[] bytes)`: 파일에 바이트 배열 쓰기.
 * - `copy(Path source, Path target)`: 파일 복사.
 * - `delete(Path path)`: 파일 삭제.
 * 
 * 3. 파일 입출력의 특징:
 * - 데이터를 영구적으로 저장하거나 읽어오는 데 사용.
 * - 텍스트 파일과 바이너리 파일을 모두 처리 가능.
 * - 스트림(Stream)을 사용하여 데이터를 순차적으로 처리.
 * 
 * 4. 사용 사례:
 * - 로그 파일 작성.
 * - 데이터 파일 읽기/쓰기.
 * - 파일 복사, 이동, 삭제 등 파일 관리 작업.
 * 
 * 5. 주의사항:
 * - 파일 경로가 올바른지 확인.
 * - 파일 읽기/쓰기 작업 중 예외(`IOException`)를 처리.
 * - 리소스 누수를 방지하기 위해 `try-with-resources`를 사용하여 스트림을 닫음.
 */