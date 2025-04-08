package three;

public class TernaryOperator {
    public static void main(String[] args) {
        // 삼항 연산자 예제
        int a = 10;
        int b = 20;

        String result = (a > b) ? "a가 b보다 크다" : "a가 b보다 작거나 같다";
        System.out.println("결과: " + result); // a가 b보다 작거나 같다

        int max = (a > b) ? a : b; // a와 b 중 더 큰 값
        System.out.println("더 큰 값: " + max); // 20

        
    }
}