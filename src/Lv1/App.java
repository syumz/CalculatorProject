package Lv1;

import Lv2.Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        for(;;) { // break;로 빠져나오기 전까지 계속 반복
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt(); // 첫 번째 숫자 입력

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt(); // 두 번째 숫자 입력

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0); // 사칙연산 기호 입력



            if (num2 == 0 && operator == '/') {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");

            } else {
                int result = calculator.calculate(num1, num2, operator);
                calculator.resultSave.add(result);
                System.out.println(result);

            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String stop = scanner.next();
            if(stop.equals("exit")){
                break;  // exit 입력 시 연산 종료
            }

        }
    }
}

