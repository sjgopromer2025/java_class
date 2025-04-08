package Two.TypeCastingExample;

public class TypeCastingExample {

    public static void main(String[] args) {
        // 1. 자동 타입 변환 (Implicit Casting)
        // 작은 데이터 타입에서 큰 데이터 타입으로 변환 (데이터 손실 없음)
        int intValue = 100;
        long longValue = intValue; // int → long (자동 변환)
        double doubleValue = longValue; // long → double (자동 변환)

        System.out.println("자동 타입 변환:");
        System.out.println("intValue: " + intValue); // 100
        System.out.println("longValue: " + longValue); // 100
        System.out.println("doubleValue: " + doubleValue); // 100.0

        // 2. 강제 타입 변환 (Explicit Casting)
        // 큰 데이터 타입에서 작은 데이터 타입으로 변환 (데이터 손실 가능)
        double largeDouble = 123.456;
        int smallInt = (int) largeDouble; // double → int (강제 변환)

        System.out.println("\n강제 타입 변환:");
        System.out.println("largeDouble: " + largeDouble); // 123.456
        System.out.println("smallInt: " + smallInt); // 123 (소수점 이하 손실)

        // 3. 문자와 숫자 간의 변환
        char charValue = 'A';
        int charToInt = charValue; // char → int (자동 변환)
        char intToChar = (char) (charToInt + 1); // int → char (강제 변환)

        System.out.println("\n문자와 숫자 간의 변환:");
        System.out.println("charValue: " + charValue); // 'A'
        System.out.println("charToInt: " + charToInt); // 65 (ASCII 값)
        System.out.println("intToChar: " + intToChar); // 'B'

        // 4. 문자열과 기본 데이터 타입 간의 변환
        String numberString = "123";
        int stringToInt = Integer.parseInt(numberString); // 문자열 → 정수
        String intToString = Integer.toString(stringToInt); // 정수 → 문자열

        System.out.println("\n문자열과 기본 데이터 타입 간의 변환:");
        System.out.println("numberString: " + numberString); // "123"
        System.out.println("stringToInt: " + stringToInt); // 123
        System.out.println("intToString: " + intToString); // "123"
    }
}

/*
 * 타입 변환 (Type Casting)
 * 
 * 자바에서 타입 변환은 데이터 타입을 다른 타입으로 변환하는 과정입니다. 타입 변환은 크게 두 가지로 나뉩니다:
 * 
 * 1. 자동 타입 변환 (Implicit Casting):
 * - 작은 데이터 타입에서 큰 데이터 타입으로 변환됩니다.
 * - 데이터 손실이 발생하지 않으므로 명시적인 변환 코드가 필요하지 않습니다.
 * - 예: int → long, long → double.
 * 
 * 2. 강제 타입 변환 (Explicit Casting):
 * - 큰 데이터 타입에서 작은 데이터 타입으로 변환됩니다.
 * - 데이터 손실이 발생할 수 있으므로 명시적으로 변환 코드를 작성해야 합니다.
 * - 예: double → int, long → int.
 * 
 * 3. 문자와 숫자 간의 변환:
 * - char 타입은 내부적으로 정수형으로 처리됩니다 (ASCII 값 사용).
 * - char → int는 자동 변환, int → char는 강제 변환이 필요합니다.
 * 
 * 4. 문자열과 기본 데이터 타입 간의 변환:
 * - 문자열을 기본 데이터 타입으로 변환하려면 `Integer.parseInt`, `Double.parseDouble` 등의 메서드를
 * 사용합니다.
 * - 기본 데이터 타입을 문자열로 변환하려면 `Integer.toString`, `String.valueOf` 등을 사용합니다.
 * 
 * 타입 변환은 데이터의 크기와 범위를 고려하여 신중히 사용해야 하며, 특히 강제 변환 시 데이터 손실 가능성을 염두에 두어야 합니다.
 */