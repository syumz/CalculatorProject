package Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNum = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNum = scanner.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        char BasicArithmetic = scanner.next().charAt(0);
    }
}
