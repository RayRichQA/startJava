public class ConditionalStatement {
    public static void main(String[] args) {
        byte age = 99;

        if(age > 20) {
            System.out.println("Теперь можно всё.");
        }

        boolean isMale = false;

        if(isMale) {
            System.out.println("Мужчина.");
        }

        if(!isMale) {
            System.out.println("Женщина.");
        }

        float height = 1.60f;

        if(height < 1.80) {
            System.out.println("Не ел растишку.");
        } else {
            System.out.println("Прирождённый баскетболист.");
        }

        char nameFirstLetter = 'D';

        if(nameFirstLetter == 'M') {
            System.out.println("Марк Твен?");            
        } else if(nameFirstLetter == 'I') {
            System.out.println("Iron?");
        } else {
            System.out.println("Недопустимый вариант.");
        }
    }
}