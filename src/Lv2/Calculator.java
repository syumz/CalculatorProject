package Lv2;

import java.util.ArrayList;

public class Calculator {

    // 1. 속성
    private ArrayList<Integer> resultSave = new ArrayList<>();

    // 2. 생성자

    // 3. 기능(메서드)
    public int calculate(int num1, int num2, char operator) {
        int result = 0;
        if(operator=='+'){
            result = num1 + num2;
        } else if(operator == '-'){
            result = num1 - num2;
        } else if(operator == '*'){
            result = num1 * num2;
        } else if(operator == '/'){
            result = num1 / num2;
        }
        return result;
    }

    public ArrayList<Integer> getResultSave() {
        return resultSave;
    }

    public void setResultSave(ArrayList<Integer> resultSave) {
        this.resultSave = resultSave;
    }
}
