public class Frog extends Animal{
    public Frog(String color, int countEye, String name) {
        super(color, countEye, name);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " bewegt sich hüpfend");

    }

    @Override
    public void makeNoise() {

    }
}
