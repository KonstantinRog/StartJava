public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        int result = 0;
        switch(sign) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Ошибка вычислений");
                    return;
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
            case '^':
                result = 1;
                for (int i = secondNumber; i != 0; i--) {
                    result *= firstNumber;
                }
                break;
            case '%':
                if (secondNumber == 0) {
                    System.out.println("Ошибка вычислений");
                    return;
                } else {
                    result = firstNumber % secondNumber;
                }
                break;
            default:
                System.out.println("Ошибка вычислений");
                return;
        }
        System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
    }
}