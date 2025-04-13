package 참조타입의이해;

public class EnumTypeExample {
    public static void main(String[] args) {
        // 열거 타입 사용
        // 1. 열거 타입(Enum)은 상수들의 집합을 정의하는 데 사용됩니다.
        // 2. 열거 타입은 코드의 가독성을 높이고, 잘못된 값을 방지하는 데 유용합니다.
        // 3. 열거 타입은 switch 문과 함께 자주 사용됩니다.

        Day today = Day.MONDAY; // 열거 타입 변수 선언 및 초기화

        // switch 문을 사용하여 열거 타입 처리
        switch (today) {
            case MONDAY:
                System.out.println("오늘은 월요일입니다.");
                break;
            case TUESDAY:
                System.out.println("오늘은 화요일입니다.");
                break;
            case WEDNESDAY:
                System.out.println("오늘은 수요일입니다.");
                break;
            case THURSDAY:
                System.out.println("오늘은 목요일입니다.");
                break;
            case FRIDAY:
                System.out.println("오늘은 금요일입니다.");
                break;
            case SATURDAY:
                System.out.println("오늘은 토요일입니다.");
                break;
            case SUNDAY:
                System.out.println("오늘은 일요일입니다.");
                break;
        }

        // 열거 타입의 모든 값 출력
        System.out.println("\n열거 타입의 모든 값:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // 열거 타입의 이름과 순서 확인
        System.out.println("\n열거 타입의 이름과 순서:");
        System.out.println("today의 이름: " + today.name());
        System.out.println("today의 순서: " + today.ordinal());
    }
}

// 열거 타입 정의
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

/*
 * 이론 설명:
 * 1. 열거 타입(Enum)이란?
 * - 열거 타입은 상수들의 집합을 정의하는 데 사용됩니다.
 * - 예: 요일, 계절, 방향 등과 같은 고정된 값의 집합을 표현할 때 유용합니다.
 * 
 * 2. 열거 타입의 특징:
 * - 열거 타입은 `enum` 키워드를 사용하여 정의합니다.
 * - 열거 타입의 각 값은 고유하며, 열거 타입의 인스턴스처럼 사용됩니다.
 * - 열거 타입은 컴파일 시점에 잘못된 값을 방지할 수 있습니다.
 * 
 * 3. 열거 타입의 메서드:
 * - `values()`: 열거 타입의 모든 값을 배열로 반환합니다.
 * - `name()`: 열거 타입의 이름을 문자열로 반환합니다.
 * - `ordinal()`: 열거 타입의 순서를 0부터 반환합니다.
 * 
 * 4. 열거 타입과 switch 문:
 * - 열거 타입은 switch 문과 함께 자주 사용됩니다.
 * - 각 열거 값에 대해 특정 동작을 정의할 수 있습니다.
 * 
 * 5. 열거 타입 사용 시 주의점:
 * - 열거 타입은 고정된 값의 집합을 표현할 때만 사용해야 합니다.
 * - 값이 자주 변경되거나 동적으로 추가되는 경우에는 적합하지 않습니다.
 */