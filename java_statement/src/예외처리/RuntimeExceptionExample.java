package 예외처리;

public class RuntimeExceptionExample {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println(str.length()); // NullPointerException 발생
        } catch (NullPointerException e) {
            System.out.println("예외 발생: null 값을 참조할 수 없습니다.");
        }
    }
}

/*
 * 이론 설명:
 * 1. 실행 예외(RuntimeException):
 * - 컴파일 시점에 체크되지 않고, 실행 중에 발생하는 예외.
 * - 예: `NullPointerException`, `ArrayIndexOutOfBoundsException`,
 * `ArithmeticException`.
 * 
 * 2. 특징:
 * - 실행 예외는 개발자가 사전에 방지할 수 있도록 코드를 작성해야 합니다.
 * - 예외 처리로 프로그램의 비정상 종료를 방지할 수 있습니다.
 */