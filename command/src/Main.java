public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        // Kreiramo komande za uključivanje i isključivanje svetla
        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);

        // Koristimo daljinski upravljač za pokretanje komandi
        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton(); // Očekivani ispis: "Light is ON"

        remote.setCommand(turnOff);
        remote.pressButton(); // Očekivani ispis: "Light is OFF"
    }
}
