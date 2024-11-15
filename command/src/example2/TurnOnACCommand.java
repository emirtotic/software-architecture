package example2;

public class TurnOnACCommand implements Command {

    private AC ac;

    public TurnOnACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.on();
    }
}
