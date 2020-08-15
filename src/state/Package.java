package state;

public class Package {
    private PackageState state = new OrderedState();

    public void prevState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    public void setState(PackageState state) {
        this.state = state;
    }
}
