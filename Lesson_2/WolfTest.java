public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "Male";
        wolf.name = "Arny";
        wolf.weight = 37.47f;
        wolf.age = 5;
        wolf.color = "Green";
        System.out.println(wolf.sex);
        System.out.println(wolf.name);
        System.out.println(wolf.weight);
        System.out.println(wolf.age);
        System.out.println(wolf.color);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}