package state;

public interface PackageState {
    void prev(Package pack);

    void next(Package pack);

    void printStatus();
}
