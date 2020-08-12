package adapter;

public class SquarePegAdapter extends RoundPeg {

    public SquarePegAdapter(SquarePeg squarePeg) {
        super((int)(squarePeg.getWidth() * Math.sqrt(2) / 2));
    }
}
