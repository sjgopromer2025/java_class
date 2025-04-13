package 예외처리;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException 발생
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 발생: 배열의 인덱스가 범위를 벗어났습니다.");
        } finally {
            System.out.println("예외 처리 완료. 프로그램을 종료합니다.");
        }
    }
}

/*
 * 이론 설명:
 * 1. 예외 처리 코드:
 * - `try-catch` 블록을 사용하여 예외를 처리합니다.
 * - 예외가 발생하면 `catch` 블록이 실행되고, 프로그램이 비정상 종료되지 않습니다.
 * 
 * 2. finally 블록:
 * - `finally` 블록은 예외 발생 여부와 상관없이 항상 실행됩니다.
 * - 리소스를 해제하거나, 종료 메시지를 출력하는 데 주로 사용됩니다.
 * - 예: 파일 닫기, 데이터베이스 연결 해제 등.
 * 
 * 3. 예외 처리의 중요성:
 * - 예외 처리를 통해 프로그램의 안정성을 높이고, 사용자에게 적절한 메시지를 제공할 수 있습니다.
 * - `finally` 블록을 사용하여 리소스를 안전하게 정리할 수 있습니다.
 */