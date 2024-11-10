public class CarBuilder {

    String make;
    String model;
    int year;
    String color;
    String engineType;
    int airbags;

    public CarBuilder(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public CarBuilder setAirbags(int airbags) {
        this.airbags = airbags;
        return this;
    }

    public Car build() {
        return new Car(this);
    }
}
