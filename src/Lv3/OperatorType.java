package Lv3;

public enum OperatorType {
    SUM('+'),
    SUB('-'),
    DIV('/'),
    MUL('*');

    private char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }
};
