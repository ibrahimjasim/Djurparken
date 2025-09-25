public class Shark extends Animal implements Swimmable{

    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "gör ett bubblande ljud under vattnet");
    }

    @Override
    public void eat() {
        System.out.println(name + "äter allt möjligt.");
    }

    @Override
    public Object Fly() {
        return null;
    }

    @Override
    public void swim() {
        System.out.println(name + "simmar kraftfullt i havet.");
    }
}
