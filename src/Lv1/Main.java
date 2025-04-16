package Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stop = " ";

        while (!(stop.equals("exit"))) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char BasicArithmetic = scanner.next().charAt(0);

            int result = 0;

            if (secondNum == 0 && BasicArithmetic == '/') {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                if (BasicArithmetic == '+') {
                    result = firstNum + secondNum;
                } else if (BasicArithmetic == '-') {
                    result = firstNum - secondNum;
                } else if (BasicArithmetic == '*') {
                    result = firstNum * secondNum;
                } else if (BasicArithmetic == '/') {
                    result = firstNum / secondNum;
                }
                System.out.println("결과: " + result);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            stop = scanner.next();

        }
    }
}

