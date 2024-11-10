public class EmailNotifier implements Observer {

    private Subject weatherStation;

    public EmailNotifier(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update(int temperature) {
        System.out.println("Email Notifier: New temperature alert! It's now " + temperature + "°C");
    }
}