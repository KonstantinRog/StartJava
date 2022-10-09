public class Jaeger {

    private String modelName;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String origin, float height, float weight, int speed, int armor) {
        this.modelName = modelName;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.armor = armor;
    }

    public void go() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void hit() {
        System.out.println("Бьет");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }
}