package chain;

public class ATMDispenseChain {
    private DispenseChain c1;

    public ATMDispenseChain() {
        c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
        int amount = 150;
        atmDispenseChain.c1.dispense(new Currency(amount));
    }
}
