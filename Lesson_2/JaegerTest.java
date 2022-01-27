public class JaegerTest {
    public static void main(String[] args) {
        Jaeger lew = new Jaeger();
        lew.setName("Lew");
        lew.setCategory("Peaceful Robot");
        lew.setHeight(272.7f);
        lew.setWeight(110.65f);
        lew.setStrength(8);
        lew.setArmor(7);
        Jaeger argo = new Jaeger();
        argo.setName("Argo");
        argo.setCategory("Peaceful Robot");
        argo.setHeight(215.0f);
        argo.setWeight(86.33f);
        argo.setStrength(9);
        argo.setArmor(5);
        System.out.println("Robot 1 name: " + lew.getName());
        System.out.println("Robot 1 category: " + lew.getCategory());
        System.out.println("Robot 1 height: " + lew.getHeight());
        System.out.println("Robot 1 weight: " + lew.getWeight());
        System.out.println("Robot 1 strength: " + lew.getStrength());
        System.out.println("Robot 1 armor: " + lew.getArmor());
        System.out.println("Robot 2 name: " + argo.getName());
        System.out.println("Robot 2 category: " + argo.getCategory());
        System.out.println("Robot 2 height: " + argo.getHeight());
        System.out.println("Robot 2 weight: " + argo.getWeight());
        System.out.println("Robot 2 strength: " + argo.getStrength());
        System.out.println("Robot 2 armor: " + argo.getArmor());
        if(lew.drift()) {
            lew.dancing();
        }
        System.out.println("Argo: " + argo.scanning());
        lew.reflector();
        lew.setWeight(96.4f);
        System.out.println("Lew's weight after reflecting: " + lew.getWeight());
        System.out.println("Argo says: " + argo.firestorm());
    }
}