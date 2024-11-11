package example2;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        AC ac = new AC();
        MediaPlayer mediaPlayer = new MediaPlayer();

        Command turnOnTV = new TurnOnTVCommand(tv);
        Command turnOffTV = new TurnOffTVCommand(tv);

        Command turnOnAC = new TurnOnACCommand(ac);
        Command turnOffAC = new TurnOffACCommand(ac);

        Command mediaPlayerOn = new TurnOnMediaPlayer(mediaPlayer);
        Command mediaPlayerOff = new TurnOffMediaPlayer(mediaPlayer);

        UniversalRemote remote = new UniversalRemote();

        remote.setCommand(turnOnTV);
        remote.pressButton();

        remote.setCommand(turnOffTV);
        remote.pressButton();

        remote.setCommand(turnOnAC);
        remote.pressButton();

        remote.setCommand(turnOffAC);
        remote.pressButton();

        remote.setCommand(mediaPlayerOn);
        remote.pressButton();

        remote.setCommand(mediaPlayerOff);
        remote.pressButton();
    }
}
