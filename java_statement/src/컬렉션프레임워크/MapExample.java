package 컬렉션프레임워크;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // HashMap 예제
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 90);
        hashMap.put("Python", 85);
        hashMap.put("C++", 80);

        // 값 수정
        hashMap.put("Java", 95); // 동일 키로 값 덮어쓰기

        // 특정 값 가져오기
        int javaScore = hashMap.get("Java");
        System.out.println("Java 점수: " + javaScore);

        // 키 존재 여부 확인
        System.out.println("Java 포함? " + hashMap.containsKey("Java"));
        System.out.println("Go 포함? " + hashMap.containsKey("Go"));

        // 키-값 삭제
        hashMap.remove("C++");

        // 전체 출력
        System.out.println("🔹 HashMap 전체 출력:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();

        // 🔸 TreeMap 예제
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 3);
        treeMap.put("Apple", 5);
        treeMap.put("Cherry", 2);

        // 값 가져오기
        int appleQty = treeMap.get("Apple");
        System.out.println("Apple 개수: " + appleQty);

        // 키 존재 확인
        System.out.println("Apple 포함? " + treeMap.containsKey("Apple"));
        System.out.println("Durian 포함? " + treeMap.containsKey("Durian"));

        // 삭제
        treeMap.remove("Banana");

        // 전체 출력 (정렬된 결과)
        System.out.println("🔸 TreeMap 전체 출력 (자동 정렬):");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

/*
 * 이론 설명:
 * 1. Map 인터페이스:
 * - 키-값 쌍으로 데이터를 저장하는 구조.
 * - 주요 구현 클래스: `HashMap`, `TreeMap`.
 * 
 * 2. HashMap:
 * - 해시 테이블을 기반으로 구현된 맵.
 * - 키의 순서를 보장하지 않음.
 * - 빠른 검색과 삽입/삭제가 가능.
 * 
 * 3. TreeMap:
 * - 이진 트리를 기반으로 구현된 맵.
 * - 키가 자동으로 정렬됨.
 * - 정렬된 데이터를 다룰 때 적합.
 */

/*
 * 📘 이론 설명
 * 
 * 1. Map 인터페이스
 * - 키(key)와 값(value)을 쌍으로 저장하는 자료구조.
 * - 키는 중복될 수 없고, 값은 중복될 수 있음.
 * - 검색, 매핑, 관계 표현 등에 적합 (예: 사전, 회원 목록, 상품코드 등).
 * 
 * 2. 주요 구현 클래스
 * - HashMap
 * - TreeMap
 * - LinkedHashMap
 * - Hashtable (비추천, 오래된 클래스)
 * 
 * 3. HashMap
 * - 내부적으로 해시 테이블 사용
 * - 빠른 데이터 검색/삽입/삭제 (평균 O(1))
 * - 입력한 순서를 유지하지 않음
 * - null 키 1개, null 값 여러 개 허용
 * - 동일한 키로 put() 하면 기존 값을 덮어씀
 * 
 * 4. TreeMap
 * - 내부적으로 이진 탐색 트리 (Red-Black Tree) 기반
 * - 키가 자동으로 오름차순 정렬됨
 * - 삽입/삭제/검색 속도는 O(log n)
 * - 정렬된 데이터 처리에 적합
 * - null 키 허용 ❌
 * 
 * 5. 주요 메서드 (공통)
 * - put(key, value): 데이터 추가 또는 수정
 * - get(key): 키에 해당하는 값 반환
 * - remove(key): 키-값 쌍 삭제
 * - containsKey(key): 특정 키 존재 여부 확인
 * - entrySet(): 모든 키-값 쌍을 Set으로 반환 → for-each 반복에 유용
 * 
 * 6. 비교 요약
 * 
 * | 특징 | HashMap | TreeMap |
 * |-------------|------------------|---------------------|
 * | 구조 | 해시 테이블 | 이진 탐색 트리 |
 * | 정렬 여부 | ❌ (무작위 순서) | ✅ (키 자동 정렬) |
 * | 검색 속도 | 매우 빠름 (O(1)) | 보통 (O(log n)) |
 * | null 키 허용 | ✅ | ❌ |
 * | 사용 목적 | 일반적인 키-값 저장 | 정렬된 키 처리 필요 시 |
 * 
 */