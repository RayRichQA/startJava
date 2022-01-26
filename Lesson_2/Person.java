public class Person {
    char sex = 'F';
    String name = "Admin";
    float height = 177.70f;
    float weight = 61.50f;
    int age = 27;

    void go() {
        System.out.println("Я иду.");
    }

    void sit() {
        System.out.println("Я сижу.");
    }

    void run() {
        System.out.println("Я бегу.");
    }

    void speak() {
        System.out.println("Я говорю.");
    }

    boolean learnJava() {
        System.out.println("Я учу Java.");
        return true;
    }
}