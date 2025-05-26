좋습니다! 이번엔 또 다른 흥미롭고 현실적인 클래스를 하나 더 준비해드릴게요. 이번 주제는 **영화(Movie)** 입니다. 학생들이 관심을 가질 수 있는 주제이고, 다양한 데이터 유형(문자열, 정수, 실수, 논리값)을 골고루 활용할 수 있습니다.

---

## 🎬 **Movie 클래스 실습 문제**

---

### 🔰 **\[문제 1] Movie 클래스 정의**

다음 정보를 저장할 수 있는 `Movie` 클래스를 정의하세요.

- 제목(title): 문자열
- 감독(director): 문자열
- 개봉 연도(year): 정수
- 평점(rating): 실수 (10점 만점)
- 상영 여부(isNowPlaying): 논리값(boolean)

생성자를 통해 값을 초기화하고, 각 값을 반환하는 **getter 메서드**를 작성하세요.

---

### 🔰 **\[문제 2] 영화 객체 여러 개 생성 및 출력**

- `Movie` 객체를 3편 이상 생성하고, `for`문을 사용하여 각 영화의 정보를 출력하세요.

---

### 🔰 **\[문제 3] 총 등록된 영화 수 출력 (클래스 변수)**

- 등록된 영화 수를 관리하는 `static` 클래스 변수를 선언하고, 생성자에서 자동으로 증가시키세요.
- 전체 영화 수를 반환하는 클래스 메서드를 작성하고 출력하세요.

---

### 🔰 **\[문제 4] 현재 상영 여부 판별**

- `isNowPlaying` 값이 true인 경우 `"현재 상영 중"`을, 아니면 `"상영 종료"`를 출력하는 메서드를 작성하고, 모든 영화에 대해 호출하세요.

---

### 🔰 **\[문제 5] 평점 9.0 이상인 영화만 출력**

- `rating >= 9.0`인 영화만 필터링하여 출력하세요.

---

## ✅ 전체 예제 코드: `MovieTest.java`

```java
class Movie {
    private String title;
    private String director;
    private int year;
    private double rating;
    private boolean isNowPlaying;

    private static int totalMovies = 0;

    public Movie(String title, String director, int year, double rating, boolean isNowPlaying) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.isNowPlaying = isNowPlaying;
        totalMovies++;
    }

    // Getter 메서드
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public boolean isNowPlaying() {
        return isNowPlaying;
    }

    public static int getTotalMovies() {
        return totalMovies;
    }

    // 상영 여부 출력
    public void checkNowPlaying() {
        if (isNowPlaying) {
            System.out.println("-> 현재 상영 중");
        } else {
            System.out.println("-> 상영 종료");
        }
    }
}
```

```java
public class MovieTest {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie("서울의 봄", "김성수", 2023, 9.3, true);
        movies[1] = new Movie("해리 포터", "크리스 콜럼버스", 2001, 8.5, false);
        movies[2] = new Movie("이터널 선샤인", "미셸 공드리", 2004, 9.1, false);
        movies[3] = new Movie("듄: 파트2", "드니 빌뇌브", 2024, 9.0, true);

        System.out.println("🎥 영화 목록:");
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("제목: %s | 감독: %s | 연도: %d | 평점: %.1f | 상영 여부: %s\n",
                    movies[i].getTitle(), movies[i].getDirector(),
                    movies[i].getYear(), movies[i].getRating(),
                    movies[i].isNowPlaying() ? "O" : "X");
            movies[i].checkNowPlaying();
            System.out.println();
        }

        System.out.println("🎞️ 총 등록된 영화 수: " + Movie.getTotalMovies() + "편");

        System.out.println("\n⭐ 평점 9.0 이상인 영화:");
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating() >= 9.0) {
                System.out.println(movies[i].getTitle() + " (" + movies[i].getRating() + ")");
            }
        }
    }
}
```

---

## 🎯 학습 포인트 요약

| 개념             | 설명                                  |
| ---------------- | ------------------------------------- |
| 다양한 멤버 변수 | 문자열, 정수, 실수, 논리값 모두 포함  |
| 생성자           | 5개 인자 초기화                       |
| 조건문           | `isNowPlaying`과 `rating`에 따른 분기 |
| 클래스 변수      | 전체 영화 수 관리 (`static`)          |
| 반복문           | 객체 배열 탐색 및 출력                |

---

### 💡 관련 아이디어

이 `Movie` 예제는 수업 후 과제로도 활용하기 좋으며, 다음과 같이 확장 가능합니다:

- 평점 평균 계산 기능 추가
- 상영 중인 영화만 출력
- `Scanner`를 통한 사용자 입력 방식으로 전환

원하신다면 `BankAccount`, `Course`, `Game`, `Recipe` 같은 다른 클래스로도 실습 예제를 구성해 드릴 수 있습니다!
