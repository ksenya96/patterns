package bridge;

public class Radio implements Device {
    private static final int MAX_VOLUME = 20;
    private static final int MAX_CHANNEL = 10;
    private boolean enabled;
    private int volume;
    private int channel;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }


    @Override
    public void setVolume(int percent) {
        if (percent < 0) {
            this.volume = 0;
            return;
        }
        if (percent > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
            return;
        }
        this.volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel < 0) {
            this.channel = 0;
            return;
        }
        if (channel > MAX_CHANNEL) {
            this.channel = MAX_CHANNEL;
            return;
        }
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "enabled=" + enabled +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
