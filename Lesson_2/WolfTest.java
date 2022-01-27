public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("Male");
        wolf.setName("Arny");
        wolf.setWeight(37.47f);
        wolf.setAge(5);
        wolf.setColor("Green");
        System.out.println(wolf.getSex());
        System.out.println(wolf.getName());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}