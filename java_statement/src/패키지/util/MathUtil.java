package 패키지.util; // 패키지 선언

// 유틸리티 클래스 정의
public class MathUtil {
    // 두 정수의 합을 계산하는 메서드
    public static int add(int a, int b) {
        return a + b;
    }

    // 원의 면적을 계산하는 메서드
    public static double calculateCircleArea(double radius) {
        return Constants.PI * radius * radius; // Constants 클래스의 상수 사용
    }
}