package state;

public class Main {
    public static void main(String[] args) {
        Package pack = new Package();
        pack.printStatus();
        pack.nextState();
        pack.printStatus();
        pack.nextState();
        pack.printStatus();
        pack.prevState();
        pack.printStatus();
    }
}
