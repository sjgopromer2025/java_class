package 자바내장클래스;

public class StringProcessingExample {
    public static void main(String[] args) {
        String text = "Hello, Java! Welcome to the world of programming.";

        // 문자열 분리
        String[] words = text.split(" ");
        System.out.println("단어 목록:");
        for (String word : words) {
            System.out.println(word);
        }

        // 문자열 치환
        String replacedText = text.replace("Java", "Python");
        System.out.println("치환된 문자열: " + replacedText);

        // 문자열 시작/끝 확인
        System.out.println("문자열이 'Hello'로 시작하는가? " + text.startsWith("Hello"));
        System.out.println("문자열이 'programming.'으로 끝나는가? " + text.endsWith("programming."));
    }
}

/*
 * 이론 설명:
 * 1. 문자열 처리:
 * - 자바의 `String` 클래스는 문자열을 처리하기 위한 다양한 메서드를 제공합니다.
 * 
 * 2. 주요 메서드:
 * - `split(String regex)`: 문자열을 특정 구분자로 분리하여 배열로 반환.
 * - `replace(CharSequence target, CharSequence replacement)`: 특정 문자열을 다른 문자열로
 * 치환.
 * - `startsWith(String prefix)`: 문자열이 특정 접두사로 시작하는지 확인.
 * - `endsWith(String suffix)`: 문자열이 특정 접미사로 끝나는지 확인.
 */