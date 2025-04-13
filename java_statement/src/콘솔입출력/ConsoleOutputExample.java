package 콘솔입출력;

public class ConsoleOutputExample {
    public static void main(String[] args) {
        // 기본 출력
        System.out.println("Hello, Java!"); // 줄바꿈 포함
        System.out.print("이것은 줄바꿈이 없는 출력입니다."); // 줄바꿈 없음
        System.out.println(" 줄바꿈이 추가된 출력입니다.");

        // 형식화된 출력
        String name = "Alice";
        int age = 25;
        double height = 165.5;
        System.out.printf("이름: %s, 나이: %d세, 키: %.1fcm%n", name, age, height);
    }
}

/*
 * 이론 설명:
 * 1. 콘솔 출력:
 * - `System.out` 객체를 사용하여 콘솔에 데이터를 출력할 수 있습니다.
 * 
 * 2. 주요 메서드:
 * - `print(String s)`: 문자열을 출력. 줄바꿈 없음.
 * - `println(String s)`: 문자열을 출력하고 줄바꿈.
 * - `printf(String format, Object... args)`: 형식화된 문자열 출력.
 * 
 * 3. 사용 사례:
 * - 데이터를 화면에 출력하거나, 사용자에게 메시지를 표시할 때 사용.
 */