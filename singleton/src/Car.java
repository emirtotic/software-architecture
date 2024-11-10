public class Car {

    private static Car car = null;

    private Car() {
    }

    public static synchronized Car getInstance() {
        if (car == null)
            car = new Car();

        return car;
    }
}