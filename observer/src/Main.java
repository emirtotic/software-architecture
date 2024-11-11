public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        EmailNotifier emailNotifier = new EmailNotifier(weatherStation);

        phoneDisplay.update(20);
        emailNotifier.update(30);

        weatherStation.setTemperature(25);




    }
}