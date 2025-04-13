package 스레드;

public class ThreadStateExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("스레드 실행 중...");
        });

        System.out.println("스레드 상태: " + thread.getState()); // NEW
        thread.start();
        System.out.println("스레드 상태: " + thread.getState()); // RUNNABLE

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("스레드 상태: " + thread.getState()); // TERMINATED
    }
}

/*
 * 이론 설명:
 * 1. 스레드 상태:
 * - NEW: 스레드가 생성되었지만 아직 실행되지 않은 상태.
 * - RUNNABLE: 실행 가능한 상태.
 * - BLOCKED: 다른 스레드가 자원을 점유하여 대기 중인 상태.
 * - WAITING: 다른 스레드의 작업이 끝날 때까지 대기.
 * - TIMED_WAITING: 일정 시간 동안 대기.
 * - TERMINATED: 스레드가 종료된 상태.
 * 
 * 2. 주요 메서드:
 * - `getState()`: 스레드의 현재 상태를 반환.
 */