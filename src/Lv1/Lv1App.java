package Lv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lv1App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        while(true) {
            while (true) {// break;로 빠져나오기 전까지 계속 반복
                try {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    num1 = scanner.nextInt(); // 첫 번째 숫자 입력

                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = scanner.nextInt();
                    break;// 두 번째 숫자 입력 \

                } catch (InputMismatchException e) {
                    System.out.println("정수만 입력 가능합니다. 다시 입력해주세요.");
                    scanner.nextLine(); // nextLine()을 써줘야 버퍼에 남아있는 값을 없애기 때문에 사용
                }
            }
            System.out.print("사칙연산 기호를 입력하세요('+, -, *, /'): ");
            char operator = scanner.next().charAt(0); // 사칙연산 기호 입력

            // 사칙연산 이외의 값 입력시 실행
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.print("사칙연산 기호만 입력 가능합니다. 다시 입력해주세요. : ");
                operator = scanner.next().charAt(0);
            }

            int result = 0; // 결과 변수 생성

            // 두 정수 연산
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
            String stop = scanner.next();
            if(stop.equals("exit")){
                break;  // exit 입력 시 연산 종료
            }

        }
    }
}