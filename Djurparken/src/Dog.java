public class Dog extends Animal implements Swimmable, Trainable{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "säger voff voff!");
    }

    @Override
    public void eat() {
        System.out.println(name + "äter hundmat");
    }

    @Override
    public Object Fly() {
        return null;
    }


    @Override
    public void swim() {
        System.out.println(name + "simmar glatt i vattnet");
    }

    public void performTrick() {
        System.out.println(name + "gör en rolig rulle!");
    }


}
