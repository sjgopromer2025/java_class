package 자바내장클래스;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        // 키-값 추가
        map.put("Java", 90);
        map.put("Python", 85);
        map.put("C++", 80);

        // 값 출력
        System.out.println("HashMap: " + map);

        // 특정 키의 값 가져오기
        System.out.println("Java 점수: " + map.get("Java"));

        // 키-값 제거
        map.remove("Python");
        System.out.println("Python 제거 후: " + map);
    }
}

/*
 * 이론 설명:
 * 1. `HashMap` 클래스:
 * - 키-값 쌍으로 데이터를 저장하는 컬렉션 클래스.
 * - 키는 고유하며, 값은 중복될 수 있습니다.
 * 
 * 2. 주요 메서드:
 * - `put(key, value)`: 키-값 추가.
 * - `get(key)`: 특정 키의 값 반환.
 * - `remove(key)`: 특정 키-값 제거.
 * - `containsKey(key)`: 특정 키 포함 여부 확인.
 */