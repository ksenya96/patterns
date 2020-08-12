package bridge;

public class Remote {
    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }

    void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    public Device getDevice() {
        return device;
    }

    @Override
    public String toString() {
        return "Remote{" +
                "device=" + device +
                '}';
    }
}
