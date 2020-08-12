package flyweight;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(5, 2, "береза", "белая", "черная");
        forest.plantTree(7, 8, "дуб", "коричневый", "зеленый");
        forest.plantTree(1, 5, "береза", "белая", "черная");

        forest.draw("лес");
    }
}
