package 스레드;

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("데몬 스레드 실행 중...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        daemonThread.setDaemon(true); // 데몬 스레드로 설정
        daemonThread.start();

        System.out.println("메인 스레드 종료.");
    }
}

/*
 * 이론 설명:
 * 1. 데몬 스레드란?
 * - 다른 스레드의 작업을 지원하는 백그라운드 스레드.
 * - 모든 사용자 스레드가 종료되면 데몬 스레드도 자동으로 종료.
 * 
 * 2. 주요 메서드:
 * - `setDaemon(boolean on)`: 스레드를 데몬 스레드로 설정.
 * - `isDaemon()`: 스레드가 데몬 스레드인지 확인.
 */