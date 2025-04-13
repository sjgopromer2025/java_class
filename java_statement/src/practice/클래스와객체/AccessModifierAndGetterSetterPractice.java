package practice.클래스와객체;

public class AccessModifierAndGetterSetterPractice {
    public static void main(String[] args) {
        // 객체 생성
        Student student = new Student("홍길동", 20, "컴퓨터공학");

        // Getter 메서드를 사용하여 필드 값 출력
        System.out.println("이름: " + student.getName());
        System.out.println("나이: " + student.getAge());
        System.out.println("전공: " + student.getMajor());

        // Setter 메서드를 사용하여 필드 값 변경
        student.setName("이순신");
        student.setAge(25);
        student.setMajor("전자공학");

        // 변경된 값 출력
        System.out.println("\n변경된 정보:");
        System.out.println("이름: " + student.getName());
        System.out.println("나이: " + student.getAge());
        System.out.println("전공: " + student.getMajor());

        // 유효하지 않은 값 설정 시도
        student.setAge(-5); // 유효성 검사로 인해 설정되지 않음
    }
}

// Student 클래스 정의
class Student {
    // 필드 (Field)
    private String name; // 이름
    private int age; // 나이
    private String major; // 전공

    // 생성자 (Constructor)
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    // Setter 메서드
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) { // 유효성 검사: 나이는 0보다 커야 함
            this.age = age;
        } else {
            System.out.println("나이는 0보다 커야 합니다.");
        }
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

/*
 * 문제 내용:
 * 1. Student 클래스를 작성하여 다음 필드를 선언하세요:
 * - 이름(name): private 접근제한자
 * - 나이(age): private 접근제한자
 * - 전공(major): private 접근제한자
 * 
 * 2. 각 필드에 대해 Getter와 Setter 메서드를 작성하세요:
 * - Getter 메서드는 필드 값을 반환합니다.
 * - Setter 메서드는 필드 값을 설정하며, 나이(age)는 0보다 큰 값만 설정 가능하도록 유효성 검사를 추가하세요.
 * 
 * 3. Student 객체를 생성하고, Getter 메서드를 사용하여 필드 값을 출력하세요.
 * 
 * 4. Setter 메서드를 사용하여 필드 값을 변경하고, 변경된 값을 출력하세요.
 * 
 * 5. 유효하지 않은 값을 설정하려고 할 때, 적절한 메시지를 출력하도록 구현하세요.
 * 
 * 추가 실습:
 * 1. 새로운 필드(예: 학번 studentId)를 추가하고, 이에 대한 Getter와 Setter 메서드를 작성하세요.
 * 2. 학번은 6자리 숫자만 설정 가능하도록 유효성 검사를 추가하세요.
 * 3. 새로운 Student 객체를 생성하고, 모든 필드 값을 출력하세요.
 */