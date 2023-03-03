public abstract class Animal {

    private String color;
    private int countEye;
    private String name;

    public Animal(String color, int countEye, String name) {
        this.color = color;
        this.countEye = countEye;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getCountEye() {
        return countEye;
    }

    public String getName() {
        return name;
    }

    public abstract void  walk();

    public abstract void  makeNoise();
}
