package 자바내장클래스;

public class MathExample {
    public static void main(String[] args) {
        // 절대값
        System.out.println("절대값: " + Math.abs(-10));

        // 최대값, 최소값
        System.out.println("최대값: " + Math.max(10, 20));
        System.out.println("최소값: " + Math.min(10, 20));

        // 제곱근
        System.out.println("제곱근: " + Math.sqrt(16));

        // 랜덤 값
        System.out.println("랜덤 값: " + Math.random());

        // 거듭제곱
        System.out.println("2의 3제곱: " + Math.pow(2, 3));
    }
}

/*
 * 이론 설명:
 * 1. `Math` 클래스:
 * - 수학 연산을 위한 메서드를 제공하는 클래스.
 * - 모든 메서드는 정적(static) 메서드로 제공됩니다.
 * 
 * 2. 주요 메서드:
 * - `abs()`: 절대값 반환.
 * - `max()`, `min()`: 최대값, 최소값 반환.
 * - `sqrt()`: 제곱근 계산.
 * - `random()`: 0.0 이상 1.0 미만의 랜덤 값 반환.
 * - `pow(base, exponent)`: 거듭제곱 계산.
 */