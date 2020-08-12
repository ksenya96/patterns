package decorator;

public abstract class BaseDecorator {
    private Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public abstract void send();

    public Notifier getNotifier() {
        return notifier;
    }
}
