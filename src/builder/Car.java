package builder;

public class Car {
    private String seats;
    private String engine;
    private String tripComputer;
    private String gsp;

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGsp(String gsp) {
        this.gsp = gsp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats='" + seats + '\'' +
                ", engine='" + engine + '\'' +
                ", tripComputer='" + tripComputer + '\'' +
                ", gsp='" + gsp + '\'' +
                '}';
    }
}
