package 자바내장클래스;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // PriorityQueue 생성
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 요소 추가
        queue.add(20);
        queue.add(10);
        queue.add(30);

        // 요소 출력 (우선순위에 따라 정렬)
        System.out.println("PriorityQueue: " + queue);

        // 요소 제거
        System.out.println("제거된 요소: " + queue.poll());
        System.out.println("PriorityQueue (제거 후): " + queue);
    }
}

/*
 * 이론 설명:
 * 1. `PriorityQueue` 클래스:
 * - 우선순위 큐를 구현한 클래스.
 * - 요소는 우선순위에 따라 정렬됩니다.
 * 
 * 2. 주요 메서드:
 * - `add()`: 요소 추가.
 * - `poll()`: 우선순위가 가장 높은 요소 제거 및 반환.
 */