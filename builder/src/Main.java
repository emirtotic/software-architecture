public class Main {

    public static void main(String[] args) {
        Car car = new CarBuilder("Toyota", "Camry")
                .setYear(2020)
                .setColor("Red")
                .setEngineType("Hybrid")
                .setAirbags(6)
                .build();

        System.out.println(car);
    }
}
