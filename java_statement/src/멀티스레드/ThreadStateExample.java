package 멀티스레드;

public class ThreadStateExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("스레드 실행 중...");
                Thread.sleep(2000); // TIMED_WAITING 상태
                System.out.println("스레드 작업 완료.");
            } catch (InterruptedException e) {
                System.out.println("스레드가 인터럽트되었습니다.");
            }
        });

        // 스레드 상태 확인
        System.out.println("스레드 상태: " + thread.getState()); // NEW
        thread.start();
        System.out.println("스레드 상태: " + thread.getState()); // RUNNABLE

        try {
            Thread.sleep(500); // 메인 스레드 대기
            System.out.println("스레드 상태: " + thread.getState()); // TIMED_WAITING
            thread.join(); // 스레드 종료 대기
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
 * - RUNNABLE: 실행 가능한 상태. CPU 스케줄링에 따라 실행될 수 있음.
 * - BLOCKED: 다른 스레드가 자원을 점유하여 대기 중인 상태.
 * - WAITING: 다른 스레드의 작업이 끝날 때까지 무기한 대기.
 * - TIMED_WAITING: 일정 시간 동안 대기.
 * - TERMINATED: 스레드가 종료된 상태.
 * 
 * 2. 주요 메서드:
 * - `getState()`: 스레드의 현재 상태를 반환.
 * - `start()`: 스레드를 실행.
 * - `join()`: 스레드가 종료될 때까지 대기.
 * - `sleep(milliseconds)`: 스레드를 지정된 시간 동안 일시 정지.
 * - `interrupt()`: 스레드를 인터럽트하여 대기 상태를 종료.
 * 
 * 3. 상태 제어:
 * - `sleep()`: 스레드를 TIMED_WAITING 상태로 전환.
 * - `join()`: 호출한 스레드를 WAITING 상태로 전환.
 * - `interrupt()`: 대기 중인 스레드를 깨워 실행 상태로 전환.
 * 
 * 4. 사용 사례:
 * - 스레드 상태를 모니터링하여 디버깅 및 성능 최적화.
 * - 특정 작업이 완료될 때까지 다른 스레드가 대기하도록 제어.
 */