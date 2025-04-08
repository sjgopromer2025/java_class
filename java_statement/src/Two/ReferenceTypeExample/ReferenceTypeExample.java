package Two.ReferenceTypeExample;

public class ReferenceTypeExample {

    public static void main(String[] args) {
        // 참조 데이터 타입 (Reference Types) 예제

        // 1. 문자열 (String)
        String greeting = "안녕하세요, 자바!";
        System.out.println("문자열: " + greeting);

        // 2. 배열 (Array)
        int[] numbers = { 1, 2, 3, 4, 5 }; // 정수형 배열 선언 및 초기화
        System.out.println("배열의 첫 번째 값: " + numbers[0]);
        System.out.println("배열의 길이: " + numbers.length);

        String[] fruits = { "사과", "바나나", "체리" }; // 문자열 배열 선언 및 초기화
        System.out.println("과일 배열의 첫 번째 값: " + fruits[0]);

        // 3. 클래스 (Class)
        Person person = new Person("홍길동", 25); // Person 객체 생성
        System.out.println("이름: " + person.getName());
        System.out.println("나이: " + person.getAge());

        // 4. null 값
        String nullString = null; // 참조 데이터 타입은 null 값을 가질 수 있음
        System.out.println("null 값: " + nullString);
    }
}

// Person 클래스 정의
class Person {
    private String name; // 이름
    private int age; // 나이

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 이름 반환 메서드
    public String getName() {
        return name;
    }

    // 나이 반환 메서드
    public int getAge() {
        return age;
    }
}

// 이 예제에서는 문자열, 배열, 클래스 객체를 사용하여 참조 데이터 타입을 설명합니다.
// 참조 데이터 타입은 기본 데이터 타입과 달리 객체를 참조하는 방식으로 데이터를 저장합니다.
// 기본 데이터 타입과의 차이점은 다음과 같습니다:

// 문자열 (String):

// 참조 데이터 타입의 대표적인 예로, 문자열 데이터를 저장합니다.
// String은 자바에서 클래스이므로 객체로 취급됩니다.
// 배열 (Array):

// 동일한 데이터 타입의 여러 값을 저장할 수 있는 참조 데이터 타입입니다.
// 배열은 고정된 크기를 가지며, 인덱스를 통해 값에 접근합니다.
// 클래스 (Class):

// 사용자가 정의한 데이터 타입으로, 객체를 생성하여 데이터를 저장하고 조작할 수 있습니다.
// 예제에서는 Person 클래스를 정의하여 이름과 나이를 저장했습니다.
// null 값:

// 참조 데이터 타입은 객체를 참조하지 않을 때 null 값을 가질 수 있습니다.