package 예외처리;

// 사용자 정의 예외 클래스
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("나이는 18세 이상이어야 합니다.");
        }
    }
}

/*
 * 이론 설명:
 * 1. 사용자 정의 예외:
 * - `Exception` 클래스를 상속받아 사용자 정의 예외를 생성할 수 있습니다.
 * - 특정 상황에 맞는 예외를 정의하여 코드의 가독성과 유지보수성을 높입니다.
 * 
 * 2. 사용 방법:
 * - 사용자 정의 예외 클래스 작성.
 * - `throw new` 키워드를 사용하여 예외를 발생시킴.
 */