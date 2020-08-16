package visitor;

public class Visitor {
    public void visit(JsonElement jsonElement) {
        System.out.println("Print json element");
    }

    public void visit(XmlElement xmlElement) {
        System.out.println("Print xml element");
    }
}
