package advanceddevelopment.generics.task5;

import java.util.Arrays;

public class PetHouse<T extends Animal> {

    private T[] animals;

    public PetHouse(T[] animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "PetHouse{" +
                "animals=" + Arrays.toString(animals) +
                '}';
    }

    public String showAnimals() {
        return Arrays.toString(animals);
    }
}
