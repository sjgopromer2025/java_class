좋습니다! 이번에는 **클래스 실습 예제로 `Book` 클래스**를 활용하여, **멤버 변수의 개수를 더 늘리고**, 실생활에 맞는 조건문, 반복문, 클래스 변수 등도 함께 활용하는 예제를 만들어드릴게요.

---

## 📘 **Book 클래스 실습 문제**

### 🔰 **\[문제 1] Book 클래스 정의**

* 다음 정보를 저장할 수 있도록 `Book` 클래스를 정의하세요.

  * 제목(title): 문자열
  * 저자(author): 문자열
  * 가격(price): 정수
  * 출판 연도(year): 정수
  * 장르(genre): 문자열

* 위 정보를 생성자를 통해 초기화할 수 있도록 하세요.

* 각각의 값을 반환하는 인스턴스 메서드(getTitle, getAuthor 등)를 작성하세요.

---

### 🔰 **\[문제 2] 책 객체 여러 개 생성 및 정보 출력**

* `Book` 객체를 3권 이상 생성하고, `for`문을 사용하여 모든 책의 정보를 출력하세요.

---

### 🔰 **\[문제 3] 전체 등록 책 수 출력 (클래스 변수)**

* 등록된 전체 책의 수를 저장하는 `static` 변수와 클래스 메서드를 만들어, 전체 책 수를 출력하세요.

---

### 🔰 **\[문제 4] 출판 연도 기준으로 신간 여부 판별 (조건문)**

* 출판 연도가 **2020년 이후**인 경우 `"신간입니다"`를 출력하고, 아니면 `"구간입니다"`를 출력하는 메서드를 작성하세요.

---

### 🔰 **\[문제 5] 특정 장르 책 필터링 출력**

* 장르가 `"소설"`인 책만 따로 출력하도록 하세요.

---

## ✅ 전체 코드 예시 (`BookTest.java`)

```java
class Book {
    private String title;
    private String author;
    private int price;
    private int year;
    private String genre;

    private static int totalBooks = 0;

    public Book(String title, String author, int price, int year, String genre) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.genre = genre;
        totalBooks++;
    }

    // Getter 메서드
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    // 신간 판별 메서드
    public void checkNewArrival() {
        if (year >= 2020) {
            System.out.println("-> 신간입니다.");
        } else {
            System.out.println("-> 구간입니다.");
        }
    }
}

public class BookTest {
    public static void main(String[] args) {
        // Book 객체 배열
        Book[] books = new Book[4];
        books[0] = new Book("자바의 정석", "남궁성", 35000, 2018, "IT");
        books[1] = new Book("불편한 편의점", "김호연", 14000, 2021, "소설");
        books[2] = new Book("토지", "박경리", 20000, 2005, "소설");
        books[3] = new Book("이것이 자바다", "신용권", 38000, 2023, "IT");

        System.out.println("📚 책 정보 목록:");
        for (int i = 0; i < books.length; i++) {
            System.out.printf("제목: %s | 저자: %s | 가격: %d원 | 출판년도: %d | 장르: %s\n",
                    books[i].getTitle(), books[i].getAuthor(), books[i].getPrice(),
                    books[i].getYear(), books[i].getGenre());
            books[i].checkNewArrival();
            System.out.println();
        }

        System.out.println("📖 총 등록된 책 수: " + Book.getTotalBooks() + "권");

        System.out.println("\n🔍 [소설 장르 책 목록]");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getGenre().equals("소설")) {
                System.out.println(books[i].getTitle() + " (" + books[i].getAuthor() + ")");
            }
        }
    }
}
```

---

## 🎯 학습 포인트 정리

| 구분     | 내용                                     |
| ------ | -------------------------------------- |
| 클래스 구조 | 멤버 변수 5개 활용 (문자열 3개, 정수 2개)            |
| 생성자    | 모든 값을 초기화                              |
| 메서드    | 인스턴스 메서드, static 클래스 메서드, 조건 판별 메서드 포함 |
| 반복문    | 객체 배열 탐색                               |
| 조건문    | 출판연도/장르 필터링                            |

---

이 예제는 실생활에 가깝고 멤버변수가 5개 이상 포함되어 있어 클래스 구조에 익숙해지는 데 아주 좋습니다.
필요하시면 확장 버전(예: `Scanner` 입력 추가, 가격 평균 계산 등)도 제작해 드릴 수 있습니다!
