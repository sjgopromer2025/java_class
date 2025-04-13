package 예외처리;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // 0으로 나누기 (ArithmeticException 발생)
            System.out.println("결과: " + result);
        } catch (Exception e) {
            System.out.println("예외 발생: 0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("예외 처리 완료.");
        }
    }
}

/*
 * 이론 설명:
 * 1. 예외 처리란?
 * - 프로그램 실행 중 발생할 수 있는 오류를 처리하여 프로그램이 비정상 종료되지 않도록 하는 것.
 * - 자바에서는 예외(Exception) 클래스를 사용하여 예외를 처리합니다.
 * 
 * 2. 예외 클래스 계층 구조:
 * - `Throwable`: 모든 예외와 오류의 최상위 클래스.
 * - `Exception`: 프로그램에서 처리 가능한 예외.
 * - `Error`: 시스템 레벨의 심각한 오류로, 일반적으로 처리하지 않음.
 * 
 * 3. try-catch-finally:
 * - `try`: 예외가 발생할 가능성이 있는 코드를 작성.
 * - `catch`: 예외가 발생했을 때 실행할 코드를 작성.
 * - `finally`: 예외 발생 여부와 상관없이 항상 실행되는 코드 블록.
 */