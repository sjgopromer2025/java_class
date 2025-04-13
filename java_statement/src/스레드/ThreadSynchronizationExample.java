package 스레드;

class Counter {
    private int count = 0;

    // 동기화 메서드
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("최종 카운트: " + counter.getCount());
    }
}

/*
 * 이론 설명:
 * 1. 동기화란?
 * - 여러 스레드가 공유 자원에 동시에 접근할 때 발생하는 문제를 방지하기 위한 방법.
 * 
 * 2. 동기화 방법:
 * - 동기화 메서드: `synchronized` 키워드를 메서드에 사용.
 * - 동기화 블록: 특정 코드 블록에 `synchronized` 키워드를 사용.
 * 
 * 3. 주요 메서드:
 * - `join()`: 스레드가 종료될 때까지 대기.
 */