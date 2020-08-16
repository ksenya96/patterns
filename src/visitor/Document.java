package visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {
    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    @Override
    public void accept(Visitor visitor) {
        elements.forEach(el -> el.accept(visitor));
    }
}
