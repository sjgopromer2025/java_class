package practice.멀티스레드;

/*
 * 문제 내용:
 * 1. 두 개의 스레드를 생성하여 동시에 실행하세요.
 *    - 첫 번째 스레드는 1부터 10까지의 숫자를 출력합니다.
 *    - 두 번째 스레드는 "Hello, World!"를 5번 출력합니다.
 * 
 * 2. 각 스레드의 실행이 끝난 후, 메인 스레드에서 "모든 작업 완료!"를 출력하세요.
 * 
 * 3. 추가 실습:
 *    - 스레드 이름을 설정하고, 각 스레드가 실행될 때 자신의 이름을 함께 출력하도록 수정하세요.
 *    - `Thread.sleep()`을 사용하여 각 출력 사이에 500ms의 대기 시간을 추가하세요.
 */

public class SimpleThreadPractice {
    public static void main(String[] args) {
        // 첫 번째 스레드: 1부터 10까지 숫자 출력
        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - 숫자: " + i);
                try {
                    Thread.sleep(500); // 500ms 대기
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + "가 인터럽트되었습니다.");
                }
            }
        }, "NumberThread");

        // 두 번째 스레드: "Hello, World!" 5번 출력
        Thread helloThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - 메시지: Hello, World!");
                try {
                    Thread.sleep(500); // 500ms 대기
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + "가 인터럽트되었습니다.");
                }
            }
        }, "HelloThread");

        // 스레드 실행
        numberThread.start();
        helloThread.start();

        // 모든 스레드가 종료될 때까지 대기
        try {
            numberThread.join();
            helloThread.join();
        } catch (InterruptedException e) {
            System.out.println("메인 스레드가 인터럽트되었습니다.");
        }

        // 모든 작업 완료 메시지 출력
        System.out.println("모든 작업 완료!");
    }
}