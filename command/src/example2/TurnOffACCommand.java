package example2;

public class TurnOffACCommand implements Command {

    private AC ac;

    public TurnOffACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.off();
    }
}
