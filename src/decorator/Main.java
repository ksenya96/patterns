package decorator;

public class Main {
    public static void main(String[] args) {
        FacebookDecorator facebookDecorator = new FacebookDecorator(new Notifier());
        facebookDecorator.send();

        SlackDecorator slackDecorator = new SlackDecorator(new Notifier());
        slackDecorator.send();

        SmsDecorator smsDecorator = new SmsDecorator(new Notifier());
        smsDecorator.send();
    }
}
