package six;

// 클래스 정의
public class JavaClassExample {
    // 필드 (Field)
    // 클래스의 속성을 정의하는 변수
    private String name; // 이름
    private int age; // 나이

    // 생성자 (Constructor)
    // 객체 생성 시 호출되며, 필드를 초기화하는 역할
    public JavaClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드 (Method)
    // 클래스의 동작을 정의하는 함수
    public String getName() {
        return name; // 이름 반환
    }

    public void setName(String name) {
        this.name = name; // 이름 설정
    }

    public int getAge() {
        return age; // 나이 반환
    }

    public void setAge(int age) {
        this.age = age; // 나이 설정
    }

    // 메인 메서드 (Main Method)
    // 프로그램 실행의 시작점
    public static void main(String[] args) {



        
        // 객체 생성
        JavaClassExample person = new JavaClassExample("홍길동", 25);

        // 객체 사용
        System.out.println("이름: " + person.getName());
        System.out.println("나이: " + person.getAge());

        // 객체의 필드 값 변경
        person.setName("이순신");
        person.setAge(30);

        System.out.println("변경된 이름: " + person.getName());
        System.out.println("변경된 나이: " + person.getAge());
    }
}

/*
 * 이론 설명:
 * 1. 클래스(Class):
 * - 클래스는 객체를 생성하기 위한 설계도입니다.
 * - 클래스는 필드(속성), 생성자, 메서드(동작)로 구성됩니다.
 * 
 * 2. 필드(Field):
 * - 클래스의 속성을 정의하는 변수입니다.
 * - 예: 이름, 나이 등.
 * 
 * 3. 생성자(Constructor):
 * - 객체 생성 시 호출되는 특별한 메서드입니다.
 * - 클래스 이름과 동일하며, 반환 타입이 없습니다.
 * - 객체의 필드를 초기화하는 데 사용됩니다.
 * 
 * 4. 메서드(Method):
 * - 클래스의 동작을 정의하는 함수입니다.
 * - 메서드는 특정 작업을 수행하며, 입력값(매개변수)을 받아 결과를 반환할 수 있습니다.
 * 
 * 5. 객체(Object):
 * - 클래스에서 생성된 인스턴스입니다.
 * - 객체는 클래스의 속성과 동작을 실제로 구현합니다.
 * 
 * 6. 메인 메서드(Main Method):
 * - `public static void main(String[] args)`는 자바 프로그램의 시작점입니다.
 * - 프로그램 실행 시 가장 먼저 호출됩니다.
 * 
 * 7. this 키워드:
 * - 현재 객체를 참조하는 키워드입니다.
 * - 생성자나 메서드에서 필드와 매개변수를 구분할 때 사용됩니다.
 * 
 * 실습 문제:
 * 1. JavaClassExample 클래스에 추가적인 필드(예: 주소)를 추가하고, 이를 설정하고 반환하는 메서드를 작성하세요.
 * 2. 새로운 객체를 생성하여 모든 필드 값을 출력하세요.
 */