package designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        CarDescription cd = CarDescription.builder()
                .setColor("black")
                .setProductionYear(2010)
                .build();

        CarDescription cd2 = new CarDescription.CarDescriptionBuilder()
                .setColor("asa")
                .setProducer("sasa")
                .setModel("sasa")
                .setProductionYear(2020)
                .build();

        System.out.println(cd);
        System.out.println(cd2);
    }
}
