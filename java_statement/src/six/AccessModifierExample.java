package six;

public class AccessModifierExample {
    public static void main(String[] args) {
        // 접근제한자의 역할 이해
        // 1. 접근제한자는 클래스, 메서드, 변수의 접근 범위를 제어합니다.
        // 2. public, private, protected, default가 있습니다.

        Account account = new Account("홍길동", 1000);
        System.out.println("계좌 소유자: " + account.getOwner());
        System.out.println("잔액: " + account.getBalance());

        account.deposit(500); // 입금
        System.out.println("잔액 (입금 후): " + account.getBalance());

        account.withdraw(300); // 출금
        System.out.println("잔액 (출금 후): " + account.getBalance());
    }
}

// Account 클래스 정의
class Account {
    private String owner; // 계좌 소유자
    private int balance; // 잔액

    // 생성자
    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Getter 메서드
    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    // 입금 메서드
    public void deposit(int amount) {
        balance += amount;
    }

    // 출금 메서드
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= amount;
        }
    }
}

/*
 * 이론 설명:
 * 1. 접근제한자(Access Modifier):
 * - 접근제한자는 클래스, 메서드, 변수의 접근 범위를 제어합니다.
 * - 종류:
 * 1) public: 모든 클래스에서 접근 가능.
 * 2) private: 해당 클래스 내에서만 접근 가능.
 * 3) protected: 같은 패키지 또는 상속받은 클래스에서 접근 가능.
 * 4) default: 같은 패키지 내에서만 접근 가능.
 * 
 * 2. 캡슐화(Encapsulation):
 * - 데이터를 보호하고, 외부에서 직접 접근하지 못하도록 제한합니다.
 * - Getter와 Setter 메서드를 통해 데이터를 안전하게 접근하고 수정합니다.
 */