package template;

public class HighEndComputerBuilder extends ComputerBuilder {
    @Override
    protected void addProcessor() {
        System.out.println("Add processor to high end computer");
    }

    @Override
    protected void setupMotherboard() {
        System.out.println("Setup motherboard to high end computer");
    }

    @Override
    protected void addMotherboard() {
        System.out.println("Add motherboard to high end computer");
    }
}
