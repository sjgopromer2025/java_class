package 자바내장클래스;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 생성
        HashSet<String> set = new HashSet<>();

        // 요소 추가
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // 중복 요소 추가 시 무시됨

        // 요소 출력
        System.out.println("HashSet: " + set);

        // 특정 요소 포함 여부 확인
        System.out.println("Python 포함 여부: " + set.contains("Python"));

        // 요소 제거
        set.remove("Python");
        System.out.println("Python 제거 후: " + set);
    }
}

/*
 * 이론 설명:
 * 1. `HashSet` 클래스:
 * - 중복을 허용하지 않는 집합(Set)을 구현한 클래스.
 * - 요소의 순서를 보장하지 않습니다.
 * 
 * 2. 주요 메서드:
 * - `add()`: 요소 추가.
 * - `remove()`: 요소 제거.
 * - `contains()`: 특정 요소 포함 여부 확인.
 */