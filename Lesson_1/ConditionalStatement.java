public class ConditionalStatement {
    public static void main(String[] args) {
        byte age = (byte) 99;
        boolean isMale = false;
        float height = 160f;
        char nameFirstLetter = 'D';

        if(age > 20) {
            System.out.println("Теперь можно всё.");
        }

        if(isMale) {
            System.out.println("Мужчина.");
        }

        if(!isMale) {
            System.out.println("Женщина.");
        }

        if (height < 1.80) {
            System.out.println("Не ел растишку.");
        } else {
            System.out.println("Прирождённый баскетболист.");
        }

        if (nameFirstLetter == 'M') {
            System.out.println("Марк Твен?");            
        } else if(nameFirstLetter == 'I') {
            System.out.println("Iron?");
        } else {
            System.out.println("Недопустимый вариант.");
        }
    }
}