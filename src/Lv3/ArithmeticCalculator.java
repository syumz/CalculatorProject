package Lv3;

public class ArithmeticCalculator <T>{
    // 1. 속성
    private T result;

    // 2. 생성자

    // 3. 기능
    // 연산
    public static <T extends Number> void sum(T num1, T num2, char operator) {
        OperatorType sum = OperatorType.SUM;
        System.out.println("결과 : " + sum.calculate(((Integer) num1).doubleValue(), ((Integer) num2).doubleValue()));
    }
    public static <T extends Number> void sub(T num1, T num2, char operator) {
        OperatorType sub = OperatorType.SUB;
        System.out.println("결과 : " + sub.calculate(((Integer) num1).doubleValue(), ((Integer) num2).doubleValue()));
    }
    public static <T extends Number> void div(T num1, T num2, char operator) {
        OperatorType div = OperatorType.DIV;
        System.out.println("결과 : " + div.calculate(((Integer) num1).doubleValue(), ((Integer) num2).doubleValue()));
    }
    public static <T extends Number> void mul(T num1, T num2, char operator) {
        OperatorType mul = OperatorType.MUL;
        System.out.println("결과 : " + mul.calculate(((Integer) num1).doubleValue(), ((Integer) num2).doubleValue()));
    }


}


