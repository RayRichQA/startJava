public class Jaeger {
    private String name;
    private String category;
    private float height;
    private float weight;
    private int strength;
    private int armor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    boolean drift() {
        return true;
    }

    void dancing() {
        System.out.println("Robot is dancing.");
    }

    String scanning() {
        return "scanning";
    }

    void reflector() {
        System.out.println("Пока я парю, моя защита активна.");
    }

    String firestorm() {
        return "BLAST";
    }
}