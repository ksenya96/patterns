package template;

public class StandardComputerBuilder extends ComputerBuilder {
    @Override
    protected void addProcessor() {
        System.out.println("Add processor to standard computer");
    }

    @Override
    protected void setupMotherboard() {
        System.out.println("Setup motherboard to standard computer");
    }

    @Override
    protected void addMotherboard() {
        System.out.println("Add motherboard to standard computer");
    }
}
