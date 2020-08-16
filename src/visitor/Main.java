package visitor;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        document.addElement(new JsonElement());
        document.addElement(new JsonElement());
        document.addElement(new XmlElement());
        document.accept(new Visitor());
    }
}
