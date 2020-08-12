package bridge;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    void mute() {
        getDevice().setVolume(0);
    }
}
