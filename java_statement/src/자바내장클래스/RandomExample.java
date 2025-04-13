package 자바내장클래스;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        // 랜덤 정수 생성
        System.out.println("랜덤 정수: " + random.nextInt());

        // 0부터 99까지의 랜덤 정수 생성
        System.out.println("0~99 랜덤 정수: " + random.nextInt(100));

        // 랜덤 실수 생성
        System.out.println("랜덤 실수: " + random.nextDouble());
    }
}

/*
 * 이론 설명:
 * 1. `Random` 클래스:
 * - 난수를 생성하기 위한 클래스.
 * 
 * 2. 주요 메서드:
 * - `nextInt()`: 랜덤 정수 생성.
 * - `nextInt(bound)`: 0부터 bound-1까지의 랜덤 정수 생성.
 * - `nextDouble()`: 0.0 이상 1.0 미만의 랜덤 실수 생성.
 */