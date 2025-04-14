package 멀티스레드;

// 공유 자원을 관리하는 Counter 클래스
class Counter {
    private int count = 0;

    // 동기화 메서드: 한 번에 하나의 스레드만 접근 가능
    public synchronized void increment() {
        count++;
    }

    // 동기화 블록: 특정 코드 블록만 동기화
    public void incrementWithBlock() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Runnable 작업 정의
        Runnable taskWithMethod = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment(); // 동기화 메서드 호출
            }
        };

        Runnable taskWithBlock = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementWithBlock(); // 동기화 블록 호출
            }
        };

        // 두 개의 스레드 생성 (동기화 메서드 사용)
        Thread thread1 = new Thread(taskWithMethod);
        Thread thread2 = new Thread(taskWithMethod);

        // 두 개의 스레드 생성 (동기화 블록 사용)
        Thread thread3 = new Thread(taskWithBlock);
        Thread thread4 = new Thread(taskWithBlock);

        // 스레드 실행
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // 모든 스레드가 종료될 때까지 대기
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 최종 카운트 출력
        System.out.println("최종 카운트 (동기화 메서드 + 동기화 블록): " + counter.getCount());
    }
}

/*
 * 이론 설명:
 * 1. 동기화란?
 * - 여러 스레드가 공유 자원에 동시에 접근할 때 발생하는 문제를 방지하기 위한 방법.
 * - 동기화를 통해 데이터 불일치 문제를 해결할 수 있습니다.
 * 
 * 2. 동기화 방법:
 * - 동기화 메서드:
 *   - `synchronized` 키워드를 메서드에 사용하여, 해당 메서드에 한 번에 하나의 스레드만 접근 가능.
 *   - 예: `public synchronized void increment() { ... }`
 * 
 * - 동기화 블록:
 *   - 특정 코드 블록만 동기화하여, 필요한 부분만 보호.
 *   - `synchronized` 키워드와 객체를 사용.
 *   - 예: 
 *     ```
 *     synchronized (this) {
 *         count++;
 *     }
 *     ```
 * 
 * 3. 주요 메서드:
 * - `join()`: 스레드가 종료될 때까지 대기.
 * - `start()`: 스레드를 실행.
 * - `run()`: 스레드가 실행할 작업을 정의.
 * 
 * 4. 동기화 메서드 vs 동기화 블록:
 * - 동기화 메서드:
 *   - 메서드 전체를 동기화.
 *   - 간단하지만, 불필요한 동기화로 인해 성능 저하 가능.
 * 
 * - 동기화 블록:
 *   - 특정 코드 블록만 동기화.
 *   - 필요한 부분만 보호하므로 성능이 더 효율적.
 * 
 * 5. 사용 사례:
 * - 은행 계좌에서 잔액을 업데이트할 때.
 * - 다중 스레드 환경에서 공유 데이터를 읽고 쓸 때.
 * - 파일 쓰기 작업에서 데이터 무결성을 보장할 때.
 */