package 컬렉션프레임워크;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        // LinkedList를 사용한 Queue
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println("Queue: " + queue);

        // 요소 제거
        System.out.println("제거된 요소: " + queue.poll());
        System.out.println("Queue (제거 후): " + queue);

        // PriorityQueue 예제
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        System.out.println("PriorityQueue: " + priorityQueue);
    }
}

/*
 * 이론 설명:
 * 1. Queue 인터페이스:
 * - FIFO(First In First Out) 방식으로 데이터를 처리하는 구조.
 * - 주요 구현 클래스: `LinkedList`, `PriorityQueue`.
 * 
 * 2. LinkedList:
 * - Queue로 사용될 때 FIFO 방식으로 동작.
 * - 요소를 삽입(`offer`)하고 제거(`poll`)하는 메서드를 제공.
 * 
 * 3. PriorityQueue:
 * - 우선순위에 따라 요소를 정렬하여 처리.
 * - 낮은 값이 높은 우선순위를 가짐.
 */