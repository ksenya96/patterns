package decorator;

public class SlackDecorator extends BaseDecorator {

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        System.out.println("Send message");
        getNotifier().send("Hello from Slack");
    }
}
