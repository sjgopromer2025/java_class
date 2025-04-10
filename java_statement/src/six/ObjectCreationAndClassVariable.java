package six;

public class ObjectCreationAndClassVariable {
    // 클래스 변수 (static 변수)
    // 모든 객체가 공유하는 변수
    private static int objectCount = 0;

    // 인스턴스 변수 (객체별로 독립적인 변수)
    private String name;

    // 생성자 (Constructor)
    public ObjectCreationAndClassVariable(String name) {
        this.name = name;
        objectCount++; // 객체가 생성될 때마다 클래스 변수 증가
    }

    // 인스턴스 메서드
    public String getName() {
        return name;
    }

    // 클래스 메서드 (static 메서드)
    public static int getObjectCount() {
        return objectCount; // 클래스 변수 반환
    }

    // 메인 메서드 (Main Method)
    public static void main(String[] args) {
        // 객체 생성
        ObjectCreationAndClassVariable obj1 = new ObjectCreationAndClassVariable("객체1");
        ObjectCreationAndClassVariable obj2 = new ObjectCreationAndClassVariable("객체2");
        ObjectCreationAndClassVariable obj3 = new ObjectCreationAndClassVariable("객체3");

        // 객체별로 이름 출력
        System.out.println("obj1 이름: " + obj1.getName());
        System.out.println("obj2 이름: " + obj2.getName());
        System.out.println("obj3 이름: " + obj3.getName());

        // 클래스 변수 출력
        System.out.println("생성된 객체 수: " + ObjectCreationAndClassVariable.getObjectCount());
    }
}

/*
 * 이론 설명:
 * 1. 객체 생성:
 * - 객체는 클래스를 기반으로 생성된 인스턴스입니다.
 * - `new` 키워드를 사용하여 객체를 생성합니다.
 * - 생성자는 객체 생성 시 호출되며, 객체의 초기화를 담당합니다.
 * 
 * 2. 클래스 변수 (static 변수):
 * - 클래스 변수는 `static` 키워드를 사용하여 선언됩니다.
 * - 모든 객체가 공유하며, 클래스 자체에 속합니다.
 * - 객체를 생성하지 않고도 클래스 이름으로 접근할 수 있습니다.
 * - 예: `클래스이름.변수이름`
 * 
 * 3. 인스턴스 변수:
 * - 인스턴스 변수는 객체별로 독립적인 값을 가집니다.
 * - 객체가 생성될 때마다 새로운 메모리 공간이 할당됩니다.
 * 
 * 4. 클래스 메서드 (static 메서드):
 * - 클래스 메서드는 `static` 키워드를 사용하여 선언됩니다.
 * - 클래스 변수에 접근하거나, 객체와 무관한 작업을 수행할 때 사용됩니다.
 * - 객체를 생성하지 않고도 클래스 이름으로 호출할 수 있습니다.
 * - 예: `클래스이름.메서드이름()`
 * 
 * 5. 객체와 클래스 변수의 차이:
 * - 객체 변수는 각 객체마다 독립적으로 존재합니다.
 * - 클래스 변수는 모든 객체가 공유하며, 클래스 자체에 속합니다.
 * 
 * 실습 문제:
 * 1. ObjectCreationAndClassVariable 클래스에 추가적인 인스턴스 변수를 선언하고, 이를 설정하고 반환하는 메서드를
 * 작성하세요.
 * 2. 새로운 객체를 생성하고, 모든 객체의 이름과 클래스 변수를 출력하세요.
 */