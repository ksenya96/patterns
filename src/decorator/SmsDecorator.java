package decorator;

public class SmsDecorator extends BaseDecorator {

    public SmsDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        System.out.println("Send sms");
        getNotifier().send("Hello from sms");
    }
}
