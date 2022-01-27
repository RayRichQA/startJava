public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char mathOperation;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public int getResult(int firstNumber, char mathOperation, int secondNumber) {
        int result = 0;
        if(firstNumber > 0 && secondNumber > 0) {
            switch(mathOperation) {
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
                    result = firstNumber / secondNumber;
                    break;
                case '^':
                    result = firstNumber;
                    for(int i = 1; i < secondNumber; i++) {
                        result *= firstNumber;
                    }
                    break;
                case '%':
                    result = firstNumber % secondNumber;
                    break;
            }
        } else {
            System.out.println("Введите положительные числа.");
        }
    return result;
    }
}