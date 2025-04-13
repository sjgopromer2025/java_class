package 자바내장클래스;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList 생성
        ArrayList<String> list = new ArrayList<>();

        // 요소 추가
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // 요소 출력
        System.out.println("리스트: " + list);

        // 요소 제거
        list.remove("Python");
        System.out.println("Python 제거 후: " + list);

        // 특정 요소 확인
        System.out.println("Java 포함 여부: " + list.contains("Java"));
    }
}

/*
 * 이론 설명:
 * 1. `ArrayList` 클래스:
 * - 동적 배열을 구현한 클래스.
 * - 크기가 자동으로 조정되며, 요소를 추가하거나 제거할 수 있습니다.
 * 
 * 2. 주요 메서드:
 * - `add()`: 요소 추가.
 * - `remove()`: 요소 제거.
 * - `contains()`: 특정 요소 포함 여부 확인.
 * - `size()`: 리스트 크기 반환.
 */