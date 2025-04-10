package six;

public class ClassAndObject {
    public static void main(String[] args) {
        // 클래스와 객체의 관계 이해
        // 1. 클래스는 객체를 생성하기 위한 설계도입니다.
        // 2. 객체는 클래스에서 생성된 인스턴스입니다.

        // Person 클래스의 객체 생성
        Person person = new Person("홍길동", 25, "서울");
        System.out.println("이름: " + person.getName());
        System.out.println("나이: " + person.getAge());
        System.out.println("주소: " + person.getAddress());
    }
}

// Person 클래스 정의
class Person {
    private String name; // 이름
    private int age; // 나이
    private String address; // 주소

    // 생성자
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

/*
 * 이론 설명:
 * 1. 클래스(Class):
 * - 클래스는 객체를 생성하기 위한 설계도입니다.
 * - 속성(필드)과 동작(메서드)을 포함합니다.
 * 
 * 2. 객체(Object):
 * - 객체는 클래스에서 생성된 인스턴스입니다.
 * - 객체는 클래스의 속성과 동작을 실제로 구현합니다.
 */