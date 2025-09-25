public class Cow  extends Animal {
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " säger: Muuuuu!");
    }

    @Override
    public void eat() {
        System.out.println(name + " äter gräss");
    }

    @Override
    public Object Fly() {
        return null;
    }

}
