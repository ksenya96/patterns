package builder;

public class CarBuilder implements Builder {

    private final Car car;

    public CarBuilder() {
        car = new Car();
    }

    @Override
    public CarBuilder setSeats(String seats) {
        car.setSeats(seats);
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder setTripComputer(String tripComputer) {
        car.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public CarBuilder setGsp(String gsp) {
        car.setGsp(gsp);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
