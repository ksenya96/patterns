package adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        System.out.println(hole.fits(peg)); //true

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        System.out.println(hole.fits(new SquarePegAdapter(smallSquarePeg))); //true
        System.out.println(hole.fits(new SquarePegAdapter(largeSquarePeg))); //false
    }
}
