package 자바내장클래스;

public class StringBuilderExample {
    public static void main(String[] args) {
        // StringBuilder 생성
        StringBuilder sb = new StringBuilder("Hello");

        // 문자열 추가
        sb.append(", Java!");
        System.out.println("문자열 추가: " + sb);

        // 문자열 삽입
        sb.insert(5, " World");
        System.out.println("문자열 삽입: " + sb);

        // 문자열 삭제
        sb.delete(5, 11);
        System.out.println("문자열 삭제: " + sb);

        // 문자열 반전
        sb.reverse();
        System.out.println("문자열 반전: " + sb);
    }
}

/*
 * 이론 설명:
 * 1. `StringBuilder` 클래스:
 * - 가변(Mutable) 문자열을 다루기 위한 클래스.
 * - 문자열 조작 시 새로운 객체를 생성하지 않고, 기존 객체를 수정.
 * 
 * 2. 주요 메서드:
 * - `append()`: 문자열 추가.
 * - `insert()`: 특정 위치에 문자열 삽입.
 * - `delete()`: 특정 범위의 문자열 삭제.
 * - `reverse()`: 문자열 반전.
 */