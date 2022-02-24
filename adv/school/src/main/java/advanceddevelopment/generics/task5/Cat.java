package advanceddevelopment.generics.task5;

public class Cat extends Animal {

    private int numberOfLives;

    public Cat(String name, int numberOfLives) {
        super(name);
        this.numberOfLives = numberOfLives;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    @Override
    public void makeSound() {
        System.out.println("miauuu");
    }

    @Override
    public String toString() {
        return "Cat{" +
                super.getName() +
                ", numberOfLives=" + numberOfLives +
                '}';
    }
}
