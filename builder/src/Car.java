public class Car {

    private String make;
    private String model;
    private int year;
    private String color;
    private String engineType;
    private int airbags;

    Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.engineType = builder.engineType;
        this.airbags = builder.airbags;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year +
                ", color=" + color + ", engineType=" + engineType + ", airbags=" + airbags + "]";
    }
}
