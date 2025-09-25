import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Skapa en lista med olika djur
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Buddy", 3));
        animals.add(new Cat("Maeow", 1));
        animals.add(new Eagle("Birdy", 5));
        animals.add(new Shark("Big White", 8));
        animals.add(new Cow("Dots", 4));
        animals.add(new Dog("Missy", 0));

        // Loopa igenom listan och anropa metoder
        for (Animal animal : animals) {
            System.out.println("--- " + animal.getName() + " (" + animal.getClass().getSimpleName() + ")---");

            // Kolla om djuret är en baby eller vuxen
            if(animal.isBaby()){
                System.out.println(animal.getName() + " är en baby!");
            }else {
                System.out.println(animal.getName() + "är en fullvuxen");
            }

            //Anropa djurets metoder
            animal.makeSound();
            animal.eat();

            // Kolla om djuret kan simma
            if (animal instanceof Swimmable){
                ((Swimmable) animal).swim();
            }

            // Kolla om djuret kan flyga
            if (animal instanceof Flyable){
                ((Flyable) animal).fly();
            }

            // Kolla om djuret är träningsbart
            if (animal instanceof Trainable){
                ((Trainable) animal).performTrick();
            }

            System.out.println();
        }
    }

}