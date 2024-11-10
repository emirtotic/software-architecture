public class Main {

    public static void main(String[] args) {

        Car car1 = Car.getInstance();
        Car car2 = Car.getInstance();
        Car car3 = Car.getInstance();

        System.out.println("Same hashcode expected");
        System.out.println("Car1 Hashcode: " + car1.hashCode());
        System.out.println("Car2 Hashcode: " + car2.hashCode());
        System.out.println("Car3 Hashcode: " + car3.hashCode());

    }
}