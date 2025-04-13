package 컬렉션프레임워크;


import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. ArrayList 객체 생성
        ArrayList<String> fruits = new ArrayList<>();

        // 2. 요소 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");

        // 3. ArrayList의 크기 출력
        System.out.println("List 크기: " + fruits.size()); // 4

        // 4. 요소 출력 (인덱스 기반 접근)
        System.out.println("두 번째 과일: " + fruits.get(1)); // "Banana"

        // 5. ArrayList에서 특정 요소 삭제
        fruits.remove("Cherry"); // "Cherry" 삭제

        // 6. 삭제 후 리스트 출력
        System.out.println("삭제 후 리스트: " + fruits); // [Apple, Banana, Orange]

        // 7. 특정 인덱스에서 요소 삭제
        fruits.remove(0); // 인덱스 0의 요소 삭제 (Apple 삭제)

        // 8. 삭제 후 다시 리스트 출력
        System.out.println("삭제 후 리스트: " + fruits); // [Banana, Orange]

        // 9. ArrayList에 특정 요소가 존재하는지 확인
        if (fruits.contains("Banana")) {
            System.out.println("Banana가 리스트에 존재합니다.");
        }

        // 10. ArrayList를 순차적으로 출력 (for-each 사용)
        System.out.println("리스트의 모든 과일:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
