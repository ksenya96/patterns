package builder;

public interface Builder {
    CarBuilder setSeats(String seats);

    CarBuilder setEngine(String engine);

    CarBuilder setTripComputer(String tripComputer);

    CarBuilder setGsp(String gsp);

    Car build();
}
