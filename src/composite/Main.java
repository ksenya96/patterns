package composite;

public class Main {
    public static void main(String[] args) {
        Box mainBox = new Box();
        mainBox.addItem(new Product(10));
        mainBox.addItem(new Product(15));
        Box box1 = new Box();
        mainBox.addItem(box1);
        box1.addItem(new Product(42));
        box1.addItem(new Product(23));
        Box box2 = new Box();
        box1.addItem(box2);
        box2.addItem(new Product(52));
        box2.addItem(new Product(12));

        System.out.println(mainBox.getPrice()); //154
    }
}
