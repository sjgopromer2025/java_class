package 멀티스레드;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int task = i;
            executor.execute(() -> {
                System.out.println("작업 " + task + " 실행 중: " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}

/*
 * 이론 설명:
 * 1. 스레드풀(Thread Pool)이란?
 * - 스레드의 생성과 관리를 효율적으로 처리하기 위한 스레드 관리 기법.
 * - 미리 생성된 스레드를 재사용하여 성능을 향상.
 * 
 * 2. 주요 메서드:
 * - `execute(Runnable command)`: 작업을 스레드풀에 제출.
 * - `shutdown()`: 스레드풀을 종료.
 */