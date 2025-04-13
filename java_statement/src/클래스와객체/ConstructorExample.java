package 클래스와객체;

public class ConstructorExample {
    public static void main(String[] args) {
        // 생성자의 역할 이해
        // 1. 생성자는 객체 생성 시 호출되는 특별한 메서드입니다.
        // 2. 생성자는 클래스 이름과 동일하며, 반환 타입이 없습니다.

        // Dog 클래스의 객체 생성
        Dog myDog = new Dog("바둑이", 3);
        Dog defaultDog = new Dog(); // 기본 생성자 사용
        System.out.println("강아지 이름: " + myDog.getName());
        System.out.println("강아지 나이: " + myDog.getAge());
        System.out.println("기본 강아지 이름: " + defaultDog.getName());
        System.out.println("기본 강아지 나이: " + defaultDog.getAge());
    }
}

// Dog 클래스 정의
class Dog {
    private String name; // 이름
    private int age; // 나이

    // 기본 생성자
    public Dog() {
        this.name = "이름 없음";
        this.age = 0;
    }

    // 매개변수가 있는 생성자
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

/*
 * 이론 설명:
 * 1. 생성자(Constructor):
 * - 생성자는 객체 생성 시 호출되는 특별한 메서드입니다.
 * - 클래스 이름과 동일하며, 반환 타입이 없습니다.
 * - 객체 초기화를 위해 사용됩니다.
 * 
 * 2. 생성자의 종류:
 * - 기본 생성자: 매개변수가 없는 생성자.
 * - 매개변수가 있는 생성자: 객체 생성 시 초기값을 설정하기 위해 사용.
 * 
 * 3. 생성자 오버로딩:
 * - 동일한 이름의 생성자를 여러 개 정의할 수 있으며, 매개변수의 개수나 타입이 달라야 합니다.
 */