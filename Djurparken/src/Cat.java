public class Cat extends Animal implements Trainable{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "säger: Meow!");
    }

    @Override
    public void eat() {
        System.out.println(name + "äter katmat");
    }

    @Override
    public Object Fly() {
        return null;
    }

    @Override
    public void performTrick() {
        System.out.println(name + "jagar en laserpekare!");
    }
}
