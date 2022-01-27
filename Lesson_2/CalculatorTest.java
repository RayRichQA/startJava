import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean isContinue = true;

        while(isContinue) {
            System.out.println("Введите первое число: ");
            calculator.setFirstNumber(scanner.nextInt());
            System.out.println("Введите знак математической операции: ");
            calculator.setMathOperation(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setSecondNumber(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Результат вычислений: ");
            System.out.println(calculator.getResult(calculator.getFirstNumber(), calculator.getMathOperation(), calculator.getSecondNumber()));
            while(true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                String userContinue = scanner.nextLine();
                if(userContinue.equals("no")) {
                    scanner.close();
                    isContinue = false;
                    break;
                } else if(userContinue.equals("yes")) {
                    break;
                }
            }
        }
    }
}