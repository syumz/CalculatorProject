package Lv1;

import Lv2.Calculator;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.setResultSave(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);

        // break;로 빠져나오기 전까지 계속 반복
        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt(); // 첫 번째 숫자 입력

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt(); // 두 번째 숫자 입력

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0); // 사칙연산 기호 입력


            // 두 정수 연산
            if (num2 == 0 && operator == '/') {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                // 두 번째 숫자가 0 이고 사칙연산 기호가 / 일 때 계산할 수 없으므로 '입력 될 수 없다'을 출력
            } else {
                int result = calculator.calculate(num1, num2, operator);
                System.out.println("결과: " + result); // 연산 결과 출력
                calculator.getResultSave().add(result);
            }

            // 저장된 연산 결과 값을 보여주고 "yes"을 작성시 가장 먼저 저장된 값 삭제
            System.out.println("저장된 연산 결과 " + calculator.getResultSave());
            calculator.removeResult();

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): " );
            String stop = scanner.next();
            if(stop.equals("exit")){
                break;  // exit 입력 시 연산 종료
            }

        }
    }
}

