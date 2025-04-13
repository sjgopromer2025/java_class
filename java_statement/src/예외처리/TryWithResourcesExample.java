package 예외처리;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        // try-with-resources를 사용하여 파일 읽기
        try (
                // 리소스 1: FileReader - 파일을 읽기 위한 클래스
                FileReader fr = new FileReader("example.txt");

                // 리소스 2: BufferedReader - 파일 내용을 효율적으로 읽기 위한 클래스
                BufferedReader br = new BufferedReader(fr)) {
            // 파일의 첫 번째 줄 출력
            System.out.println(br.readLine());
        } catch (IOException e) {
            // 파일 읽기 중 발생한 예외 처리
            System.out.println("파일 읽기 중 예외 발생: " + e.getMessage());
        }
    }
}

/*
 * 이론 설명:
 * 1. 자동 리소스 닫기(Try-with-resources):
 * - `try` 블록에서 사용한 리소스를 자동으로 닫아주는 기능.
 * - `AutoCloseable` 인터페이스를 구현한 리소스만 사용 가능.
 * 
 * 2. 사용된 리소스:
 * - `FileReader`: 파일을 읽기 위한 클래스. 파일의 내용을 바이트 단위로 읽습니다.
 * - `BufferedReader`: 파일 내용을 효율적으로 읽기 위한 클래스. 버퍼를 사용하여 데이터를 줄 단위로 읽습니다.
 * 
 * 3. 장점:
 * - 리소스를 명시적으로 닫을 필요가 없어 코드가 간결해집니다.
 * - 리소스를 닫지 않아 발생하는 자원 누수를 방지합니다.
 * 
 * 4. 예외 처리:
 * - `IOException`은 파일 읽기/쓰기 작업 중 발생할 수 있는 예외입니다.
 * - `catch` 블록에서 예외를 처리하여 프로그램이 비정상 종료되지 않도록 합니다.
 */