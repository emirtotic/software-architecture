package example2;

public class TurnOffTVCommand implements Command {

    private TV tv;

    public TurnOffTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}


