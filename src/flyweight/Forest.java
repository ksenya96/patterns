package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType treeType = TreeFactory.getTreeType(name, color, texture);
        trees.add(new Tree(x, y, treeType));
    }

    public void draw(String canvas) {
        trees.forEach(t -> t.draw(canvas));
    }
}
