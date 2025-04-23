package Lv3;

import java.util.function.BiFunction;

public enum OperatorType {
    SUM('+', (num1, num2) -> num1 + num2),
    SUB('-', (num1, num2) -> num1 - num2),
    DIV('/', (num1, num2) -> num1 / num2),
    MUL('*', (num1, num2) -> num1 * num2);

    // 1. 속성
    private final char operator;
    private final BiFunction<Double, Double, Double> result;

    // 2. 생성자
    OperatorType(char operator, BiFunction<Double, Double, Double> result) {
        this.operator = operator;
        this.result = result;
    }

    // 3. 기능
    public Double calculate(Double num1, Double num2){
        return this.result.apply(num1, num2);
    }

}
