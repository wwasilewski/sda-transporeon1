/*
Create class CarDescription that will contain following information about car: colour, production year,
mileage, producer, model. The class should provide builder for creating objects.
*/

package designpatterns.builder;

public class CarDescription {

    private String color;
    private int productionYear;
    private int mileage;
    private String producer;
    private String model;

    private CarDescription(String color, int productionYear, int mileage, String producer, String model) {
        this.color = color;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.producer = producer;
        this.model = model;
    }

    static CarDescriptionBuilder builder() {
        return new CarDescriptionBuilder();
    }

    @Override
    public String toString() {
        return "CarDescription{" +
                "color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", mileage=" + mileage +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public static class CarDescriptionBuilder {
        private String color;
        private int productionYear;
        private int mileage;
        private String producer;
        private String model;

        CarDescriptionBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        CarDescriptionBuilder setProductionYear(int productionYear) {
            this.productionYear = productionYear;
            return this;
        }

        CarDescriptionBuilder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        CarDescriptionBuilder setProducer(String producer) {
            this.producer = producer;
            return this;
        }

        CarDescriptionBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        CarDescription build() {
            return new CarDescription(color, productionYear, mileage, producer, model);
        }
    }
}
