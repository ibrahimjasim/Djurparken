public class Eagle extends Animal implements Flyable{
    public Eagle(String name, int age ) {
        super(name, age);

    }

    @Override
    public void makeSound() {
        System.out.println(name + "skriar högt!");
    }

    @Override
    public void eat() {
        System.out.println(name + "äter smådjur");
    }

    @Override
    public Object Fly() {
        return null;
    }


    @Override
    public void fly() {
        System.out.println(name +  "flyger högt i skyn");
    }
}
