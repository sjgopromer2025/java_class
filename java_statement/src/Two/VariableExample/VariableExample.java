package Two.VariableExample;

public class VariableExample {

    public static void main(String[] args) {
        // 변수 선언
        int age;
        double height;
        String name;

        // 변수 저장
        age = 25;
        height = 175.5;
        name = "홍길동";

        // 변수 선언과 동시에 저장
        boolean isStudent = true;
        char grade = 'A';

        // 출력
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("이름: " + name);
        System.out.println("학생 여부: " + isStudent);
        System.out.println("학점: " + grade);
    }
}
