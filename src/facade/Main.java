package facade;

public class Main {
    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        converter.convert("meow.mp4", "ogg");
    }
}
