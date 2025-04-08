package three;

public class OperatorPrecedence {
    public static void main(String[] args) {
        // 연산 방향과 우선순위 예제
        int result = 10 + 2 * 5; // 곱셈이 덧셈보다 우선
        System.out.println("10 + 2 * 5 = " + result); // 20

        int resultWithParentheses = (10 + 2) * 5; // 괄호로 우선순위 변경
        System.out.println("(10 + 2) * 5 = " + resultWithParentheses); // 60

        int x = 5;
        int y = 10;
        int z = x++ + --y; // 후위 증가와 전위 감소
        System.out.println("x: " + x + ", y: " + y + ", z: " + z); // x: 6, y: 9, z: 14
    }
}


