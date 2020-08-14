package mediator;

public class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }
}
