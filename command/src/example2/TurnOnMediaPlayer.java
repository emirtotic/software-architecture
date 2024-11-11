package example2;

public class TurnOnMediaPlayer implements Command {

    private MediaPlayer mediaPlayer;

    public TurnOnMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void execute() {
        mediaPlayer.on();
    }
}
