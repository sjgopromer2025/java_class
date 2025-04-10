package practice.four;

import java.util.Scanner;

public class IfAndSwitchPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. if 문 실습
        // 학생의 점수를 입력받아 학점을 출력하는 프로그램
        System.out.println("점수를 입력하세요 (0 ~ 100):");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("학점: A");
        } else if (score >= 80) {
            System.out.println("학점: B");
        } else if (score >= 70) {
            System.out.println("학점: C");
        } else if (score >= 60) {
            System.out.println("학점: D");
        } else {
            System.out.println("학점: F");
        }

        // 2. switch 문 실습
        // 학생의 학년을 입력받아 해당 학년에 맞는 메시지를 출력하는 프로그램
        System.out.println("\n학년을 입력하세요 (1 ~ 4):");
        int grade = scanner.nextInt();

        switch (grade) {
            case 1:
                System.out.println("1학년: 대학 생활을 시작했군요! 열심히 공부하세요.");
                break;
            case 2:
                System.out.println("2학년: 전공 공부를 시작할 때입니다.");
                break;
            case 3:
                System.out.println("3학년: 취업 준비를 시작해야 할 시기입니다.");
                break;
            case 4:
                System.out.println("4학년: 졸업을 준비하세요! 마지막 학기입니다.");
                break;
            default:
                System.out.println("잘못된 학년을 입력했습니다.");
        }

        scanner.close();
    }
}
/*
 * 1. if문 실습:-
 * 사용자로부터 점수를 입력받습니다 (0 ~ 100 사이의 정수).
 * - 입력받은 점수를 기준으로 학점을 출력합니다:
 * - 90 이상: "학점: A"
 * - 80 이상 90 미만: "학점: B"
 * - 70 이상 80 미만: "학점: C"
 * - 60 이상 70 미만: "학점: D"
 * - 60 미만: "학점: F"
 * 
 * 2. switch 문 실습:
 * - 사용자로부터 학년을 입력받습니다 (1 ~ 4 사이의 정수).
 * - 입력받은 학년에 따라 다음 메시지를 출력합니다:
 * - 1학년: "대학 생활을 시작했군요! 열심히 공부하세요."
 * - 2학년: "전공 공부를 시작할 때입니다."
 * - 3학년: "취업 준비를 시작해야 할 시기입니다."
 * - 4학년: "졸업을 준비하세요! 마지막 학기입니다."
 * - 그 외: "잘못된 학년을 입력했습니다."
 */