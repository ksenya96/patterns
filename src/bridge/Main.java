package bridge;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);
        remote.channelUp();
        System.out.println(remote);

        Radio radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.mute();
        System.out.println(advancedRemote);
    }
}
