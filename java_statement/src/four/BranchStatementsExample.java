package four;

public class BranchStatementsExample {
    public static void main(String[] args) {
        // 1. break 문
        System.out.println("break 문 예제:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("i가 5이므로 반복문을 종료합니다.");
                break; // 반복문 종료
            }
            System.out.println("i: " + i);
        }

        // 2. continue 문
        System.out.println("\ncontinue 문 예제:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // 짝수는 건너뜀
            }
            System.out.println("i: " + i); // 홀수만 출력
        }

        // 3. return 문
        System.out.println("\nreturn 문 예제:");
        printMessage();
    }

    // return 문을 사용하는 메서드
    public static void printMessage() {
        System.out.println("메서드 시작");
        if (true) {
            System.out.println("조건이 참이므로 메서드를 종료합니다.");
            return; // 메서드 종료
        }
        // System.out.println("이 코드는 실행되지 않습니다.");
    }
}