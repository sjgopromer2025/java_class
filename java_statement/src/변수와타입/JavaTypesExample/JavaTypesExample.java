package 변수와타입.JavaTypesExample;

public class JavaTypesExample {

    public static void main(String[] args) {
        // 기본 데이터 타입 (Primitive Types)
        byte byteValue = 127; // 1바이트 정수
        short shortValue = 32000; // 2바이트 정수
        int intValue = 100000; // 4바이트 정수
        long longValue = 10000000000L; // 8바이트 정수

        float floatValue = 3.14f; // 4바이트 실수
        double doubleValue = 3.14159265359; // 8바이트 실수

        char charValue = 'A'; // 2바이트 문자
        boolean booleanValue = true; // 1비트 논리값

        // 출력
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
    }
}

/*
 * 자바의 데이터 타입
 * 
 * 자바는 데이터를 저장하기 위해 다양한 데이터 타입을 제공합니다. 데이터 타입은 크게 기본 데이터 타입(Primitive Types)과 참조
 * 데이터 타입(Reference Types)으로 나뉩니다.
 * 
 * 1. 기본 데이터 타입 (Primitive Types):
 * - 자바에서 제공하는 가장 기본적인 데이터 타입입니다.
 * - 총 8가지 타입이 있습니다.
 * 
 * 1) 정수형:
 * - byte: 1바이트 크기, -128 ~ 127 범위.
 * - short: 2바이트 크기, -32,768 ~ 32,767 범위.
 * - int: 4바이트 크기, -2^31 ~ 2^31-1 범위.
 * - long: 8바이트 크기, -2^63 ~ 2^63-1 범위. 값 뒤에 'L'을 붙여야 함.
 * 
 * 2) 실수형:
 * - float: 4바이트 크기, 소수점 이하 약 7자리 정밀도. 값 뒤에 'f'를 붙여야 함.
 * - double: 8바이트 크기, 소수점 이하 약 15자리 정밀도.
 * 
 * 3) 문자형:
 * - char: 2바이트 크기, 단일 문자 저장. 작은 따옴표(')로 묶음.
 * 
 * 4) 논리형:
 * - boolean: 1비트 크기, true 또는 false 값만 가짐.
 * 
 * 2. 참조 데이터 타입 (Reference Types):
 * - 객체를 참조하는 타입으로, 클래스, 배열, 인터페이스 등이 포함됩니다.
 * - 대표적으로 String 타입이 자주 사용됩니다.
 * 
 * 3. 데이터 타입의 특징:
 * - 기본 데이터 타입은 값 자체를 저장합니다.
 * - 참조 데이터 타입은 객체의 메모리 주소를 저장합니다.
 * 
 * 4. 타입 변환:
 * - 자동 변환: 작은 타입에서 큰 타입으로 변환 (예: int → long).
 * - 강제 변환: 큰 타입에서 작은 타입으로 변환 (예: double → int). 데이터 손실 가능.
 * 
 * 자바의 데이터 타입은 메모리 사용을 최적화하고, 데이터의 정확성을 보장하며, 프로그램의 안정성을 높이는 데 중요한 역할을 합니다.
 * 
 * 
 * 
 */