package 자바내장클래스;

public class StringExample {
    public static void main(String[] args) {
        // 문자열 생성
        String str = "Hello, Java!";
        System.out.println("문자열: " + str);

        // 문자열 길이
        System.out.println("문자열 길이: " + str.length());

        // 특정 문자 추출
        System.out.println("5번째 문자: " + str.charAt(4));

        // 문자열 비교
        System.out.println("문자열 비교: " + str.equals("Hello, Java!"));

        // 문자열 대소문자 변환
        System.out.println("대문자로 변환: " + str.toUpperCase());
        System.out.println("소문자로 변환: " + str.toLowerCase());

        // 문자열 자르기
        System.out.println("부분 문자열: " + str.substring(7));

        // 문자열 포함 여부
        System.out.println("Java 포함 여부: " + str.contains("Java"));
    }
}

/*
 * 이론 설명:
 * 1. `String` 클래스:
 * - 문자열을 다루기 위한 불변(Immutable) 클래스.
 * - 문자열이 생성되면 변경할 수 없습니다.
 * - 문자열 조작 시 새로운 문자열 객체가 생성됩니다.
 * 
 * 2. 주요 메서드:
 * - `length()`: 문자열의 길이를 반환.
 * - `charAt(index)`: 특정 인덱스의 문자를 반환.
 * - `equals()`: 문자열 비교.
 * - `toUpperCase()`, `toLowerCase()`: 대소문자 변환.
 * - `substring(start, end)`: 부분 문자열 반환.
 * - `contains()`: 특정 문자열 포함 여부 확인.
 */