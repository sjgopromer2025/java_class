package 스레드;

// Thread 클래스를 상속받아 스레드 생성
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " 실행 중: " + i);
        }
    }
}

// Runnable 인터페이스를 구현하여 스레드 생성
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " 실행 중: " + i);
        }
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        // Thread 클래스를 상속받은 스레드 실행
        MyThread thread1 = new MyThread();
        thread1.start();

        // Runnable 인터페이스를 구현한 스레드 실행
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        // 메인 스레드 작업
        for (int i = 1; i <= 5; i++) {
            System.out.println("메인 스레드 실행 중: " + i);
        }
    }
}

/*
 * 이론 설명:
 * 1. 스레드 생성 방법:
 * - `Thread` 클래스를 상속받아 스레드 생성.
 * - `Runnable` 인터페이스를 구현하여 스레드 생성.
 * 
 * 2. 주요 메서드:
 * - `start()`: 스레드를 실행.
 * - `run()`: 스레드가 실행할 작업을 정의.
 * 
 * 3. 사용 사례:
 * - 여러 작업을 동시에 실행해야 할 때 사용.
 */