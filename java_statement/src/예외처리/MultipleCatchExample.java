package 예외처리;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException 발생
            int result = 10 / 0; // ArithmeticException 발생
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 발생: 배열 인덱스 초과.");
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: 0으로 나눌 수 없습니다.");
        }
    }
}

/*
 * 이론 설명:
 * 1. 예외 종류에 따른 처리:
 * - 여러 종류의 예외를 처리하려면 `catch` 블록을 여러 개 작성합니다.
 * - 각 예외에 대해 적절한 예외 처리 코드를 작성할 수 있습니다.
 * 
 * 2. 다중 catch 블록:
 * - 예외가 발생하면 해당 예외에 맞는 첫 번째 `catch` 블록이 실행됩니다.
 */