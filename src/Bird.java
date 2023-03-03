public class Bird extends Animal implements Flyable{
    public Bird(String color, int countEye, String name) {
        super(color, countEye, name);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " wackelt auf den Beinen");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " macht ein <<biiiiiep>>");

    }

    @Override
    public void fly() {
        System.out.println(getName()+ " fliegt im Käfig herum");
    }
}
