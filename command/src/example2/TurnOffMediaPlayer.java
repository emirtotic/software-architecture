package example2;

public class TurnOffMediaPlayer implements Command {

    private MediaPlayer mediaPlayer;

    public TurnOffMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void execute() {
        mediaPlayer.off();
    }
}
