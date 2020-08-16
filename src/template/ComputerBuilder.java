package template;

public abstract class ComputerBuilder {
    public final void buildComputer() {
        addMotherboard();
        setupMotherboard();
        addProcessor();
    }

    protected abstract void addProcessor();

    protected abstract void setupMotherboard();

    protected abstract void addMotherboard();
}
