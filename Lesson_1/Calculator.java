public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 8;
        int secondNumber = 5;
        if(firstNumber > 0 && secondNumber > 0) {
            char mathOperation = '%';
            int result = 0;
            if(mathOperation == '+') {
                result = firstNumber + secondNumber;
            } else if(mathOperation == '-') {
                result = firstNumber - secondNumber;
            } else if(mathOperation == '*') {
                result = firstNumber * secondNumber;
            } else if(mathOperation == '/') {
                result = firstNumber / secondNumber;
            } else if(mathOperation == '^') {
                result = firstNumber;
                for(int i = 1; i < secondNumber; i++) {
                    result *= firstNumber;
                }
            } else if(mathOperation == '%') {
                result = firstNumber % secondNumber;
            } else {
                System.out.println("Выберите подходящую математическую операцию.");
            }
            System.out.println(result);
        } else {
            System.out.println("Введите положительные числа.");
        }
    }
}