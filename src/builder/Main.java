package builder;

public class Main {
    public static void main(String[] args) {
        Builder carBuilder = new CarBuilder();
        Car car = carBuilder
                .setEngine("Двигатель 100 л.с.")
                .setGsp("Наличие GSP")
                .setSeats("5 сидений")
                .setTripComputer("Современный бортовой компьютер")
                .build();
        System.out.println(car);
    }
}
