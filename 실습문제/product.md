좋습니다! 이번에는 `Car` 클래스가 아닌 다른 현실적인 예제를 사용해서 **학생들이 흥미를 가질 수 있고, 객체와 메서드, static 개념, 조건문/반복문까지 익힐 수 있는 실습 예제**를 만들어보겠습니다.

---

## 🏪 **\[예제 주제] 상품(Product) 관리 프로그램**

학생들이 마트, 쇼핑, 온라인몰 등의 맥락에서 익숙하게 느낄 수 있는 **"상품(Product)"** 클래스를 활용한 예제입니다.

---

## ✅ 실습 문제: `Product` 클래스 기반

### 🔰 **\[1단계] Product 클래스 기본 구성**

**문제 1.**

- 상품의 `이름(name)`, `가격(price)`을 저장하는 인스턴스 변수를 선언하세요.
- 두 값을 초기화할 수 있는 생성자를 작성하세요.
- 각각의 값을 반환하는 인스턴스 메서드(getName, getPrice)를 작성하세요.

---

### 🔰 **\[2단계] 상품 객체 여러 개 생성 및 출력**

**문제 2.**

- 상품 객체를 3개 생성하세요.
- `for`문을 사용하여 각 상품의 이름과 가격을 출력하세요.

---

### 🔰 **\[3단계] 전체 상품 수를 관리**

**문제 3.**

- 전체 상품 개수를 저장하는 클래스 변수(`static`)를 선언하세요.
- 생성자에서 상품이 생성될 때마다 자동으로 상품 수가 증가하도록 하세요.
- 전체 상품 수를 반환하는 클래스 메서드를 작성하고 출력하세요.

---

### 🔰 **\[4단계] 할인 대상 상품 판별 (조건문)**

**문제 4.**

- 상품 가격이 **10,000원 이상이면 할인 대상**으로 간주하여 "할인 대상 상품입니다."라고 출력하세요.
- 그렇지 않으면 "정상가 상품입니다."라고 출력하세요.
- 이 기능을 메서드로 작성하고, 모든 상품에 대해 실행하세요.

---

### 🔰 **\[5단계] 저렴한 상품만 필터링 출력 (조건 + 반복문)**

**문제 5.**

- 가격이 **5,000원 이하인 상품만 출력**하세요.

---

## ✅ 전체 코드 예시 (`ProductTest.java`)

```java
class Product {
    private String name;
    private int price;

    private static int totalCount = 0;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        totalCount++;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void checkDiscount() {
        if (price >= 10000) {
            System.out.println("-> 할인 대상 상품입니다.");
        } else {
            System.out.println("-> 정상가 상품입니다.");
        }
    }

    public static int getTotalCount() {
        return totalCount;
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("무선마우스", 12000);
        products[1] = new Product("USB 메모리", 4500);
        products[2] = new Product("노트북 스탠드", 9800);

        System.out.println("🛒 상품 목록:");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("상품명: %s, 가격: %d원\n",
                    products[i].getName(), products[i].getPrice());
            products[i].checkDiscount();
            System.out.println();
        }

        System.out.println("📦 전체 상품 수: " + Product.getTotalCount() + "개");

        System.out.println("\n💡 5,000원 이하 저렴한 상품:");
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() <= 5000) {
                System.out.println(products[i].getName());
            }
        }
    }
}
```

---

## 🎯 학습 요소 요약

| 단계  | 주요 개념             | 설명             |
| ----- | --------------------- | ---------------- |
| 1단계 | 클래스 선언, 생성자   | 기본 구조 설계   |
| 2단계 | 배열, 반복문          | 여러 객체 다루기 |
| 3단계 | 클래스 변수 및 메서드 | `static` 이해    |
| 4단계 | 조건문 `if`           | 로직 분기 처리   |
| 5단계 | 조건 + 반복           | 필터링 논리 구현 |

---

이 예제는 실생활 쇼핑 맥락이라 **학생들의 몰입도와 이해도를 높이기 좋은 주제**입니다.
비슷한 방식으로 `Book`, `Movie`, `Pet`, `BankAccount` 등으로도 예제를 확장할 수 있어요. 필요하시면 다른 예제도 제작해 드릴게요!
