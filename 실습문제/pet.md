좋습니다! 이번에는 실생활에서 친숙하고 학생들의 흥미를 끌 수 있는 주제인 **반려동물(Pet)** 클래스를 기반으로 실습 문제와 전체 예제 코드를 만들어 드릴게요. `멤버 변수`, `생성자`, `인스턴스 메서드`, `클래스 변수`, `조건문`, `반복문` 등을 모두 활용할 수 있도록 설계했습니다.

---

## 🐶 **Pet 클래스 실습 문제**

### 🔰 **\[문제 1] Pet 클래스 정의**

다음 정보를 저장하는 `Pet` 클래스를 정의하세요.

- 이름(name): 문자열
- 종류(type): 문자열 (예: 개, 고양이 등)
- 나이(age): 정수
- 몸무게(weight): 실수
- 중성화 여부(isNeutered): 논리값(boolean)

위 정보를 생성자를 통해 초기화하세요.

각 값을 반환하는 인스턴스 메서드(getName, getType 등)를 작성하세요.

---

### 🔰 **\[문제 2] 반려동물 여러 마리 생성 및 출력**

- `Pet` 객체를 3마리 이상 생성하고, `for`문을 사용하여 모든 정보를 출력하세요.

---

### 🔰 **\[문제 3] 전체 등록된 반려동물 수 출력 (클래스 변수)**

- 전체 반려동물 수를 관리하는 `static` 클래스 변수를 선언하고, 생성자에서 증가시키세요.
- 전체 수를 반환하는 클래스 메서드를 작성하세요.

---

### 🔰 **\[문제 4] 중성화 여부 출력 (조건문)**

- `isNeutered` 값에 따라 `"중성화 완료"` 또는 `"중성화 필요"`를 출력하는 메서드를 작성하고, 모든 객체에 대해 실행하세요.

---

### 🔰 **\[문제 5] 몸무게가 5kg 이상인 동물만 출력**

- `weight >= 5.0`인 반려동물만 따로 출력하세요.

---

## ✅ 전체 예제 코드: `PetTest.java`

```java
class Pet {
    private String name;
    private String type;
    private int age;
    private double weight;
    private boolean isNeutered;

    private static int totalPets = 0;

    public Pet(String name, String type, int age, double weight, boolean isNeutered) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
        this.isNeutered = isNeutered;
        totalPets++;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isNeutered() {
        return isNeutered;
    }

    public static int getTotalPets() {
        return totalPets;
    }

    // 중성화 여부 출력
    public void checkNeuteringStatus() {
        if (isNeutered) {
            System.out.println("-> 중성화 완료");
        } else {
            System.out.println("-> 중성화 필요");
        }
    }
}
```

```java
public class PetTest {
    public static void main(String[] args) {
        Pet[] pets = new Pet[4];
        pets[0] = new Pet("콩이", "개", 2, 4.8, true);
        pets[1] = new Pet("야옹이", "고양이", 5, 3.2, false);
        pets[2] = new Pet("초코", "개", 1, 5.5, true);
        pets[3] = new Pet("나비", "고양이", 7, 6.3, false);

        System.out.println("🐾 반려동물 정보 목록:");
        for (int i = 0; i < pets.length; i++) {
            System.out.printf("이름: %s | 종류: %s | 나이: %d살 | 몸무게: %.1fkg | 중성화 여부: %s\n",
                    pets[i].getName(), pets[i].getType(), pets[i].getAge(),
                    pets[i].getWeight(), pets[i].isNeutered() ? "O" : "X");
            pets[i].checkNeuteringStatus();
            System.out.println();
        }

        System.out.println("📋 총 반려동물 수: " + Pet.getTotalPets() + "마리");

        System.out.println("\n⚖️ 몸무게가 5kg 이상인 반려동물:");
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].getWeight() >= 5.0) {
                System.out.println(pets[i].getName() + " (" + pets[i].getType() + ")");
            }
        }
    }
}
```

---

## 🎯 학습 포인트 요약

| 구분          | 개념                                          | 설명 |
| ------------- | --------------------------------------------- | ---- |
| 인스턴스 변수 | `name`, `type`, `age`, `weight`, `isNeutered` |      |
| 클래스 변수   | `static int totalPets`                        |      |
| 생성자        | 다섯 개의 값 초기화                           |      |
| 메서드        | getter / 상태 판단 / static 반환 메서드       |      |
| 조건문        | `if-else`로 중성화 여부 판별                  |      |
| 반복문        | 객체 배열 탐색 및 필터링                      |      |

---

이 `Pet` 예제는 감성적으로도 접근이 좋고 멤버 변수 다양화, 논리형(`boolean`) 활용까지 포함되어 **클래스 종합 문제로 훌륭한 실습**이 됩니다.
필요하시면 `Scanner`를 활용한 사용자 입력 방식이나 `toString()` 오버라이딩 버전도 제공해드릴 수 있어요.
