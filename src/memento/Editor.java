package memento;

public class Editor {
    private String text;
    private int curX, curY;
    private int selectionWidth;

    public Editor(String text, int curX, int curY, int selectionWidth) {
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.selectionWidth = selectionWidth;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCursor(int x, int y) {
        curX = x;
        curY = y;
    }

    public void setSelectionWidth(int selectionWidth) {
        this.selectionWidth = selectionWidth;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this, text, curX, curY, selectionWidth);
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                ", curX=" + curX +
                ", curY=" + curY +
                ", selectionWidth=" + selectionWidth +
                '}';
    }
}
