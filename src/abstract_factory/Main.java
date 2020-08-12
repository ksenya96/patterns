package abstract_factory;

import abstract_factory.factory.FurnitureFactory;
import abstract_factory.factory.ModernFurnitureFactory;
import abstract_factory.factory.VictorianFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFactory("modern").createChair().description());
        System.out.println(getFactory("victorian").createSofa().description());

    }

    private static FurnitureFactory getFactory(String style) {
        if ("modern".equals(style)) {
            return new ModernFurnitureFactory();
        }
        if ("victorian".equals(style)) {
            return new VictorianFurnitureFactory();
        }
        return null;
    }
}
