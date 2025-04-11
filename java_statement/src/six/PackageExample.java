package six;

// 다른 패키지의 클래스를 가져오기 위해 import 사용
import java.util.Scanner; // 자바 표준 라이브러리의 Scanner 클래스
import six.utils.MathUtils; // 같은 프로젝트 내의 다른 패키지에 있는 클래스

public class PackageExample {
    public static void main(String[] args) {
        // Scanner 클래스 사용 (java.util 패키지)
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 숫자를 입력하세요:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // MathUtils 클래스의 정적 메서드 호출
        int sum = MathUtils.add(num1, num2);
        int product = MathUtils.multiply(num1, num2);

        System.out.println("두 숫자의 합: " + sum);
        System.out.println("두 숫자의 곱: " + product);

        scanner.close();
    }
}

/*
 * 이론 설명:
 * 1. 패키지란?
 * - 패키지는 클래스와 인터페이스를 그룹화하는 데 사용되는 디렉토리 구조입니다.
 * - 클래스 파일을 논리적으로 묶어 관리하고, 이름 충돌을 방지합니다.
 * - 패키지는 `package` 키워드를 사용하여 선언합니다.
 * 
 * 2. 패키지의 주요 특징:
 * - 클래스 파일을 계층적으로 관리할 수 있습니다.
 * - 동일한 이름의 클래스를 다른 패키지에서 사용할 수 있습니다.
 * - 접근 제어를 통해 클래스와 멤버의 가시성을 제어할 수 있습니다.
 * 
 * 3. 패키지 선언:
 * - 소스 파일의 첫 번째 줄에 `package` 키워드를 사용하여 패키지를 선언합니다.
 * - 예: `package six;`
 * 
 * 4. import 문:
 * - 다른 패키지에 있는 클래스를 사용하려면 `import` 문을 사용해야 합니다.
 * - 예: `import java.util.Scanner;`
 * - 같은 패키지에 있는 클래스는 `import` 없이 사용할 수 있습니다.
 * 
 * 5. 기본 패키지:
 * - 패키지를 선언하지 않으면 기본 패키지에 속하게 됩니다.
 * - 기본 패키지는 작은 프로젝트에서만 사용하며, 권장되지 않습니다.
 * 
 * 6. 패키지의 디렉토리 구조:
 * - 패키지는 디렉토리 구조와 매핑됩니다.
 * - 예: `package six.utils;`는 `six/utils` 디렉토리에 해당합니다.
 * 
 * 7. 접근 제어와 패키지:
 * - `public`: 모든 패키지에서 접근 가능.
 * - `protected`: 같은 패키지 또는 상속받은 클래스에서 접근 가능.
 * - `default`(접근 제한자 없음): 같은 패키지에서만 접근 가능.
 * - `private`: 해당 클래스 내에서만 접근 가능.
 * 
 * 실습 문제:
 * 1. `six.utils` 패키지에 MathUtils 클래스를 작성하고, 덧셈과 곱셈 메서드를 구현하세요.
 * 2. `six` 패키지에서 MathUtils 클래스를 사용하여 두 숫자의 합과 곱을 계산하세요.
 * 3. 다른 패키지에 있는 클래스를 import하여 활용해 보세요.
 */