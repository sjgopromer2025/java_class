package 연산자;

public class UnaryOperators {
    public static void main(String[] args) {
        // 단항 연산자 예제
        int a = 10;
        int b = -a; // 부호 변경
        System.out.println("a: " + a + ", b: " + b); // a: 10, b: -10

        boolean isTrue = true;
        System.out.println("isTrue: " + isTrue); // true
        System.out.println("!isTrue: " + !isTrue); // false (논리 NOT 연산자)

        int c = 5;
        System.out.println("c++: " + c++); // 5 (후위 증가)
        System.out.println("++c: " + ++c); // 7 (전위 증가)

    }
}