package commands;

public interface CommandHandler<T> {
    void handle(T command);
}
