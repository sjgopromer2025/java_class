package 컬렉션프레임워크;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // LinkedHashSet 생성
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // 요소 추가
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java"); // 중복 요소 추가 시 무시됨

        // 요소 출력 (입력 순서 유지)
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // 특정 요소 포함 여부 확인
        System.out.println("Python 포함 여부: " + linkedHashSet.contains("Python"));

        // 요소 제거
        linkedHashSet.remove("Python");
        System.out.println("Python 제거 후: " + linkedHashSet);

        // 모든 요소 순회
        System.out.println("LinkedHashSet 순회:");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }
    }
}

/*
 * 이론 설명:
 * 1. LinkedHashSet이란?
 * - `LinkedHashSet`은 `HashSet`과 유사하지만, 요소의 **입력 순서**를 유지하는 집합(Set)입니다.
 * - 중복을 허용하지 않으며, 요소가 추가된 순서대로 저장됩니다.
 * 
 * 2. 주요 특징:
 * - **중복 허용 안 함**: 동일한 요소를 여러 번 추가해도 한 번만 저장됩니다.
 * - **입력 순서 유지**: 요소가 추가된 순서를 유지하며 저장됩니다.
 * - **빠른 검색**: 해시 테이블을 기반으로 하여 검색 속도가 빠릅니다.
 * 
 * 3. 주요 메서드:
 * - `add(E e)`: 요소를 추가합니다. 중복된 요소는 무시됩니다.
 * - `remove(Object o)`: 특정 요소를 제거합니다.
 * - `contains(Object o)`: 특정 요소가 포함되어 있는지 확인합니다.
 * - `isEmpty()`: 집합이 비어 있는지 확인합니다.
 * - `size()`: 집합에 저장된 요소의 개수를 반환합니다.
 * 
 * 4. 사용 사례:
 * - 중복을 허용하지 않으면서, 요소의 입력 순서를 유지해야 하는 경우 사용.
 * - 예: 방문한 웹 페이지의 기록, 순서가 중요한 데이터 집합 등.
 */