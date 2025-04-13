package practice.참조타입의이해;

import java.util.Arrays;

public class ReferenceObjectPractice {
    public static void main(String[] args) {
        // 문제 1: 문자열(String) 참조 객체 이해
        // - 문자열 객체를 생성하고, 문자열의 불변성을 확인하세요.
        // - str1과 str2가 같은 객체를 참조하는지 확인하고, str1의 값을 변경한 후 str2에 영향을 미치는지 확인하세요.
        String str1 = "Hello";
        String str2 = str1;

        System.out.println("[문제 1] 문자열 참조 객체:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        str1 = "World"; // str1에 새로운 값을 할당
        System.out.println("str1 (변경 후): " + str1);
        System.out.println("str2 (변경 후): " + str2); // str2는 영향을 받지 않음

        System.out.println("str1 == str2: " + (str1 == str2)); // 참조 비교
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // 값 비교

        // 문제 2: 배열(Array) 참조 객체 이해
        // - 배열을 생성하고, 배열의 값을 변경한 후 다른 참조 변수에 영향을 미치는지 확인하세요.
        int[] array1 = { 1, 2, 3 };
        int[] array2 = array1;

        System.out.println("\n[문제 2] 배열 참조 객체:");
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));

        array2[0] = 99; // array2의 첫 번째 값을 변경
        System.out.println("array1 (변경 후): " + Arrays.toString(array1)); // array1도 영향을 받음
        System.out.println("array2 (변경 후): " + Arrays.toString(array2));

        // 문제 3: 사용자 정의 클래스 참조 객체 이해
        // - Person 객체를 생성하고, 참조 변수를 통해 객체의 값을 변경한 후 다른 참조 변수에 영향을 미치는지 확인하세요.
        Person person1 = new Person("홍길동", 25);
        Person person2 = person1;

        System.out.println("\n[문제 3] 사용자 정의 클래스 참조 객체:");
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);

        person2.setName("이순신"); // person2를 통해 이름 변경
        System.out.println("person1 (변경 후): " + person1); // person1도 영향을 받음
        System.out.println("person2 (변경 후): " + person2);
    }
}

// 사용자 정의 클래스 Person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

/*
 * 문제 내용:
 * 1. 문자열(String) 참조 객체 이해:
 * - 문자열 객체를 생성하고, 문자열의 불변성을 확인하세요.
 * - str1과 str2가 같은 객체를 참조하는지 확인하고, str1의 값을 변경한 후 str2에 영향을 미치는지 확인하세요.
 * 
 * 2. 배열(Array) 참조 객체 이해:
 * - 배열을 생성하고, 배열의 값을 변경한 후 다른 참조 변수에 영향을 미치는지 확인하세요.
 * 
 * 3. 사용자 정의 클래스 참조 객체 이해:
 * - Person 객체를 생성하고, 참조 변수를 통해 객체의 값을 변경한 후 다른 참조 변수에 영향을 미치는지 확인하세요.
 */