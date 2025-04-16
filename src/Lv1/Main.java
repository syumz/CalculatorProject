package Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stop = " "; // exit 입력 시 종료 하기 위한 변수 생성

        while (!(stop.equals("exit"))) { // stop 변수값에 exit 입력 되기 전까지 연산 반복
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt(); // 첫 번째 숫자 입력

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt(); // 두 번째 숫자 입력

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0); // 사칙연산 기호 입력

            int result = 0; // 결과 변수 생성

            if (num2 == 0 && operator == '/') {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                // 두 번째 숫자가 0 이고 사칙연산 기호가 / 일 때 계산할 수 없으므로 '입력 될 수 없다'을 출력
            } else {
                if (operator == '+') {
                    result = num1 + num2; // 사칙연산 기호가 + 일 때 덧셈
                } else if (operator == '-') {
                    result = num1 - num2; // 사칙연산 기호가 - 일 때 덧셈
                } else if (operator == '*') {
                    result = num1 * num2; // 사칙연산 기호가 * 일 때 덧셈
                } else if (operator == '/') {
                    result = num1 / num2; // 사칙연산 기호가 / 일 때 덧셈
                }
                System.out.println("결과: " + result); // 연산 결과 출력
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            stop = scanner.next(); // exit 입력 시 연산 종료

        }
    }
}

