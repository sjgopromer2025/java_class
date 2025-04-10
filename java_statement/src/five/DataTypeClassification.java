package five;

public class DataTypeClassification {
    public static void main(String[] args) {
        // 기본 데이터 타입 (Primitive Types)
        int intValue = 10; // 정수형
        double doubleValue = 3.14; // 실수형
        char charValue = 'A'; // 문자형
        boolean booleanValue = true; // 논리형

        // 참조 데이터 타입 (Reference Types)
        String stringValue = "Hello, Java!"; // 문자열
        int[] arrayValue = { 1, 2, 3 }; // 배열

        System.out.println("기본 데이터 타입:");
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        System.out.println("\n참조 데이터 타입:");
        System.out.println("String: " + stringValue);
        System.out.println("Array: " + arrayValue[0] + ", " + arrayValue[1] + ", " + arrayValue[2]);
    }
}