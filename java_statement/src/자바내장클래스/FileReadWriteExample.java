package 자바내장클래스;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String filePath = "example.txt";

        // 파일 쓰기
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, Java!");
            writer.newLine();
            writer.write("파일 읽고 쓰기 예제입니다.");
            System.out.println("파일 쓰기 완료.");
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 예외 발생: " + e.getMessage());
        }

        // 파일 읽기
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("파일 내용:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 중 예외 발생: " + e.getMessage());
        }
    }
}

/*
 * 이론 설명:
 * 1. 파일 읽고 쓰기:
 * - `FileReader`와 `FileWriter`는 파일을 읽고 쓰기 위한 클래스입니다.
 * - `BufferedReader`와 `BufferedWriter`는 파일 입출력을 효율적으로 처리합니다.
 * 
 * 2. 주요 메서드:
 * - `write(String text)`: 파일에 문자열 쓰기.
 * - `readLine()`: 파일에서 한 줄 읽기.
 * - `newLine()`: 새 줄 추가.
 */