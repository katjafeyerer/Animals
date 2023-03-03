public class Dog extends Animal{
    public Dog(String color, int countEye, String name) {
        super(color, countEye, name);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " bewegt sich schnell");

    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " macht <<wuff>>");

    }
}
