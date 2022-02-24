package advanceddevelopment.generics.task5;

public class Task5Main {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Azor", "York"),
                new Cat("Klakier", 7)
        };

        PetHouse<Animal> petHouse = new PetHouse<>(animals);
        System.out.println(petHouse.showAnimals());
    }
}
