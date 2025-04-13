package 자바내장클래스;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList 생성
        LinkedList<String> list = new LinkedList<>();

        // 요소 추가
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // 요소 출력
        System.out.println("리스트: " + list);

        // 첫 번째 요소 추가
        list.addFirst("HTML");
        System.out.println("첫 번째 요소 추가 후: " + list);

        // 마지막 요소 제거
        list.removeLast();
        System.out.println("마지막 요소 제거 후: " + list);
    }
}

/*
 * 이론 설명:
 * 1. `LinkedList` 클래스:
 * - 연결 리스트를 구현한 클래스.
 * - 요소를 삽입하거나 삭제하는 작업이 빠릅니다.
 * 
 * 2. 주요 메서드:
 * - `addFirst()`: 리스트의 첫 번째 위치에 요소 추가.
 * - `addLast()`: 리스트의 마지막 위치에 요소 추가.
 * - `removeFirst()`: 첫 번째 요소 제거.
 * - `removeLast()`: 마지막 요소 제거.
 */