public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 58;
        int userNumber = 77;
        while(userNumber != computerNumber) {
            if(userNumber < computerNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                userNumber++;
            } else {
                System.out.println("Данное число больше того, что загадал компьютер");
                userNumber--;
            }
        }
        System.out.println("Поздравляю, число угадано!");
    }
}