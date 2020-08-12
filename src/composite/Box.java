package composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public int getPrice() {
        return items.stream().mapToInt(Item::getPrice).sum();
    }
}
