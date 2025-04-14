// 문제 1: 텍스트 파일 읽기
// - `input.txt` 파일에서 데이터를 읽어와 각 줄의 단어 수를 계산하세요.
// - 각 줄의 단어 수를 출력하고, 전체 단어 수를 계산하여 출력하세요.

// 문제 2: 텍스트 파일 쓰기
// - `output.txt` 파일에 각 줄의 단어 수와 전체 단어 수를 저장하세요.
// - 파일에 저장할 내용 예시:
// Line 1: 5 words
// Line 2: 3 words
// Total: 8 words

package practice.파일입출력;

import java.io.*;

public class TextFileProcessingPractice {
    public static void main(String[] args) {
        String inputFilePath = "./src/practice/파일입출력/input.txt"; // 읽을 파일 경로
        String outputFilePath = "./src/practice/파일입출력/output.txt"; // 결과를 저장할 파일 경로

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            int totalWordCount = 0;
            int lineNumber = 1;

            // 파일 읽기 및 단어 수 계산
            while ((line = reader.readLine()) != null) {
                int wordCount = line.split("\\s+").length; // 공백으로 단어 분리
                totalWordCount += wordCount;

                // 각 줄의 단어 수 출력
                System.out.println("Line " + lineNumber + ": " + wordCount + " words");

                // 결과를 파일에 쓰기
                writer.write("Line " + lineNumber + ": " + wordCount + " words");
                writer.newLine();

                lineNumber++;
            }

            // 전체 단어 수 출력 및 파일 저장
            System.out.println("Total: " + totalWordCount + " words");
            writer.write("Total: " + totalWordCount + " words");

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: " + inputFilePath);
        } catch (IOException e) {
            System.out.println("파일 처리 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}