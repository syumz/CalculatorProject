package Lv2;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void removeResult(){
        System.out.print("가장 먼저 저장된 연산 결과를 지우시겠습니까? (yes 입력 시 삭제): ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if(answer.equals("yes")){
            getResultSave().remove(0);
        }
    }

}
