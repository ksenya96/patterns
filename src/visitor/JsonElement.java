package visitor;

import java.util.ArrayList;
import java.util.List;

public class JsonElement extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
