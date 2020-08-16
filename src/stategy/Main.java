package stategy;

public class Main {
    public static void main(String[] args) {
        int a = 4, b = 8;
        Context context = new Context();
        context.setStrategy(new AddStrategy());
        System.out.println(context.executeStrategy(a, b)); //12
        context.setStrategy(new SubtractStrategy());
        System.out.println(context.executeStrategy(a, b)); //-4
        context.setStrategy(new MultiplyStrategy());
        System.out.println(context.executeStrategy(a, b)); //32
    }
}
