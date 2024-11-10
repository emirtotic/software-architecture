public class Main {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle suv = factory.createVehicle("SUV");
        Vehicle truck = factory.createVehicle("Truck");
        Vehicle car = factory.createVehicle("car");

        System.out.println("1. Centralizovano kreiranje objekata: \nUmesto da eksplicitno instanciramo Suv, Sedan, ili Truck u main metodi, sada samo pozivamo createVehicle metod u VehicleFactory klasi.\n" +
                "\n2. Fleksibilnost: \nLako možemo dodati nove tipove vozila u budućnosti jednostavnim dodavanjem novih klasa i ažuriranjem VehicleFactory, bez izmene main metode.");


    }


}