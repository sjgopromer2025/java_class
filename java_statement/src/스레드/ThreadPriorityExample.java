package 스레드;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 실행 중: " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2 실행 중: " + i);
            }
        });

        // 우선순위 설정
        thread1.setPriority(Thread.MIN_PRIORITY); // 최소 우선순위
        thread2.setPriority(Thread.MAX_PRIORITY); // 최대 우선순위

        thread1.start();
        thread2.start();
    }
}

/*
 * 이론 설명:
 * 1. 스레드 우선순위:
 * - 스레드의 실행 순서를 결정하는 힌트를 제공.
 * - 우선순위는 1(MIN_PRIORITY)부터 10(MAX_PRIORITY)까지 설정 가능.
 * 
 * 2. 주요 메서드:
 * - `setPriority(int priority)`: 스레드의 우선순위를 설정.
 * - `getPriority()`: 스레드의 우선순위를 반환.
 * 
 * 3. 주의사항:
 * - 우선순위는 운영체제에 따라 다르게 동작할 수 있음.
 */