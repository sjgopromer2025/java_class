package 콘솔입출력;

public class ConsoleIOTheory {
    public static void main(String[] args) {
        System.out.println("콘솔 입출력 이론 파일입니다. 이 파일은 실행되지 않으며, 이론 정리를 위해 작성되었습니다.");
    }
}

/*
 * 이론 설명: 콘솔 입출력
 * 1. 콘솔 입출력이란?
 * - 콘솔(Console)은 텍스트 기반의 입력과 출력을 처리하는 환경을 의미합니다.
 * - 콘솔 입출력은 사용자와 프로그램 간의 상호작용을 가능하게 합니다.
 * - 자바에서는 `System.in`, `System.out`, `System.err`를 사용하여 콘솔 입출력을 처리합니다.
 * 
 * 2. 주요 클래스와 메서드:
 * 1) 입력 처리:
 * - `Scanner` 클래스:
 * - `nextLine()`: 한 줄의 문자열 입력.
 * - `nextInt()`: 정수 입력.
 * - `nextDouble()`: 실수 입력.
 * - `close()`: 스캐너를 닫아 리소스를 해제.
 * - `Console` 클래스:
 * - `readLine()`: 문자열 입력.
 * - `readPassword()`: 비밀번호 입력(화면에 표시되지 않음).
 * 
 * 2) 출력 처리:
 * - `System.out` 객체:
 * - `print(String s)`: 문자열 출력(줄바꿈 없음).
 * - `println(String s)`: 문자열 출력 후 줄바꿈.
 * - `printf(String format, Object... args)`: 형식화된 문자열 출력.
 * 
 * 3. 콘솔 입출력의 특징:
 * - 간단한 데이터 입력과 출력에 적합.
 * - 사용자와의 상호작용을 위한 기본적인 방법.
 * - GUI 기반의 입출력보다 구현이 간단하지만, 복잡한 작업에는 적합하지 않음.
 * 
 * 4. 사용 사례:
 * - 사용자로부터 데이터를 입력받아 처리.
 * - 프로그램 실행 중 상태나 결과를 출력.
 * - 비밀번호와 같은 민감한 데이터를 입력받을 때 `Console` 클래스 사용.
 * 
 * 5. 주의사항:
 * - `Scanner`를 사용할 때 입력 데이터의 형식을 확인하여 예외를 방지.
 * - `Console` 클래스는 일부 IDE 환경에서 지원되지 않을 수 있음.
 */