package Lv3;


import java.util.Scanner;

public class Lv3App {
    public static void main(String[] args) {
        ArithmeticCalculator<Integer> arithmeticCalculator = new ArithmeticCalculator<>();
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
            if(operator == '+'){
                ArithmeticCalculator.sum(num1, num2, operator);
            } else if(operator == '-'){
                ArithmeticCalculator.sub(num1, num2, operator);
            } else if(operator == '/'){
                ArithmeticCalculator.div(num1, num2, operator);
            } else if(operator == '*'){
                ArithmeticCalculator.mul(num1, num2, operator);
            }


            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): " );
            String stop = scanner.next();
            if(stop.equals("exit")){
                break;  // exit 입력 시 연산 종료
            }

        }


    }
}
