package mediator;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Mediator mediator = new Mediator();
        mediator.setFan(fan);
        mediator.setPowerSupplier(new PowerSupplier());
        Button button = new Button(mediator);
        System.out.println(fan.isOn()); //false
        button.press();
        System.out.println(fan.isOn()); //true
        button.press();
        System.out.println(fan.isOn()); //false
    }
}
