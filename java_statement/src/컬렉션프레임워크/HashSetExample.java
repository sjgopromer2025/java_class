package 컬렉션프레임워크;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 생성
        HashSet<String> hashSet = new HashSet<>();

        // 요소 추가
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("Java"); // 중복 요소 추가 시 무시됨

        // 요소 출력 (순서 보장 안 됨)
        System.out.println("HashSet: " + hashSet);

        // 특정 요소 포함 여부 확인
        System.out.println("Python 포함 여부: " + hashSet.contains("Python"));

        // 요소 제거
        hashSet.remove("Python");
        System.out.println("Python 제거 후: " + hashSet);

        // 모든 요소 순회
        System.out.println("HashSet 순회:");
        for (String element : hashSet) {
            System.out.println(element);
        }
    }
}

/*
 * 이론 설명:
 * 1. HashSet이란?
 * - `HashSet`은 중복을 허용하지 않는 집합(Set)입니다.
 * - 요소의 순서를 보장하지 않으며, 해시 테이블을 기반으로 구현됩니다.
 * 
 * 2. 주요 특징:
 * - **중복 허용 안 함**: 동일한 요소를 여러 번 추가해도 한 번만 저장됩니다.
 * - **순서 보장 안 됨**: 요소가 저장된 순서를 유지하지 않습니다.
 * - **빠른 검색**: 해시 테이블을 사용하여 검색, 삽입, 삭제 속도가 빠릅니다.
 * 
 * 3. 주요 메서드:
 * - `add(E e)`: 요소를 추가합니다. 중복된 요소는 무시됩니다.
 * - `remove(Object o)`: 특정 요소를 제거합니다.
 * - `contains(Object o)`: 특정 요소가 포함되어 있는지 확인합니다.
 * - `isEmpty()`: 집합이 비어 있는지 확인합니다.
 * - `size()`: 집합에 저장된 요소의 개수를 반환합니다.
 * 
 * 4. 사용 사례:
 * - 중복을 허용하지 않는 데이터 집합이 필요한 경우 사용.
 * - 예: 유일한 사용자 ID, 중복 없는 태그 목록 등.
 */