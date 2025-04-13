package 클래스와객체;

// 어노테이션 사용 예제
public class AnnotationExample {

    // @Override 어노테이션: 메서드 재정의를 나타냄
    @Override
    public String toString() {
        return "AnnotationExample 클래스의 toString 메서드입니다.";
    }

    // @Deprecated 어노테이션: 더 이상 사용되지 않는 메서드를 나타냄
    @Deprecated
    public void oldMethod() {
        System.out.println("이 메서드는 더 이상 사용되지 않습니다.");
    }

    // @SuppressWarnings 어노테이션: 경고를 무시하도록 설정
    @SuppressWarnings("unchecked")
    public void uncheckedWarningExample() {
        // 경고를 무시하는 코드
        System.out.println("경고를 무시하는 예제입니다.");
    }

    // 메인 메서드 (Main Method)
    public static void main(String[] args) {
        AnnotationExample example = new AnnotationExample();

        // @Override 어노테이션이 적용된 메서드 호출
        System.out.println(example.toString());

        // @Deprecated 어노테이션이 적용된 메서드 호출
        example.oldMethod();

        // @SuppressWarnings 어노테이션이 적용된 메서드 호출
        example.uncheckedWarningExample();
    }
}

/*
 * 이론 설명:
 * 1. 어노테이션(Annotation)이란?
 * - 어노테이션은 코드에 메타데이터를 추가하는 데 사용됩니다.
 * - 컴파일러에게 정보를 제공하거나, 런타임 시 특정 동작을 수행하도록 힌트를 제공합니다.
 * - 어노테이션은 `@` 기호로 시작하며, 클래스, 메서드, 필드, 매개변수 등에 적용할 수 있습니다.
 * 
 * 2. 자주 사용되는 기본 어노테이션:
 * 1) @Override:
 * - 메서드가 부모 클래스 또는 인터페이스의 메서드를 재정의하고 있음을 나타냅니다.
 * - 컴파일러가 재정의 여부를 확인하여 오류를 방지합니다.
 * 2) @Deprecated:
 * - 더 이상 사용되지 않는 코드임을 나타냅니다.
 * - 해당 코드 사용 시 컴파일 경고가 발생합니다.
 * 3) @SuppressWarnings:
 * - 컴파일러 경고를 무시하도록 설정합니다.
 * - 예: `@SuppressWarnings("unchecked")`
 * 
 * 3. 어노테이션의 장점:
 * - 코드의 가독성과 유지보수성을 향상시킵니다.
 * - 컴파일러와 개발 도구가 코드를 분석하고 처리하는 데 도움을 줍니다.
 * - 런타임 시 특정 동작을 수행하도록 설정할 수 있습니다.
 * 
 * 4. 사용자 정의 어노테이션:
 * - 개발자가 직접 어노테이션을 정의하여 사용할 수 있습니다.
 * - 예: `@interface CustomAnnotation { ... }`
 * 
 * 5. 실습 문제:
 * 1) @Override 어노테이션을 사용하여 부모 클래스의 메서드를 재정의하세요.
 * 2) @Deprecated 어노테이션을 사용하여 더 이상 사용되지 않는 메서드를 작성하고 호출하세요.
 * 3) 사용자 정의 어노테이션을 작성하고, 이를 클래스나 메서드에 적용해 보세요.
 */