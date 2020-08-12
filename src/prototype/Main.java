package prototype;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4, 5, "red", 8);

        System.out.println("Circles equal: " + circle.equals(circle.clone()));

        Rectangle rectangle = new Rectangle(2, 0, "green", 4, 12);

        System.out.println("Rectangles equal: " + rectangle.equals(rectangle.clone()));
    }
}
