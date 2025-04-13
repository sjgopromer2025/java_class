package 컬렉션프레임워크;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet 생성
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 요소 추가
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10); // 중복 요소 추가 시 무시됨

        // 요소 출력 (자동 정렬)
        System.out.println("TreeSet: " + treeSet);

        // 첫 번째 요소와 마지막 요소 가져오기
        System.out.println("첫 번째 요소: " + treeSet.first());
        System.out.println("마지막 요소: " + treeSet.last());

        // 특정 범위의 요소 가져오기
        System.out.println("10 이상 30 미만의 요소: " + treeSet.subSet(10, 30));

        // 요소 제거
        treeSet.remove(20);
        System.out.println("20 제거 후: " + treeSet);

        // 모든 요소 순회
        System.out.println("TreeSet 순회:");
        for (Integer element : treeSet) {
            System.out.println(element);
        }
    }
}

/*
 * 이론 설명:
 * 1. TreeSet이란?
 * - `TreeSet`은 중복을 허용하지 않는 집합(Set)으로, 요소를 자동으로 정렬하여 저장합니다.
 * - 이진 트리 구조를 기반으로 구현됩니다.
 * 
 * 2. 주요 특징:
 * - **중복 허용 안 함**: 동일한 요소를 여러 번 추가해도 한 번만 저장됩니다.
 * - **자동 정렬**: 요소가 저장될 때 자동으로 정렬됩니다.
 * - **범위 검색 가능**: 특정 범위의 요소를 쉽게 검색할 수 있습니다.
 * 
 * 3. 주요 메서드:
 * - `add(E e)`: 요소를 추가합니다. 중복된 요소는 무시됩니다.
 * - `remove(Object o)`: 특정 요소를 제거합니다.
 * - `first()`: 집합의 첫 번째(가장 작은) 요소를 반환합니다.
 * - `last()`: 집합의 마지막(가장 큰) 요소를 반환합니다.
 * - `subSet(E fromElement, E toElement)`: 특정 범위의 요소를 반환합니다.
 * 
 * 4. 사용 사례:
 * - 정렬된 데이터 집합이 필요한 경우 사용.
 * - 예: 정렬된 사용자 점수 목록, 날짜별 이벤트 정렬 등.
 */