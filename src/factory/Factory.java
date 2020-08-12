package factory;

import java.util.Objects;

public class Factory {
    private Transport getTransport(String type) {
        if ("road".equals(type)) {
            return new Truck();
        }
        if ("sea".equals(type)) {
            return new Ship();
        }
        return null;
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        Objects.requireNonNull(factory.getTransport("road")).deliver();
        Objects.requireNonNull(factory.getTransport("sea")).deliver();
    }
}
