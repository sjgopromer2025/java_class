package 예외처리;

public class ExceptionInfoExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException 발생
        } catch (ArithmeticException e) {
            // 예외 메시지 출력
            System.out.println("예외 메시지: " + e.getMessage());

            // 예외 클래스 이름 출력
            System.out.println("예외 클래스 이름: " + e.getClass().getName());

            // 예외의 전체 스택 트레이스 출력
            System.out.println("스택 트레이스:");
            e.printStackTrace();

            // 예외 발생 위치 정보 출력
            StackTraceElement[] stackTrace = e.getStackTrace();
            System.out.println("예외 발생 위치:");
            for (StackTraceElement element : stackTrace) {
                System.out.println("클래스: " + element.getClassName() +
                        ", 메서드: " + element.getMethodName() +
                        ", 파일: " + element.getFileName() +
                        ", 라인: " + element.getLineNumber());
            }
        }
    }
}

/*
 * 이론 설명:
 * 1. 예외 정보 얻기:
 * - 예외 객체를 통해 다양한 정보를 얻을 수 있습니다.
 * - 주요 메서드:
 * 1) `getMessage()`: 예외 메시지를 반환.
 * 2) `getClass().getName()`: 예외 클래스의 이름을 반환.
 * 3) `printStackTrace()`: 예외의 발생 위치와 호출 스택 정보를 출력.
 * 4) `getStackTrace()`: 예외의 스택 트레이스를 배열로 반환.
 * 
 * 2. 예외 정보 활용:
 * - 예외 메시지와 클래스 이름을 통해 예외의 원인을 파악.
 * - 스택 트레이스를 분석하여 예외가 발생한 위치와 호출 경로를 확인.
 * - 디버깅과 로그 기록에 유용하게 사용.
 * 
 * 3. 코드 설명:
 * - `ArithmeticException`이 발생했을 때, 예외 객체를 통해 메시지, 클래스 이름, 스택 트레이스, 발생 위치를
 * 출력합니다.
 * - `getStackTrace()` 메서드를 사용하여 예외 발생 위치를 세부적으로 출력합니다.
 * 
 * 4. 실습 문제:
 * 1) `NullPointerException`을 발생시키는 코드를 작성하고, 예외 정보를 출력하세요.
 * 2) 사용자 정의 예외를 작성하고, 발생한 예외의 정보를 출력하세요.
 * 3) 예외 정보를 파일에 기록하는 코드를 작성하세요.
 */