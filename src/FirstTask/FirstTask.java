package FirstTask;

import java.util.Stack;

public class FirstTask {

    public static int evaluateExpression(String expression){
        Stack<Character> operators = new Stack<>();
        Stack<Integer> numbers = new Stack<>();

        for(int i=0;i<expression.length();i++){
            char currentChar = expression.charAt(i);
            if(currentChar == ' ') continue;
            if(Character.isDigit(currentChar)){
                int number = 0;
                while(i < expression.length() && Character.isDigit(expression.charAt(i))){
                    number = number * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                numbers.push(number);
            }
            else if(currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/'){
                while(!operators.empty() && precedence(operators.peek()) >= precedence(currentChar)){
                    numbers.push(evaluateOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(currentChar);
            }
        }
        while(!operators.empty()){
            numbers.push(evaluateOperation(operators.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    private static int precedence(char operator) {
        if(operator == '*' || operator == '/') return 2;
        if(operator == '+' || operator == '-') return 1;
        return 0;
    }

    private static int evaluateOperation(char op, int a, int b){
        if(op == '+') return a + b;
        if(op == '-') return a - b;
        if(op == '*') return a * b;
        if(op == '/' && b != 0) return a / b;
        else if(b == 0) throw new UnsupportedOperationException("Can't Divide By Zero!!!");
        return 0;
    }
}
