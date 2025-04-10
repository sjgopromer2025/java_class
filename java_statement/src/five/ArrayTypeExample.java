package five;

public class ArrayTypeExample {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        // 1. 배열은 동일한 데이터 타입의 여러 값을 저장할 수 있는 참조 데이터 타입입니다.
        // 2. 배열은 고정된 크기를 가지며, 인덱스를 통해 각 요소에 접근할 수 있습니다.
        // 3. 배열의 인덱스는 0부터 시작합니다.

        int[] numbers = { 1, 2, 3, 4, 5 }; // 크기가 5인 정수형 배열 선언 및 초기화

        // 배열 값 출력
        System.out.println("배열 값:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]: " + numbers[i]);
        }

        // 배열 값 변경
        numbers[0] = 99; // 첫 번째 요소 값을 99로 변경
        System.out.println("\n배열 값 변경 후:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]: " + numbers[i]);
        }

        // 배열의 크기 확인
        System.out.println("\n배열의 크기: " + numbers.length);

        // 배열의 초기값 확인
        int[] uninitializedArray = new int[5]; // 크기가 5인 배열 선언 (초기값은 0)
        System.out.println("\n초기화되지 않은 배열의 값:");
        for (int i = 0; i < uninitializedArray.length; i++) {
            System.out.println("uninitializedArray[" + i + "]: " + uninitializedArray[i]);
        }

        // for (int i : numbers) {
        // System.out.println("uninitializedArray[i]: " + i);
        // }

        // 다차원 배열 선언 및 초기화
        int[][] multiArray = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("\n다차원 배열 값:");
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println("multiArray[" + i + "][" + j + "]: " + multiArray[i][j]);
            }
        }
    }

    // 배열의 크기를 변경하려면 새로운 배열을 생성해야 합니다.
    // 예를 들어, 기존 배열의 크기를 늘리려면 새로운 배열을 만들고 기존 배열의 값을 복사해야 합니다.
    // 아래는 배열 크기를 늘리는 예시입니다.
    public static int[] resizeArray(int[] original, int newSize) {
        int[] newArray = new int[newSize];
        for (int i = 0; i < Math.min(original.length, newSize); i++) {
            newArray[i] = original[i];
        }
        return newArray;
    }

}

/*
 * 이론 설명:
 * 1. 배열의 특징:
 * - 배열은 동일한 데이터 타입의 여러 값을 저장할 수 있는 참조 데이터 타입입니다.
 * - 배열의 크기는 고정되며, 선언 시 지정해야 합니다.
 * - 배열의 각 요소는 인덱스를 통해 접근하며, 인덱스는 0부터 시작합니다.
 * 
 * 2. 배열의 초기값:
 * - 배열을 선언만 하고 초기화하지 않으면 기본값이 할당됩니다.
 * - 예: 정수형 배열의 기본값은 0, 논리형 배열의 기본값은 false.
 * 
 * 3. 배열의 크기:
 * - 배열의 크기는 `배열이름.length`를 통해 확인할 수 있습니다.
 * 
 * 4. 다차원 배열:
 * - 배열 안에 배열을 포함하는 구조로, 2차원 이상의 배열을 생성할 수 있습니다.
 * - 다차원 배열은 행(row)과 열(column)로 구성됩니다.
 * 
 * 5. 배열 사용 시 주의점:
 * - 배열의 인덱스를 초과하여 접근하면 `ArrayIndexOutOfBoundsException`이 발생합니다.
 * - 배열의 크기를 변경하려면 새로운 배열을 생성해야 합니다.
 */