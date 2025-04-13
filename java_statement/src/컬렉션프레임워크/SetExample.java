package 컬렉션프레임워크;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // ✅ HashSet 예제 - 순서를 유지하지 않고, 중복을 허용하지 않는 집합
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Java"); // 중복된 값은 추가되지 않음
        hashSet.add("C++");

        System.out.println("HashSet: " + hashSet); // 출력 순서는 무작위

        // 주요 메서드 사용
        System.out.println("HashSet에 'Python'이 포함되어 있나요? " + hashSet.contains("Python"));
        hashSet.remove("C++");
        System.out.println("HashSet에서 'C++' 제거 후: " + hashSet);
        System.out.println("HashSet 크기: " + hashSet.size());

        System.out.println("--------------------------------");

        // ✅ TreeSet 예제 - 자동 정렬되는 집합
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);

        System.out.println("TreeSet: " + treeSet); // 자동으로 오름차순 정렬됨

        // 주요 메서드 사용
        System.out.println("가장 작은 값: " + treeSet.first());
        System.out.println("가장 큰 값: " + treeSet.last());
        System.out.println("10보다 작은 값들: " + treeSet.headSet(10));
        System.out.println("10 이상인 값들: " + treeSet.tailSet(10));
        System.out.println("5 이상 15 미만: " + treeSet.subSet(5, 15));
    }
}

/*
 * 📌 1. Set 인터페이스
 * - 중복을 허용하지 않는 데이터의 집합(Collection)
 * - 순서를 유지하지 않음 (TreeSet 제외)
 * - null 값을 1개만 허용 (HashSet 기준)
 * - 검색이 빠르고, 데이터의 유일성을 보장할 때 사용 (예: 회원 ID 집합)
 * 
 * ✅ 주요 메서드
 * - add(E e): 요소 추가
 * - remove(Object o): 요소 제거
 * - contains(Object o): 특정 요소 포함 여부 확인
 * - size(): 전체 요소 수 반환
 * - isEmpty(): 비어있는지 확인
 * - clear(): 모든 요소 제거
 * 
 * 📌 2. HashSet
 * - 해시 테이블 기반 구현
 * - 요소의 순서를 유지하지 않음
 * - 가장 빠른 성능 (O(1) 수준)
 * 
 * 📌 3. TreeSet
 * - 이진 탐색 트리(Red-Black Tree) 기반 구현
 * - 요소가 자동으로 정렬됨 (기본: 오름차순)
 * - 정렬, 범위 검색이 필요한 경우 적합
 * - first(), last(), headSet(), tailSet(), subSet() 등
 * 
 * ⚠️ Set은 인덱스 기반 구조가 아니기 때문에 get(index) 같은 메서드는 없음!
 */
