public class PhoneDisplay implements Observer {

    private Subject weatherStation;

    public PhoneDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update(int temperature) {
        System.out.println("Phone Display: Current temperature is " + temperature + "°C");
    }
}
