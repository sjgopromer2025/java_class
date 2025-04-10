package five;

public class NullExample {
    public static void main(String[] args) {
        // null에 대한 이해
        // 1. null은 참조 데이터 타입에서만 사용할 수 있는 특별한 값입니다.
        // 2. null은 "아무것도 참조하지 않음"을 의미합니다.
        // 3. null 값을 가진 변수를 참조하려고 하면 NullPointerException이 발생합니다.

        // null 값 할당
        String nullString = null; // nullString은 아무것도 참조하지 않음

        // null 값 확인
        if (nullString == null) {
            System.out.println("nullString은 null입니다.");
        } else {
            System.out.println("nullString은 null이 아닙니다.");
        }

        // null 값을 참조하려고 하면 NullPointerException 발생
        try {
            System.out.println(nullString.length()); // null 값을 참조하려고 시도
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 발생: null 값을 참조할 수 없습니다.");
        }

        // null을 다른 값으로 초기화
        nullString = "Hello, Java!";
        System.out.println("\nnullString이 초기화된 후:");
        System.out.println("nullString: " + nullString);
        System.out.println("nullString의 길이: " + nullString.length());
    }
}

/*
 * 이론 설명:
 * 1. null의 의미:
 * - null은 참조 데이터 타입에서 "아무것도 참조하지 않음"을 나타내는 특별한 값입니다.
 * - 기본 데이터 타입(int, double 등)에는 null을 사용할 수 없습니다.
 * 
 * 2. NullPointerException:
 * - null 값을 참조하려고 하면 발생하는 예외입니다.
 * - 예를 들어, null 값을 가진 객체의 메서드나 속성에 접근하려고 하면 NullPointerException이 발생합니다.
 * 
 * 3. null 값 확인:
 * - null 값을 확인하려면 `== null` 또는 `!= null`을 사용합니다.
 * - null 값을 확인한 후에만 해당 객체를 안전하게 사용할 수 있습니다.
 * 
 * 4. null 초기화:
 * - null 값을 가진 변수를 다른 값으로 초기화하면 정상적으로 사용할 수 있습니다.
 * - 예: `String str = null;` → `str = "Hello";`
 * 
 * 5. null 사용 시 주의점:
 * - null 값을 가진 변수를 사용할 때는 항상 null 여부를 확인해야 합니다.
 * - NullPointerException을 방지하기 위해 조건문이나 예외 처리를 사용하는 것이 좋습니다.
 */