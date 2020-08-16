package template;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new StandardComputerBuilder();
        computerBuilder.buildComputer();
        computerBuilder = new HighEndComputerBuilder();
        computerBuilder.buildComputer();
    }
}
