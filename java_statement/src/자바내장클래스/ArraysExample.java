package 자바내장클래스;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = { 5, 3, 8, 1, 2 };

        // 배열 정렬
        Arrays.sort(numbers);
        System.out.println("정렬된 배열: " + Arrays.toString(numbers));

        // 배열 검색
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("값 3의 인덱스: " + index);

        // 배열 복사
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("복사된 배열: " + Arrays.toString(copiedArray));
    }
}

/*
 * 이론 설명:
 * 1. `Arrays` 클래스:
 * - 배열 조작을 위한 유틸리티 메서드를 제공하는 클래스.
 * 
 * 2. 주요 메서드:
 * - `sort()`: 배열 정렬.
 * - `binarySearch()`: 정렬된 배열에서 이진 검색.
 * - `copyOf()`: 배열 복사.
 * - `toString()`: 배열 내용을 문자열로 반환.
 */