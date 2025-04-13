package 패키지; // 패키지 선언

// 다른 패키지의 클래스를 import
import 패키지.util.MathUtil; // 일반 import
import static 패키지.util.Constants.PI; // 정적 import

// 클래스 정의
public class PackageExample {
    public static void main(String[] args) {
        // MathUtil 클래스의 메서드 호출
        int sum = MathUtil.add(10, 20);
        System.out.println("10 + 20 = " + sum);

        // 정적 import를 통해 상수 사용
        System.out.println("원주율: " + PI);

        // MathUtil 클래스의 메서드 호출
        double area = MathUtil.calculateCircleArea(5);
        System.out.println("반지름이 5인 원의 면적: " + area);
    }
}

/*
 * 이론 설명:
 * 1. 패키지란?
 * - 패키지는 클래스와 인터페이스를 그룹화하는 데 사용되는 디렉터리 구조입니다.
 * - 클래스의 충돌을 방지하고, 코드를 논리적으로 분류하여 관리하기 쉽게 만듭니다.
 * - 패키지는 `package` 키워드를 사용하여 선언합니다.
 * - 예: `package 패키지.util;`
 * 
 * 2. 패키지 선언과 구조:
 * - 패키지 이름은 일반적으로 도메인 이름을 반대로 작성하거나, 프로젝트 구조에 따라 작성합니다.
 * - 예: `com.example.project.util`
 * - 패키지 구조는 디렉터리 구조와 일치해야 합니다.
 * - 예: `패키지.util` 패키지는 `패키지` 폴더 아래에 `util` 폴더를 생성하여 관리합니다.
 * 
 * 3. Import 문 사용:
 * - 다른 패키지에 있는 클래스를 사용하려면 `import` 문을 사용해야 합니다.
 * - 예: `import 패키지.util.MathUtil;`
 * - `import` 문을 사용하지 않으면 클래스의 전체 경로를 사용해야 합니다.
 * - 예: `패키지.util.MathUtil.add(10, 20);`
 * 
 * 4. 정적 import:
 * - 클래스의 정적 멤버(필드나 메서드)를 직접 사용할 수 있도록 `import static`을 사용합니다.
 * - 예: `import static 패키지.util.Constants.PI;`
 * - 정적 import를 사용하면 클래스 이름 없이 정적 멤버를 참조할 수 있습니다.
 * - 예: `System.out.println(PI);`
 * 
 * 5. 패키지와 접근 제어자:
 * - `public`: 모든 패키지에서 접근 가능.
 * - `protected`: 같은 패키지 또는 상속받은 클래스에서 접근 가능.
 * - `default`(접근 제어자 없음): 같은 패키지에서만 접근 가능.
 * - `private`: 해당 클래스 내에서만 접근 가능.
 * 
 * 6. 코드 설명:
 * - `패키지.util` 패키지에 `MathUtil`과 `Constants` 클래스를 정의합니다.
 * - `MathUtil` 클래스는 유틸리티 메서드를 제공하며, `Constants` 클래스는 상수를 정의합니다.
 * - `PackageExample` 클래스는 `MathUtil`과 `Constants`를 사용하여 계산 작업을 수행합니다.
 * - `import`와 `import static`를 사용하여 다른 패키지의 클래스와 정적 멤버를 가져옵니다.
 * 
 * 7. 실습 문제:
 * 1) 새로운 패키지 `패키지.shapes`를 생성하고, `Shape` 인터페이스를 정의하세요.
 * 2) `Circle`과 `Rectangle` 클래스를 작성하여 `Shape` 인터페이스를 구현하세요.
 * 3) `패키지.main` 패키지에서 `Shape` 인터페이스와 구현 클래스를 사용하여 도형의 면적을 계산하세요.
 */