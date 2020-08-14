package mediator;

public class Mediator {
    private Fan fan;
    private PowerSupplier powerSupplier;

    public void setFan(Fan fan) {
        fan.setMediator(this);
        this.fan = fan;
    }

    public void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}
