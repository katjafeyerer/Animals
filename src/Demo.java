public class Demo {
    public static void main(String[] args) {
        Animal fritzi = new Cat("braun", 2, "fritzi");
        fritzi.makeNoise();
        fritzi.walk();

        Bird tweety = new Bird("gelb", 2, "tweety");
        tweety.makeNoise();
        tweety.walk();
        tweety.fly();

        Flyable flyable = tweety;
        flyable.fly();

    }
}
