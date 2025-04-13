package 자바내장클래스;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet 생성
        TreeSet<Integer> set = new TreeSet<>();

        // 요소 추가
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(15);

        // 요소 출력 (정렬된 상태)
        System.out.println("TreeSet: " + set);

        // 첫 번째 요소와 마지막 요소 가져오기
        System.out.println("첫 번째 요소: " + set.first());
        System.out.println("마지막 요소: " + set.last());
    }
}

/*
 * 이론 설명:
 * 1. `TreeSet` 클래스:
 * - 정렬된 집합(Set)을 구현한 클래스.
 * - 요소는 자동으로 정렬됩니다.
 * 
 * 2. 주요 메서드:
 * - `first()`: 첫 번째 요소 반환.
 * - `last()`: 마지막 요소 반환.
 * - `add()`: 요소 추가.
 */