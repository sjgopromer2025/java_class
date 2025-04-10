package practice.six;

public class StaticAndFinalPractice {
    // 정적 변수 (static 변수)
    // 모든 객체가 공유하는 변수
    private static int totalProducts = 0;

    // 정적 상수 (static final)
    // 변경할 수 없는 고정된 값
    public static final double TAX_RATE = 0.1; // 세율 (10%)

    // 인스턴스 변수 (객체별로 독립적인 변수)
    private String productName;
    private double price;

    // 생성자 (Constructor)
    public StaticAndFinalPractice(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // 객체가 생성될 때마다 정적 변수 증가
    }

    // 인스턴스 메서드
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithTax() {
        // 정적 상수를 사용하여 세금 포함 가격 계산
        return price + (price * TAX_RATE);
    }

    // 정적 메서드 (static 메서드)
    public static int getTotalProducts() {
        return totalProducts; // 정적 변수 반환
    }

    // 메인 메서드 (Main Method)
    public static void main(String[] args) {
        // 객체 생성
        StaticAndFinalPractice product1 = new StaticAndFinalPractice("노트북", 1000.0);
        StaticAndFinalPractice product2 = new StaticAndFinalPractice("스마트폰", 800.0);
        StaticAndFinalPractice product3 = new StaticAndFinalPractice("태블릿", 600.0);

        // 각 제품의 정보 출력
        System.out.println("제품 1: " + product1.getProductName() + ", 가격: " + product1.getPrice() + ", 세금 포함 가격: "
                + product1.getPriceWithTax());
        System.out.println("제품 2: " + product2.getProductName() + ", 가격: " + product2.getPrice() + ", 세금 포함 가격: "
                + product2.getPriceWithTax());
        System.out.println("제품 3: " + product3.getProductName() + ", 가격: " + product3.getPrice() + ", 세금 포함 가격: "
                + product3.getPriceWithTax());

        // 총 제품 수 출력
        System.out.println("\n총 생성된 제품 수: " + StaticAndFinalPractice.getTotalProducts());

        // 정적 상수 출력
        System.out.println("세율: " + StaticAndFinalPractice.TAX_RATE * 100 + "%");
    }
}

/*
 * 문제 내용:
 * 1. 정적 변수와 정적 상수를 활용하여 제품 정보를 관리하는 프로그램을 작성하세요.
 * - 각 제품의 이름과 가격을 저장하는 인스턴스 변수를 선언하세요.
 * - 생성자를 통해 제품 정보를 초기화하고, 객체가 생성될 때마다 총 제품 수를 증가시키는 정적 변수를 관리하세요.
 * - 세율을 나타내는 정적 상수를 선언하고, 이를 사용하여 세금 포함 가격을 계산하는 메서드를 작성하세요.
 * 
 * 2. 새로운 제품 객체를 생성하고, 각 제품의 이름, 가격, 세금 포함 가격을 출력하세요.
 * 3. 총 제품 수를 출력하세요.
 * 4. 세율을 출력하세요.
 * 
 * 추가 실습:
 * 1. 제품의 카테고리를 나타내는 정적 상수(예: "전자제품")를 추가하고, 이를 출력하세요.
 * 2. 정적 메서드를 작성하여 모든 제품의 총 가격(세금 포함)을 계산하고 출력하세요.
 */