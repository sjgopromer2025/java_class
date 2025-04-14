package 멀티스레드;

// Thread 클래스를 상속받아 스레드 생성
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " 실행 중: " + i);
            try {
                Thread.sleep(500); // 500ms 대기 (스레드 일시 정지)
            } catch (InterruptedException e) {
                System.out.println(getName() + "가 인터럽트되었습니다.");
            }
        }
    }
}

// Runnable 인터페이스를 구현하여 스레드 생성
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " 실행 중: " + i);
            try {
                Thread.sleep(500); // 500ms 대기 (스레드 일시 정지)
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "가 인터럽트되었습니다.");
            }
        }
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        // Thread 클래스를 상속받은 스레드 실행
        MyThread thread1 = new MyThread();
        thread1.setName("MyThread-1"); // 스레드 이름 설정
        thread1.start();

        // Runnable 인터페이스를 구현한 스레드 실행
        Thread thread2 = new Thread(new MyRunnable(), "MyRunnable-1"); // 스레드 이름 설정
        thread2.start();

        // 메인 스레드 작업
        for (int i = 1; i <= 5; i++) {
            System.out.println("메인 스레드 실행 중: " + i);
            try {
                Thread.sleep(500); // 500ms 대기 (스레드 일시 정지)
            } catch (InterruptedException e) {
                System.out.println("메인 스레드가 인터럽트되었습니다.");
            }
        }

        // 스레드 상태 확인
        System.out.println(thread1.getName() + " 상태: " + thread1.getState());
        System.out.println(thread2.getName() + " 상태: " + thread2.getState());
    }
}

/*
 * 이론 설명:
 * 1. 스레드 생성 방법:
 * - `Thread` 클래스를 상속받아 스레드 생성.
 * - `Runnable` 인터페이스를 구현하여 스레드 생성.
 * 
 * 2. 주요 메서드:
 * - `start()`: 스레드를 실행. 새로운 스레드에서 `run()` 메서드가 호출됩니다.
 * - `run()`: 스레드가 실행할 작업을 정의.
 * - `sleep(milliseconds)`: 스레드를 지정된 시간 동안 일시 정지.
 * - `getName()`: 스레드 이름을 반환.
 * - `setName(String name)`: 스레드 이름을 설정.
 * - `getState()`: 스레드의 현재 상태를 반환.
 * 
 * 3. 스레드 상태:
 * - NEW: 스레드가 생성되었지만 아직 실행되지 않은 상태.
 * - RUNNABLE: 실행 가능한 상태.
 * - BLOCKED: 다른 스레드가 자원을 점유하여 대기 중인 상태.
 * - WAITING: 다른 스레드의 작업이 끝날 때까지 대기.
 * - TIMED_WAITING: 일정 시간 동안 대기.
 * - TERMINATED: 스레드가 종료된 상태.
 * 
 * 4. 사용 사례:
 * - 여러 작업을 동시에 실행해야 할 때 사용.
 * - 예: 대규모 데이터 처리, 네트워크 요청 처리, UI 응답성 유지.
 */