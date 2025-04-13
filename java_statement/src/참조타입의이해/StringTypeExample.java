package 참조타입의이해;

public class StringTypeExample {
    public static void main(String[] args) {
        // String은 참조 데이터 타입이지만 불변 객체 (Immutable Object)
        // 1. String 객체는 한 번 생성되면 그 값을 변경할 수 없습니다.
        // 2. 새로운 값을 할당하면 기존 객체를 수정하는 것이 아니라 새로운 객체를 생성합니다.
        // 3. String 객체는 메모리 효율성을 위해 String Pool을 사용합니다.

        // String 객체 생성
        String str1 = "Hello"; // String Pool에 "Hello" 객체 생성
        String str2 = str1; // str1과 str2는 같은 객체를 참조

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // str1에 새로운 값을 할당
        str1 = "World"; // 새로운 객체 "World" 생성, str1은 이를 참조
        System.out.println("\nstr1 (변경 후): " + str1);
        System.out.println("str2 (변경 후): " + str2); // str2는 여전히 "Hello"를 참조

        // String 비교
        String str3 = "Hello"; // String Pool에서 기존 "Hello" 객체를 참조
        System.out.println("\nstr2 == str3: " + (str2 == str3)); // true (같은 객체를 참조)
        System.out.println("str2.equals(str3): " + str2.equals(str3)); // true (값이 동일)

        // new 키워드로 String 객체 생성
        String str4 = new String("Hello"); // 힙 메모리에 새로운 객체 생성
        System.out.println("\nstr2 == str4: " + (str2 == str4)); // false (다른 객체를 참조)
        System.out.println("str2.equals(str4): " + str2.equals(str4)); // true (값이 동일)
    }
}

/*
 * 이론 설명:
 * 1. String의 불변성 (Immutable):
 * - String 객체는 한 번 생성되면 그 값을 변경할 수 없습니다.
 * - 새로운 값을 할당하면 기존 객체를 수정하는 것이 아니라 새로운 객체를 생성합니다.
 * 
 * 2. String Pool:
 * - String Pool은 메모리 효율성을 위해 동일한 문자열 리터럴을 공유하는 메커니즘입니다.
 * - 리터럴로 생성된 문자열은 String Pool에 저장되며, 동일한 값을 가진 문자열은 같은 객체를 참조합니다.
 * 
 * 3. String 비교:
 * - `==` 연산자는 두 객체의 참조(메모리 주소)를 비교합니다.
 * - `equals()` 메서드는 두 객체의 값을 비교합니다.
 * 
 * 4. new 키워드로 생성된 String:
 * - `new` 키워드를 사용하면 힙 메모리에 새로운 String 객체를 생성합니다.
 * - 이 경우 동일한 값을 가진 문자열이라도 String Pool의 객체와는 다른 객체를 참조합니다.
 * 
 * 5. String 사용 시 주의점:
 * - 문자열 비교 시 항상 `equals()` 메서드를 사용하는 것이 권장됩니다.
 * - `==` 연산자는 참조를 비교하므로 예상치 못한 결과를 초래할 수 있습니다.
 */