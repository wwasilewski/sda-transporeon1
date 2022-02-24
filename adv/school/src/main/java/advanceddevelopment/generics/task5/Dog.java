package advanceddevelopment.generics.task5;

public class Dog extends Animal {

    private String type;

    public Dog(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void makeSound() {
        System.out.println("hau-hau");
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.getName() +
                ", type='" + type + '\'' +
                '}';
    }
}

