package 클래스와객체;

public class MethodReturnTypeExample {
    // 메서드 리턴 타입 예제

    // 1. void 리턴 타입: 값을 반환하지 않는 메서드
    public void printMessage(String message) {
        System.out.println("메시지: " + message);
    }

    // 2. 기본 데이터 타입 리턴: 정수를 반환하는 메서드
    public int add(int a, int b) {
        return a + b; // 두 정수의 합 반환
    }

    // 3. 참조 데이터 타입 리턴: 문자열을 반환하는 메서드
    public String getGreeting(String name) {
        return "안녕하세요, " + name + "님!";
    }

    // 4. 배열 리턴: 정수 배열을 반환하는 메서드
    public int[] getNumbers() {
        return new int[] { 1, 2, 3, 4, 5 }; // 배열 반환
    }

    // 5. 객체 리턴: 사용자 정의 객체를 반환하는 메서드
    public Person createPerson(String name, int age) {
        return new Person(name, age); // Person 객체 반환
    }

    // 메인 메서드 (Main Method)
    public static void main(String[] args) {
        MethodReturnTypeExample example = new MethodReturnTypeExample();

        // 1. void 리턴 타입
        example.printMessage("메서드 리턴 타입 예제입니다.");

        // 2. 기본 데이터 타입 리턴
        int sum = example.add(10, 20);
        System.out.println("10 + 20 = " + sum);

        // 3. 참조 데이터 타입 리턴
        String greeting = example.getGreeting("홍길동");
        System.out.println(greeting);

        // 4. 배열 리턴
        int[] numbers = example.getNumbers();
        System.out.println("배열 값:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // 5. 객체 리턴
        Person person = example.createPerson("이순신", 30);
        System.out.println("생성된 객체: " + person);
    }
}

// Person 클래스 정의
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

/*
 * 이론 설명:
 * 1. 메서드 리턴 타입이란?
 * - 메서드가 작업을 수행한 후 호출자에게 반환하는 값의 데이터 타입입니다.
 * - 메서드 선언 시 반환 타입을 명시해야 하며, 반환값이 없을 경우 `void`를 사용합니다.
 * 
 * 2. 메서드 리턴 타입의 종류:
 * 1) void:
 * - 값을 반환하지 않는 메서드.
 * - 예: `public void printMessage(String message) { ... }`
 * 2) 기본 데이터 타입:
 * - 정수, 실수, 문자, 논리값 등 기본 데이터 타입을 반환.
 * - 예: `public int add(int a, int b) { return a + b; }`
 * 3) 참조 데이터 타입:
 * - 문자열, 배열, 사용자 정의 객체 등 참조 데이터 타입을 반환.
 * - 예: `public String getGreeting(String name) { return "안녕하세요, " + name; }`
 * 4) 배열:
 * - 배열을 반환.
 * - 예: `public int[] getNumbers() { return new int[] {1, 2, 3}; }`
 * 5) 객체:
 * - 사용자 정의 클래스를 반환.
 * - 예: `public Person createPerson(String name, int age) { return new
 * Person(name, age); }`
 * 
 * 3. return 키워드:
 * - 메서드에서 값을 반환할 때 사용합니다.
 * - `return` 뒤에 반환할 값을 명시하며, 메서드 실행을 종료합니다.
 * 
 * 4. void 메서드와 return:
 * - `void` 메서드는 값을 반환하지 않으므로 `return` 키워드를 생략할 수 있습니다.
 * - 단, 메서드를 조기에 종료하려면 `return;`을 사용할 수 있습니다.
 * 
 * 5. 실습 문제:
 * 1) MethodReturnTypeExample 클래스에 새로운 메서드를 추가하여 다음을 반환하세요:
 * - 두 문자열을 연결한 결과 (String).
 * - 두 정수의 곱 (int).
 * - 특정 길이의 정수 배열 (int[]).
 * 2) 메서드를 호출하여 반환된 값을 출력하세요.
 */