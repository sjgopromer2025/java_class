package 참조타입의이해;

public class MemoryUsage {
    public static void main(String[] args) {
        // 메모리 사용 영역에 대한 이해
        // 1. 스택(Stack): 메서드 호출과 관련된 지역 변수와 기본 데이터 타입이 저장됨.
        // 2. 힙(Heap): 참조 데이터 타입(객체, 배열 등)이 저장되는 영역.
        // 스택에는 힙에 저장된 객체의 참조 주소가 저장됨.

        // 기본 데이터 타입은 스택 메모리에 저장
        int primitiveValue = 42; // 정수형 기본 데이터 타입
        double primitiveDouble = 3.14; // 실수형 기본 데이터 타입

        // 참조 데이터 타입은 힙 메모리에 객체를 저장하고, 스택에는 참조 주소를 저장
        String referenceValue = "Hello, Memory!"; // String 객체는 힙에 저장
        String referenceValue2 = new String("Hello, Memory!"); // new 키워드로 생성된 String 객체도 힙에 저장
        String referenceValue3 = "Hello, Memory!"; // 리터럴로 생성된 String 객체는 동일한 주소를 가리킴

        int[] referenceArray = { 1, 2, 3 }; // 배열 객체도 힙에 저장

        // 출력
        System.out.println("기본 데이터 타입 (스택 메모리): " + primitiveValue);
        System.out.println("기본 데이터 타입 (스택 메모리): " + primitiveDouble);
        System.out.println("참조 데이터 타입 (힙 메모리): " + referenceValue);
        System.out.println(
                "참조 데이터 타입 (힙 메모리 - 배열): " + referenceArray[0] + ", " + referenceArray[1] + ", " + referenceArray[2]);

        // 참조 데이터 타입의 메모리 주소 확인 (참고: 실제 주소는 확인할 수 없으므로 해시코드 사용)
        System.out.println("\n참조 데이터 타입의 메모리 주소 (해시코드):");
        System.out.println("배열 객체의 해시코드: " + referenceArray.hashCode());
        // 확인용
        System.out.println("String 객체의 해시코드: " + referenceValue.hashCode());
        System.out.println("String 객체의 해시코드: " + referenceValue2.hashCode());

        System.out.println(System.identityHashCode(referenceValue));
        System.out.println(System.identityHashCode(referenceValue2));

        System.out.println(referenceValue == referenceValue2); // false, 서로 다른 객체
        System.out.println(referenceValue == referenceValue3); // true, 동일한 리터럴을 가리킴
        System.out.println(referenceValue2 == referenceValue3); // false, 서로 다른 객체

    }
}

/*
 * 이론 설명:
 * 1. 스택(Stack):
 * - 메서드 호출 시 생성되는 지역 변수와 기본 데이터 타입이 저장되는 메모리 영역.
 * - 메서드 호출이 끝나면 해당 스택 프레임이 제거되며, 변수도 사라짐.
 * - 빠른 접근 속도를 가짐.
 * 
 * 2. 힙(Heap):
 * - 참조 데이터 타입(객체, 배열 등)이 저장되는 메모리 영역.
 * - 객체는 힙에 저장되며, 스택에는 해당 객체의 참조 주소가 저장됨.
 * - 힙에 저장된 객체는 가비지 컬렉터(Garbage Collector)에 의해 관리됨.
 * 
 * 3. 기본 데이터 타입과 참조 데이터 타입의 차이:
 * - 기본 데이터 타입: 값 자체가 스택에 저장됨.
 * - 참조 데이터 타입: 힙에 객체가 저장되고, 스택에는 객체의 참조 주소가 저장됨.
 * 
 * 4. 해시코드(HashCode):
 * - 참조 데이터 타입의 메모리 주소를 기반으로 생성된 고유한 값.
 * - 실제 메모리 주소를 확인할 수는 없지만, 해시코드를 통해 객체를 구분할 수 있음.
 */