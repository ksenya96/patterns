package decorator;

public class FacebookDecorator extends BaseDecorator {

    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        System.out.println("Send message");
        getNotifier().send("Hello from Facebook");
    }
}
