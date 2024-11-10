public class VehicleFactory {

    public Vehicle createVehicle(String type) {
        if ("SUV".equalsIgnoreCase(type)) {
            return new SUV();
        } else if ("Car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("Truck".equalsIgnoreCase(type)) {
            return new Truck();
        }
        return null;
    }

}
