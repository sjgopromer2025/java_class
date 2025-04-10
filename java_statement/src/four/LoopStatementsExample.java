package four;

public class LoopStatementsExample {
    public static void main(String[] args) {
        // 1. for 문
        // 특정 횟수만큼 반복 실행
        System.out.println("for 문 예제:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i); // 1부터 5까지 출력
        }

        // 2. while 문
        // 조건이 참인 동안 반복 실행
        System.out.println("\nwhile 문 예제:");
        int count = 1; // 초기화
        while (count <= 5) { // 조건식
            System.out.println("count: " + count); // 1부터 5까지 출력
            count++; // 증감식
        }

        // 3. do-while 문
        // 조건이 참인지 확인하기 전에 한 번은 반드시 실행
        System.out.println("\ndo-while 문 예제:");
        int num = 1;
        do {
            System.out.println("num: " + num); // 1부터 5까지 출력
            num++;
        } while (num <= 5);

        // 4. 중첩 반복문
        // 반복문 안에 또 다른 반복문을 포함
        System.out.println("\n중첩 반복문 예제:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j); // i와 j의 조합 출력
            }
        }
    }
}