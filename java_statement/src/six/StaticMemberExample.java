package six;

public class StaticMemberExample {
    // 정적 변수 (static 변수)
    // 모든 객체가 공유하는 변수
    private static int totalInstances = 0;

    // 인스턴스 변수 (객체별로 독립적인 변수)
    private String name;

    // 정적 상수 (static final)
    // 변경할 수 없는 상수 값
    public static final String COMPANY_NAME = "Java Company";

    // 생성자 (Constructor)
    public StaticMemberExample(String name) {
        this.name = name;
        totalInstances++; // 객체가 생성될 때마다 정적 변수 증가
    }

    // 인스턴스 메서드
    public String getName() {
        return name;
    }

    // 정적 메서드 (static 메서드)
    public static int getTotalInstances() {
        return totalInstances; // 정적 변수 반환
    }

    // 메인 메서드 (Main Method)
    public static void main(String[] args) {
        // 정적 상수 출력
        System.out.println("회사 이름: " + StaticMemberExample.COMPANY_NAME);

        // 객체 생성
        StaticMemberExample obj1 = new StaticMemberExample("객체1");
        StaticMemberExample obj2 = new StaticMemberExample("객체2");

        // 객체별로 이름 출력
        System.out.println("obj1 이름: " + obj1.getName());
        System.out.println("obj2 이름: " + obj2.getName());

        // 정적 메서드를 통해 총 객체 수 출력
        System.out.println("총 생성된 객체 수: " + StaticMemberExample.getTotalInstances());
    }
}

/*
 * 이론 설명:
 * 1. 정적 멤버 (static 멤버):
 * - 정적 변수와 정적 메서드를 포함합니다.
 * - `static` 키워드를 사용하여 선언됩니다.
 * - 클래스에 속하며, 모든 객체가 공유합니다.
 * - 객체를 생성하지 않고도 클래스 이름으로 접근할 수 있습니다.
 * 
 * 2. 정적 변수 (static 변수):
 * - 클래스에 속하는 변수로, 모든 객체가 공유합니다.
 * - 객체마다 독립적인 값을 가지는 인스턴스 변수와는 다릅니다.
 * - 클래스 이름으로 접근 가능합니다.
 * - 예: `클래스이름.변수이름`
 * 
 * 3. 정적 메서드 (static 메서드):
 * - 클래스에 속하는 메서드로, 객체를 생성하지 않고 호출할 수 있습니다.
 * - 정적 변수에 접근하거나, 객체와 무관한 작업을 수행할 때 사용됩니다.
 * - 정적 메서드에서는 인스턴스 변수나 인스턴스 메서드에 직접 접근할 수 없습니다.
 * - 예: `클래스이름.메서드이름()`
 * 
 * 4. 정적 상수 (static final):
 * - `static`과 `final` 키워드를 함께 사용하여 선언된 상수입니다.
 * - 프로그램 실행 중 값이 변경되지 않습니다.
 * - 예: `public static final double PI = 3.14159;`
 * 
 * 5. 정적 멤버의 주요 특징:
 * - 메모리 효율성을 높이고, 객체 간 데이터를 공유할 때 유용합니다.
 * - 객체와 독립적으로 동작하며, 클래스 자체에 속합니다.
 * 
 * 실습 문제:
 * 1. StaticMemberExample 클래스에 추가적인 정적 변수(예: 총 호출된 메서드 수)를 선언하고, 이를 관리하는 정적 메서드를
 * 작성하세요.
 * 2. 새로운 객체를 생성하고, 정적 변수와 정적 메서드를 활용하여 데이터를 출력하세요.
 * 3. 정적 상수를 활용하여 프로그램의 고정된 값을 출력하세요.
 */