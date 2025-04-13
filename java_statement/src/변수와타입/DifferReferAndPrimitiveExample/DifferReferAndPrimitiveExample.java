package 변수와타입.DifferReferAndPrimitiveExample;

import java.util.Arrays;

public class DifferReferAndPrimitiveExample {
    public static void main(String[] args) {
        // 기본 데이터 타입 (Primitive Types)
        int num1 = 10; // 기본형 변수
        int num2 = num1; // num1의 값을 복사하여 num2에 저장

        System.out.println("기본 데이터 타입:");
        System.out.println("num1: " + num1); // 10
        System.out.println("num2: " + num2); // 10

        num2 = 20; // num2의 값을 변경
        System.out.println("num1 (변경 후): " + num1); // 10 (num1은 변경되지 않음)
        System.out.println("num2 (변경 후): " + num2); // 20

        // 참조 데이터 타입 (Reference Types)
        int[] arr1 = { 1, 2, 3 }; // 참조형 변수 (배열)
        int[] arr2 = arr1; // arr1의 주소를 arr2에 저장

        System.out.println("\n참조 데이터 타입:");
        System.out.println("arr1: " + Arrays.toString(arr1)); // [1, 2, 3]
        System.out.println("arr2: " + Arrays.toString(arr2)); // [1, 2, 3]

        arr2[0] = 99; // arr2의 첫 번째 값을 변경
        System.out.println("arr1 (변경 후): " + Arrays.toString(arr1)); // [99, 2, 3] (arr1도 변경됨)
        System.out.println("arr2 (변경 후): " + Arrays.toString(arr2)); // [99, 2, 3]

        // 문자열 (String) - 참조 데이터 타입이지만 불변 객체 (Immutable Object)
        String str1 = "Hello"; // 참조형 변수
        String str2 = str1; // str1의 주소를 str2에 저장

        System.out.println("\n문자열 (String):");
        System.out.println("str1: " + str1); // Hello
        System.out.println("str2: " + str2); // Hello

        str1 = "World"; // str1의 값을 변경 (새로운 객체 생성)
        System.out.println("str1 (변경 후): " + str1); // World (str1은 변경됨)
        System.out.println("str2 (변경 후): " + str2); // Hello (str2는 변경되지 않음)
    }
}
