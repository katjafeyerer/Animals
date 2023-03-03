public class Cat extends Animal{
    public Cat(String color, int countEye, String name) {
        super(color, countEye, name);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " bewegt sich langsam");

    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " macht <<miau>>");

    }
}
