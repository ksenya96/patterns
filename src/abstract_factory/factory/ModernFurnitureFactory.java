package abstract_factory.factory;

import abstract_factory.furniture.Chair;
import abstract_factory.furniture.ModernChair;
import abstract_factory.furniture.ModernSofa;
import abstract_factory.furniture.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        System.out.println("Create modern chair");
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Create modern sofa");
        return new ModernSofa();
    }
}
