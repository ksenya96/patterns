package memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor("hello", 4, 5, 6);
        System.out.println(editor);
        Command command = new Command(editor);
        command.makeBackup();
        editor.setText("hello world");
        editor.setSelectionWidth(7);
        System.out.println(editor);
        command.undo();
        System.out.println(editor);
    }
}
