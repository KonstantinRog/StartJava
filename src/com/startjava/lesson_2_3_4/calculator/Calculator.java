package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void setExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        firstNumber = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        secondNumber = Integer.parseInt(partsExpression[2]);
    }

    public int calculate(String expression) {
        setExpression(expression);
        switch(sign) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Ошибка вычислений");
                    return 0;
                } else {
                    return firstNumber / secondNumber;
                }
            case '^':
                return (int) Math.pow(firstNumber, secondNumber);
            case '%':
                return (int) (Math.IEEEremainder(firstNumber, secondNumber));
            default:
                System.out.println("Ошибка вычислений");
                return 0;
        }
    }
}