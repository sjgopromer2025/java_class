package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        // ArrayList 예제
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("Java"); // 중복 허용
        System.out.println("ArrayList: " + arrayList);

        // LinkedList 예제
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("HTML");
        linkedList.add("CSS");
        linkedList.add("JavaScript");
        linkedList.add(2,"HTML"); // 중복 허용
        System.out.println("LinkedList: " + linkedList);
    }
}

/*
 * 이론 설명:
 * 1. List 인터페이스:
 * - 순서가 있는 데이터의 집합으로, 중복을 허용합니다.
 * - 주요 구현 클래스: `ArrayList`, `LinkedList`.
 * 
 * 2. ArrayList:
 * - 동적 배열을 구현한 클래스.
 * - 요소의 인덱스를 기반으로 빠르게 접근 가능.
 * - 삽입/삭제가 빈번하지 않은 경우 적합.
 * 
 * 3. LinkedList:
 * - 연결 리스트를 구현한 클래스.
 * - 삽입/삭제가 빈번한 경우 적합.
 * - 요소 접근 속도는 상대적으로 느림.
 */