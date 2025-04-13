package practice.클래스와객체;

public class ClassAndMemberPractice {
    // 클래스 변수 (static 변수)
    // 모든 객체가 공유하는 변수
    private static int totalStudents = 0;

    // 인스턴스 변수 (객체별로 독립적인 변수)
    private String name;
    private int age;

    // 생성자 (Constructor)
    public ClassAndMemberPractice(String name, int age) {
        this.name = name;
        this.age = age;
        totalStudents++; // 객체가 생성될 때마다 클래스 변수 증가
    }

    // 인스턴스 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 클래스 메서드 (static 메서드)
    public static int getTotalStudents() {
        return totalStudents; // 클래스 변수 반환
    }

    // 메인 메서드 (Main Method)
    public static void main(String[] args) {
        // 객체 생성
        ClassAndMemberPractice student1 = new ClassAndMemberPractice("홍길동", 20);
        ClassAndMemberPractice student2 = new ClassAndMemberPractice("이순신", 22);
        ClassAndMemberPractice student3 = new ClassAndMemberPractice("유관순", 19);

        // 객체별로 이름과 나이 출력
        System.out.println("학생 1 이름: " + student1.getName() + ", 나이: " + student1.getAge());
        System.out.println("학생 2 이름: " + student2.getName() + ", 나이: " + student2.getAge());
        System.out.println("학생 3 이름: " + student3.getName() + ", 나이: " + student3.getAge());

        // 클래스 변수 출력
        System.out.println("총 학생 수: " + ClassAndMemberPractice.getTotalStudents());
    }
}

/*
 * 문제 내용:
 * 1. 클래스와 클래스 멤버를 활용하여 학생 정보를 관리하는 프로그램을 작성하세요.
 * - 학생의 이름과 나이를 저장하는 인스턴스 변수를 선언하세요.
 * - 생성자를 통해 학생 정보를 초기화하세요.
 * - 학생의 이름과 나이를 반환하는 인스턴스 메서드를 작성하세요.
 * - 총 학생 수를 관리하는 클래스 변수를 선언하고, 이를 반환하는 클래스 메서드를 작성하세요.
 * 
 * 2. 새로운 학생 객체를 생성하고, 모든 학생의 이름과 나이를 출력하세요.
 * 3. 총 학생 수를 출력하세요.
 * 4. 추가적으로, 학생의 학년을 저장하는 인스턴스 변수를 추가하고, 이를 설정하고 반환하는 메서드를 작성하세요.
 */