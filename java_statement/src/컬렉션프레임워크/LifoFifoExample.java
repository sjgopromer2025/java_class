package 컬렉션프레임워크;

import java.util.Stack;
import java.util.LinkedList;

public class LifoFifoExample {
    public static void main(String[] args) {
        // LIFO: Stack
        Stack<String> stack = new Stack<>();

        // 요소 추가 (Push)
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack (LIFO): " + stack);

        // 요소 제거 (Pop)
        System.out.println("Pop: " + stack.pop()); // 마지막에 추가된 "C"가 제거됨
        System.out.println("Stack (After Pop): " + stack);

        // FIFO: Queue
        LinkedList<String> queue = new LinkedList<>();

        // 요소 추가 (Offer)
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        System.out.println("Queue (FIFO): " + queue);

        // 요소 제거 (Poll)
        System.out.println("Poll: " + queue.poll()); // 처음에 추가된 "1"이 제거됨
        System.out.println("Queue (After Poll): " + queue);
    }
}

/*
 * 이론 설명:
 * 1. LIFO (Last In First Out):
 * - 마지막에 삽입된 요소가 가장 먼저 제거되는 구조.
 * - `Stack` 클래스가 LIFO 방식을 구현.
 * - 주요 메서드:
 * - `push(E e)`: 스택의 맨 위에 요소를 추가.
 * - `pop()`: 스택의 맨 위 요소를 제거하고 반환.
 * - `peek()`: 스택의 맨 위 요소를 제거하지 않고 반환.
 * 
 * 2. FIFO (First In First Out):
 * - 처음에 삽입된 요소가 가장 먼저 제거되는 구조.
 * - `Queue` 인터페이스와 `LinkedList` 클래스가 FIFO 방식을 구현.
 * - 주요 메서드:
 * - `offer(E e)`: 큐의 맨 뒤에 요소를 추가.
 * - `poll()`: 큐의 맨 앞 요소를 제거하고 반환.
 * - `peek()`: 큐의 맨 앞 요소를 제거하지 않고 반환.
 * 
 * 3. 사용 사례:
 * - LIFO:
 * - 웹 브라우저의 뒤로 가기 스택.
 * - 재귀 호출의 호출 스택.
 * - FIFO:
 * - 프린터 작업 대기열.
 * - 네트워크 패킷 처리.
 */